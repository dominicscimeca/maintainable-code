package com.cj.dscimeca.onboarding.http;

public class DependencyInjection {
    private HandlerLookup handlerLookup = new RestHandlerLookup();
    Dispatcher topLevelService = new Dispatcher(handlerLookup);
}
