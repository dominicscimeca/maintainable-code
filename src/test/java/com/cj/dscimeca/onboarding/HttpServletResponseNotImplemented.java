package com.cj.dscimeca.onboarding;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;

public class HttpServletResponseNotImplemented implements HttpServletResponse {
    public void addCookie(Cookie cookie) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public boolean containsHeader(String name) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String encodeURL(String url) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String encodeRedirectURL(String url) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String encodeUrl(String url) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String encodeRedirectUrl(String url) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void sendError(int sc, String msg) throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void sendError(int sc) throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void sendRedirect(String location) throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setDateHeader(String name, long date) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void addDateHeader(String name, long date) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setHeader(String name, String value) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void addHeader(String name, String value) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setIntHeader(String name, int value) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void addIntHeader(String name, int value) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setStatus(int sc) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setStatus(int sc, String sm) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public int getStatus() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getHeader(String name) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Collection<String> getHeaders(String name) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Collection<String> getHeaderNames() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getCharacterEncoding() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public String getContentType() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public ServletOutputStream getOutputStream() throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public PrintWriter getWriter() throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setCharacterEncoding(String charset) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setContentLength(int len) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setContentType(String type) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setBufferSize(int size) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public int getBufferSize() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void flushBuffer() throws IOException {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void resetBuffer() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public boolean isCommitted() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void reset() {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public void setLocale(Locale loc) {
        throw new UnsupportedOperationException("Not Implemented!");
    }

    public Locale getLocale() {
        throw new UnsupportedOperationException("Not Implemented!");
    }
}
