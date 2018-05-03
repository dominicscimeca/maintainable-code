package com.cj.dscimeca.onboarding;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

public class HttpServletRequestNotImplemented implements HttpServletRequest {
    public String getAuthType() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Cookie[] getCookies() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public long getDateHeader(String name) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getHeader(String name) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Enumeration<String> getHeaders(String name) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Enumeration<String> getHeaderNames() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public int getIntHeader(String name) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getMethod() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getPathInfo() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getPathTranslated() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getContextPath() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getQueryString() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getRemoteUser() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public boolean isUserInRole(String role) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Principal getUserPrincipal() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getRequestedSessionId() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getRequestURI() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public StringBuffer getRequestURL() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getServletPath() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public HttpSession getSession(boolean create) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public HttpSession getSession() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public boolean isRequestedSessionIdValid() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public boolean isRequestedSessionIdFromCookie() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public boolean isRequestedSessionIdFromURL() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public boolean isRequestedSessionIdFromUrl() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public boolean authenticate(HttpServletResponse response) throws IOException, ServletException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void login(String username, String password) throws ServletException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void logout() throws ServletException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Collection<Part> getParts() throws IOException, ServletException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Part getPart(String name) throws IOException, ServletException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Object getAttribute(String name) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Enumeration<String> getAttributeNames() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getCharacterEncoding() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setCharacterEncoding(String env) throws UnsupportedEncodingException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public int getContentLength() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getContentType() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public ServletInputStream getInputStream() throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getParameter(String name) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Enumeration<String> getParameterNames() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String[] getParameterValues(String name) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Map<String, String[]> getParameterMap() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getProtocol() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getScheme() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getServerName() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public int getServerPort() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public BufferedReader getReader() throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getRemoteAddr() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getRemoteHost() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setAttribute(String name, Object o) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void removeAttribute(String name) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Locale getLocale() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Enumeration<Locale> getLocales() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public boolean isSecure() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public RequestDispatcher getRequestDispatcher(String path) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getRealPath(String path) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public int getRemotePort() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getLocalName() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getLocalAddr() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public int getLocalPort() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public ServletContext getServletContext() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public AsyncContext startAsync() throws IllegalStateException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse) throws IllegalStateException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public boolean isAsyncStarted() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public boolean isAsyncSupported() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public AsyncContext getAsyncContext() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public DispatcherType getDispatcherType() {
        throw new UnsupportedOperationException("Not Implemented!");
    }
}
