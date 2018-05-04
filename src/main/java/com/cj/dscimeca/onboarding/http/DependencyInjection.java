package com.cj.dscimeca.onboarding.http;

public class DependencyInjection {
    HandlerLookup handlerLookup = new RestHandlerLookup();
    Dispatcher topLevelService = new Dispatcher(handlerLookup);
}
