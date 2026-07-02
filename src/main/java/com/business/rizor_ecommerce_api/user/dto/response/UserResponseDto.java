package com.business.rizor_ecommerce_api.user.dto.response;

import com.business.rizor_ecommerce_api.common.enums.Role;
import com.business.rizor_ecommerce_api.user.entity.Address;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserResponseDto {

    private String fullName;
    @NotNull(message = "Username Cannot be null")
    private String username;

    private String email;
    private String phone;
    private List<Address> address;

    @Enumerated(EnumType.STRING)
    private Role role;

}
