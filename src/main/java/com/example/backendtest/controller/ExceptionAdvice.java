package com.example.backendtest.controller;

import com.example.backendtest.model.RouteNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestControllerAdvice
class ExceptionAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RouteNotFoundException.class)
    public ResponseEntity handleRouteNotFoundException(RouteNotFoundException ex) {
        return new ResponseEntity("Route not found", BAD_REQUEST);
    }
}
