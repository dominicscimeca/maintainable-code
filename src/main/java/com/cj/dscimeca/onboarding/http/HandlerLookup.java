package com.cj.dscimeca.onboarding.http;

public interface HandlerLookup {
    Handler lookupByPath(String path);
}
