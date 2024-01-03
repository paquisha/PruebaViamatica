package com.grijalva.loginback.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public String userAccess() {
        return "User Content.";
    }

    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
    @GetMapping("/mod")
    @PreAuthorize("hasRole('MODERATOR')")
    public String moderatorAccess() {
        return "Moderator Board.";
    }

    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }
}
