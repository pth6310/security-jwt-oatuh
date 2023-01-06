package com.pth.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JwtController {


    @GetMapping("/test")
    public ResponseEntity<String> hello3() {
        return ResponseEntity.ok("test!!");
    }
}
