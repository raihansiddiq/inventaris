package com.toko.inventaris.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Raihan a.k.a. Raihan Siddiq
Java Developer
Created on 4/14/2025 10:12 AM
@Last Modified 4/14/2025 10:12 AM
Version 1.0
*/


@Entity
@Data
public class Admin {
    @Id
    private String username;
    private String password;
}
