package com.blift.backend.dto;

import lombok.Data;

@Data
public class AuthRequest {
    private String email;
    private String password;
    private String role;  // "USER" or "CONSULTANT"
}
