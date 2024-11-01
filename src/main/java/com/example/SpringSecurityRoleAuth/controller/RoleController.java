package com.example.SpringSecurityRoleAuth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {


    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String adminKaMethod()
    {
        return "I am the Admin";
    }

    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @GetMapping("/user")
    public String userKaMethod()
    {
        return "I am either the Admin or the User";
    }
}
