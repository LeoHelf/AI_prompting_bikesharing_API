package com.exxeta.prompting.bikesharing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RoutesController {

    @PostMapping("/register")
    public void register() {
        // TODO
    }

    @PostMapping("/login")
    public void login() {
        // TODO
    }

    @PostMapping("/logout")
    public void logout() {
        // TODO
    }

    @PostMapping("/rent/start")
    public void startRent() {
        // TODO
    }

    @PostMapping("/rent/stop")
    public void stopRent() {
        // TODO
    }

    @PostMapping("/nearest-bikes")
    public void nearestBikes() {
        // TODO
    }

    @GetMapping("/test")
    public void test() {
        // TODO
    }
}
