package com.cj.dscimeca.onboarding.http;

import com.cj.dscimeca.onboarding.HttpServletRequestNotImplemented;
import com.cj.dscimeca.onboarding.HttpServletResponseNotImplemented;
import com.cj.dscimeca.onboarding.http.HttpApp;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class HttpAppTest {

    @Test
    public void greeting() throws ServletException, IOException {
        // given
        HttpApp app = new HttpApp();
        String path = "/hello";
        String query = "target=world";
        HttpServletRequest request = new RequestStub(path, query);
        ResponseStub response = new ResponseStub();

        // when
        app.service(request, response);

        // then
        String body = extractBodyFromResponse(response);
        assertEquals("Hello, world!", body);
    }

    @Test
    public void addition() throws ServletException, IOException {
        // given
        HttpApp app = new HttpApp();
        String path = "/add";
        String query = "left=10&right=15";
        HttpServletRequest request = new RequestStub(path, query);
        ResponseStub response = new ResponseStub();

        // when
        app.service(request, response);

        // then
        String body = extractBodyFromResponse(response);
        assertEquals("10 + 15 = 25", body);
    }

    private String extractBodyFromResponse(ResponseStub response) {
        return response.writer.getBuffer().toString();
    }

    class ResponseStub extends HttpServletResponseNotImplemented {
        final StringWriter writer = new StringWriter();
        @Override
        public PrintWriter getWriter() throws IOException {
            return new PrintWriter(writer);
        }
    }

    class RequestStub extends HttpServletRequestNotImplemented {
        final String path;
        final String query;

        public RequestStub(String path, String query) {
            this.path = path;
            this.query = query;
        }

        @Override
        public String getPathInfo() {
            return path;
        }

        @Override
        public String getQueryString() {
            return query;
        }
    }
}
