package com.example.jwt;

import org.springframework.web.bind.annotation.*;

@RestController
public class JwtController {

    @PostMapping("/login")
    public String login() {
        return "JWT Token: abc123xyz";
    }

    @GetMapping("/home")
    public String home() {
        return "Welcome! Authorized User";
    }
}