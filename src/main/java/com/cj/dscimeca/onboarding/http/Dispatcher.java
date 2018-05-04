package com.cj.dscimeca.onboarding.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class Dispatcher {
    private final HandlerLookup handlerLookup;

    Dispatcher(HandlerLookup handlerLookup) {
        this.handlerLookup = handlerLookup;
    }

    void doService(HttpServletRequest req, HttpServletResponse resp) {
        String path = req.getPathInfo();
        Handler handler = handlerLookup.lookupByPath(path);
        handler.handle(req, resp);
    }
}
