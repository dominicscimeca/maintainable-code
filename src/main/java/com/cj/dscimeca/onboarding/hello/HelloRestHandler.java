package com.cj.dscimeca.onboarding.hello;

import com.cj.dscimeca.onboarding.http.Handler;

import java.util.Map;
import java.util.regex.Pattern;

public class HelloRestHandler extends Handler {
    private HelloService service = new HelloService();

    @Override
    public Pattern getPathPattern() {
        return Pattern.compile("/hello");
    }

    @Override
    protected String exec(Map<String, String> options) {
        String target = options.get("target");
        return service.hello(target);
    }
}
