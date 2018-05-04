package com.cj.dscimeca.onboarding.http;

import com.cj.dscimeca.onboarding.RestHandlerRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;

public class RestHandlerLookup implements HandlerLookup {
    public Handler lookupByPath(String path){
        Optional<Handler> matchedHandler = RestHandlerRegistry.handlers.stream()
                .filter(handler -> handler.getPathPattern().matcher(path).matches())
                .findFirst();

        if(matchedHandler.isPresent()){
            return matchedHandler.get();
        }else{
            throw new UnsupportedOperationException("Path doesn't match any route. 404");
        }
    }
}
