package com.ds.driver_administrator.commos;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;

import java.net.URI;

public class RequestBean implements HttpRequest {
    @Override
    public String getMethodValue() {
        return null;
    }

    @Override
    public URI getURI() {
        return null;
    }

    @Override
    public HttpHeaders getHeaders() {
        return null;
    }
}
