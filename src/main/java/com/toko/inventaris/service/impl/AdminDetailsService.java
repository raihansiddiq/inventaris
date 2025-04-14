package com.toko.inventaris.service.impl;

import com.toko.inventaris.entity.Admin;
import com.toko.inventaris.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Raihan a.k.a. Raihan Siddiq
Java Developer
Created on 4/14/2025 10:15 AM
@Last Modified 4/14/2025 10:15 AM
Version 1.0
*/


import java.util.Collections;

@Service
@RequiredArgsConstructor
public class AdminDetailsService implements UserDetailsService {

    private final AdminRepository adminRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = adminRepository.findByUsername(username);
        if (admin == null) {
            throw new UsernameNotFoundException("Admin tidak ditemukan");
        }
        return new User(admin.getUsername(), admin.getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN")));
    }
}
