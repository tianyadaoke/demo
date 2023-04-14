package com.example.demo.config;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalConfig {
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<String> exceptionHandler(){
        return ResponseEntity.badRequest().body("Bad Request");
    }
}
