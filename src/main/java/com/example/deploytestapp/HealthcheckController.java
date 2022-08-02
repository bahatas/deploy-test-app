package com.example.deploytestapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping
class HealthcheckController {

    // Your solution

    @GetMapping(value = "/healthcheck")
    public ResponseEntity<Status> healthcheck(@RequestParam("format") String format) {


        if (format.equals("short")) {
            return ResponseEntity.ok(new Status("OK"));
        }
        if (format.equals("long")) {
            return ResponseEntity.ok(new Status("OK", "now"));
        }
        return new ResponseEntity<>(new Status("Bad Request"), HttpStatus.BAD_REQUEST);
    }

    @PutMapping(value = "/healthcheck")
    public void healthcheckPut() {
        return;
    }

    @PostMapping(value = "/healthcheck")
    public void healthcheckPost() {
        return;
    }


    @DeleteMapping(value = "/healthcheck")
    public void healthcheckDelete() {
        return;
    }

    class Status{

        String status;
        String currentTime;
        Status(String string){
            this.status=string;
        }

        public Status(String status, String currentTime) {
            this.status = status;
            this.currentTime = ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT);;
        }
    }

}