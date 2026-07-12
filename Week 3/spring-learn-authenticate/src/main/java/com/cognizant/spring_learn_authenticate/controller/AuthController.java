package com.cognizant.spring_learn_authenticate.controller;


import com.cognizant.spring_learn_authenticate.model.AuthRequest;
import com.cognizant.spring_learn_authenticate.util.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    JwtUtil jwt;

    @PostMapping("/authenticate")

    public String authenticate(

            @RequestBody AuthRequest request) {

        if (request.getUsername().equals("admin")

                && request.getPassword().equals("admin123")) {

            return jwt.generateToken(request.getUsername());

        }

        return "Invalid User";

    }

}
