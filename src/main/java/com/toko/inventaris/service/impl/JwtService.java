package com.toko.inventaris.service.impl;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Service;

import java.util.Date;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Raihan a.k.a. Raihan Siddiq
Java Developer
Created on 4/16/2025 11:40 AM
@Last Modified 4/16/2025 11:40 AM
Version 1.0
*/


@Service
public class JwtService {
    private final String secretKey = "rahasia"; // ganti jadi lebih aman di production
    private final long expiration = 86400000; // 1 hari

    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
    }
}
