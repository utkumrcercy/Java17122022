package com.mehmetnuri.springrediscacheexample.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

import java.io.Serializable;

public class CustomeResponseEntity extends ResponseEntity implements Serializable {

    private static final long serialVersionUID = 7156526077883281625L;

    public CustomeResponseEntity(HttpStatus status) {
        super(status);
    }

    public CustomeResponseEntity(Object body, HttpStatus status) {
        super(body, status);
    }

    public CustomeResponseEntity(MultiValueMap headers, HttpStatus status) {
        super(headers, status);
    }

    public CustomeResponseEntity(Object body, MultiValueMap headers, HttpStatus status) {
        super(body, headers, status);
    }

    public CustomeResponseEntity(Object body, MultiValueMap headers, int rawStatus) {
        super(body, headers, rawStatus);
    }
}
