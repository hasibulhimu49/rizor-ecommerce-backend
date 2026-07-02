package com.business.rizor_ecommerce_api.user.dto.request;

import com.business.rizor_ecommerce_api.common.enums.Role;
import com.business.rizor_ecommerce_api.user.entity.Address;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class UserCreateRequestDto {

    private String fullName;
    @NotBlank(message = "Username cannot be empty")
    @Pattern(
            regexp = "^[a-zA-Z][a-zA-Z0-9]{2,19}$",
            message = "Username must start with a letter and be 3–20 characters long"
    )
    @Column(name="username", unique = true, nullable = false)
    private String username;
    private String password;
    @Email
    private String email;
    private String phone;
    private List<Address> address;

    private Role role;
}
