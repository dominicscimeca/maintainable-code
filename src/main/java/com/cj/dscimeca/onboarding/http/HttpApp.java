package com.cj.dscimeca.onboarding.http;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HttpApp extends HttpServlet {
    private DependencyInjection dependencyInjection = new DependencyInjection();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        dependencyInjection.topLevelService.doService(req, resp);
    }
}
