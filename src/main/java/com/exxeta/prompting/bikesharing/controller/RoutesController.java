package com.exxeta.prompting.bikesharing.controller;

import com.exxeta.prompting.bikesharing.model.Bike;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("api")
public class RoutesController {

    @PostMapping("/register")
    public ResponseEntity<Void> register() {
        // TODO
        return notImplementedResponse();
    }

    @PostMapping("/login")
    public ResponseEntity<Void> login() {
        // TODO
        return notImplementedResponse();
    }

    @PostMapping("/logout")
    public ResponseEntity<Void> logout() {
        // TODO
        return notImplementedResponse();
    }

    @PostMapping("/rent/start")
    public ResponseEntity<Void> startRent() {
        // TODO
        return notImplementedResponse();
    }

    @PostMapping("/rent/stop")
    public ResponseEntity<Void> stopRent() {
        // TODO
        return notImplementedResponse();
    }

    @GetMapping("/nearest-bikes")
    public ResponseEntity<Collection<Bike>> nearestBikes() {
        // TODO
        return notImplementedResponse();
    }

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello World");
    }

    private static <T> ResponseEntity<T> notImplementedResponse() {
        return ResponseEntity.status(HttpStatusCode.valueOf(501)).build();
    }
}
