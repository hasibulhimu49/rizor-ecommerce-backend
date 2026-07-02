package com.business.rizor_ecommerce_api.auth.dto.response;

import com.business.rizor_ecommerce_api.user.entity.Address;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegisterResponse {
    private String fullName;
    private String username;
    private String email;
    private String phone;
    private List<Address> address;
}
