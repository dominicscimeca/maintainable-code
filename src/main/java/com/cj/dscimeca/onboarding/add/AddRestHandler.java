package com.cj.dscimeca.onboarding.add;

import com.cj.dscimeca.onboarding.http.Handler;

import java.util.Map;
import java.util.regex.Pattern;

public class AddRestHandler extends Handler {

    private AddService service = new AddService();

    @Override
    public Pattern getPathPattern() {
        return Pattern.compile("/add");
    }

    public String exec(Map<String, String> options){
        Integer left = Integer.parseInt(options.get("left"));
        Integer right = Integer.parseInt(options.get("right"));

        return service.add(left, right);
    }
}
