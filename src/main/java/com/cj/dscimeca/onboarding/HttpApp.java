package com.cj.dscimeca.onboarding;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HttpApp extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        String queryString = req.getQueryString();

        Map<String,String> queryMap = getMapFromQueryString(queryString);
        String path = req.getPathInfo();
        if("/hello".equals(path)){
            String target = queryMap.get("target");
            writer.print("Hello, " + target + "!");
        } else {
            String leftString = queryMap.get("left");
            String rightString = queryMap.get("right");
            int left = Integer.parseInt(leftString);
            int right = Integer.parseInt(rightString);
            int answer = left + right;
            String formatted = String.format("%d + %d = %d", left, right, answer);
            writer.print(formatted);
        }
    }

    private Map<String, String> getMapFromQueryString(String queryString) {
        String[] queryParams = queryString.split("&");

        Function<String, String> keyMapper = s -> s.split("=")[0];
        Function<String, String> valueMapper = s -> s.split("=")[1];

        return Stream.of(queryParams).collect(Collectors.toMap(keyMapper, valueMapper));
    }
}
