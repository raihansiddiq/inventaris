package com.toko.inventaris.controller;

import com.toko.inventaris.dto.LoginRequest;
import com.toko.inventaris.dto.LoginResponse;
import com.toko.inventaris.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Raihan a.k.a. Raihan Siddiq
Java Developer
Created on 4/14/2025 10:16 AM
@Last Modified 4/14/2025 10:16 AM
Version 1.0
*/

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authManager;
    private final JwtUtil jwtUtil;
    private final com.toko.inventaris.service.impl.AdminDetailsService adminDetailsService;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        UsernamePasswordAuthenticationToken authToken =
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword());
        authManager.authenticate(authToken);

        UserDetails user = adminDetailsService.loadUserByUsername(request.getUsername());
        String token = jwtUtil.generateToken(user.getUsername());

        return new LoginResponse(token);
    }
}
