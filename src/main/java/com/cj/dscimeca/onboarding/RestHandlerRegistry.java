package com.cj.dscimeca.onboarding;

import com.cj.dscimeca.onboarding.add.AddRestHandler;
import com.cj.dscimeca.onboarding.hello.HelloRestHandler;
import com.cj.dscimeca.onboarding.http.Handler;

import java.util.HashSet;
import java.util.Set;

public class RestHandlerRegistry {
    public static Set<Handler> handlers = new HashSet<Handler>(){{
       add(new AddRestHandler());
       add(new HelloRestHandler());
    }};
}
