package com.toko.inventaris.util;


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Raihan a.k.a. Raihan Siddiq
Java Developer
Created on 4/14/2025 10:22 AM
@Last Modified 4/14/2025 10:22 AM
Version 1.0
*/


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encoded = encoder.encode("admin123");
        System.out.println(encoded);
    }
}
