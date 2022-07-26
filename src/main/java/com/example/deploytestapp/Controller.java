package com.example.deploytestapp;

import com.example.deploytestapp.dto.TestResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {


    @GetMapping("/hello")
    public ResponseEntity<TestResponse> getTest(){
        String response = "HELLO FROM DEPLOY TEST";

        TestResponse build = TestResponse.builder().response(response).build();
        return ResponseEntity.ok(build);
    }
}
