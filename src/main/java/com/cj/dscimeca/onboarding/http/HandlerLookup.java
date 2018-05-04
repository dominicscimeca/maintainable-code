package com.cj.dscimeca.onboarding.http;

import com.cj.dscimeca.onboarding.http.Handler;

public interface HandlerLookup {
    Handler lookupByPath(String path);
}
