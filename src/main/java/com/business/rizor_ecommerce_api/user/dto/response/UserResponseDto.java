package com.business.rizor_ecommerce_api.user.dto.response;

import com.business.rizor_ecommerce_api.common.enums.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {

    private String fullName;
    @NotNull(message = "Username Cannot be null")
    private String username;

    private String email;
    private String phone;
    private String address;

    @Enumerated(EnumType.STRING)
    private Role role;

}
