package com.business.rizor_ecommerce_api.auth.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterResponse {
    private String fullName;
    private String username;
    private String email;
    private String phone;
    private String address;
}
