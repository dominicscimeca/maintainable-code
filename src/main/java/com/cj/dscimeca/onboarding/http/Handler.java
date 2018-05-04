package com.cj.dscimeca.onboarding.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class  Handler {

    protected Map<String, String> getMapFromQueryString(String queryString) {
        String[] queryParams = queryString.split("&");

        Function<String, String> keyMapper = s -> s.split("=")[0];
        Function<String, String> valueMapper = s -> s.split("=")[1];

        return Stream.of(queryParams).collect(Collectors.toMap(keyMapper, valueMapper));
    }

    protected void writeResponse(String body, HttpServletResponse resp){
        PrintWriter writer = getWriter(resp);
        writer.print(body);
    }

    private PrintWriter getWriter(HttpServletResponse resp){
        try {
            return resp.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public abstract Pattern getPathPattern();
    
    public void handle(HttpServletRequest req, HttpServletResponse resp) {
        String queryString = req.getQueryString();
        Map<String, String> queryMap = getMapFromQueryString(queryString);

        String result = exec(queryMap);

        writeResponse(result, resp);
    }

    protected abstract String exec(Map<String,String> queryMap);
}
