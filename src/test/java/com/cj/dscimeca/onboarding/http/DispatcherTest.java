package com.cj.dscimeca.onboarding.http;

import com.cj.dscimeca.onboarding.HttpServletRequestNotImplemented;
import com.cj.dscimeca.onboarding.HttpServletResponseNotImplemented;
import com.cj.dscimeca.onboarding.http.Dispatcher;
import com.cj.dscimeca.onboarding.http.Handler;
import com.cj.dscimeca.onboarding.http.HandlerLookup;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Map;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class DispatcherTest {
    @Test
    public void dispatchesToCorrectHandler(){
        // given
        String path = "the-path";

        HandlerLookupStub handlerLookup = new HandlerLookupStub();
        Dispatcher dispatcher = new Dispatcher(handlerLookup);
        HttpServletRequest request = new StubRequest(path);
        HttpServletResponse response = new StubResponse();
        // when
        dispatcher.doService(request, response);
        // then
        assertEquals(path, handlerLookup.invokedPath);
        assertEquals(1, handlerLookup.handler.invocationCount);
        assertEquals(request, handlerLookup.handler.req);
        assertEquals(response, handlerLookup.handler.resp);
    }

    class StubRequest extends HttpServletRequestNotImplemented {
        final String path;

        public StubRequest(String path) {
            this.path = path;
        }

        @Override
        public String getPathInfo() {
            return path;
        }
    }
    class StubResponse extends HttpServletResponseNotImplemented {

    }

    class HandlerLookupStub implements HandlerLookup {
        private String invokedPath;
        HandlerStub handler = new HandlerStub();

        @Override
        public Handler lookupByPath(String path) {
            invokedPath = path;
            return handler;
        }
    }

    class HandlerStub extends Handler{
        int invocationCount;
        HttpServletRequest req;
        HttpServletResponse resp;

        @Override
        public void handle(HttpServletRequest req, HttpServletResponse resp) {
            this.req = req;
            this.resp = resp;
            invocationCount++;
        }

        @Override
        protected String exec(Map<String, String> queryMap) {
            throw new UnsupportedOperationException("Not Implemented!");
        }

        @Override
        public Pattern getPathPattern() {
            return Pattern.compile("the-path");
        }
    }
}
