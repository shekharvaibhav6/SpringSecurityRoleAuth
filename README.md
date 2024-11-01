Spring Security Role Based Authentication

This project demonstrates role-based access control with Spring Security. It showcases secure endpoint configuration based on user roles (ADMIN and USER) and uses in-memory authentication to manage users.

📋 Project Overview

The SpringSecurityRoleAuthentication application includes:

Authentication and authorization based on user roles.
Role-restricted access to specific endpoints.
Password encryption using BCrypt for secure user credential handling.
🚀 Features

Role-Based Access Control:
Only ADMIN users can access sensitive endpoints, such as /transfer and /admin.
Both USER and ADMIN roles can access other endpoints, such as /update and /user.
In-Memory User Store:
Simulated user roles with in-memory user details management for quick and easy testing.
Password Encryption:
Uses BCryptPasswordEncoder for hashing passwords.
🛠️ Technology Stack

Java
Spring Boot
Spring Security

🔑 Endpoints

Endpoint	Method	Role Required	Description
/admin	GET	ADMIN	Accessed by ADMIN only
/user	GET	USER, ADMIN	Accessed by USER or ADMIN
/transfer	GET	ADMIN	ADMIN-only transfer functionality
/update	GET	USER, ADMIN	Accessible to both USER and ADMIN
