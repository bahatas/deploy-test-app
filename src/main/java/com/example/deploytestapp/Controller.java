package com.example.deploytestapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {


    @GetMapping("/hello")
    public ResponseEntity<String> getTest(){
        String response = "HELLO FROM DEPLOY TEST";
        return ResponseEntity.ok(response);
    }
}
