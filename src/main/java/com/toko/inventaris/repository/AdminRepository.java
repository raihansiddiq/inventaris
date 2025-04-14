package com.toko.inventaris.repository;

import com.toko.inventaris.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Raihan a.k.a. Raihan Siddiq
Java Developer
Created on 4/14/2025 10:13 AM
@Last Modified 4/14/2025 10:13 AM
Version 1.0
*/

public interface AdminRepository extends JpaRepository<Admin, String> {
    Admin findByUsername(String username);
}