package com.business.rizor_ecommerce_api.auth.mapper;

import com.business.rizor_ecommerce_api.auth.dto.request.RegisterRequest;
import com.business.rizor_ecommerce_api.auth.dto.response.AuthResponse;
import com.business.rizor_ecommerce_api.auth.dto.response.RegisterResponse;
import com.business.rizor_ecommerce_api.user.dto.response.UserResponseDto;
import com.business.rizor_ecommerce_api.user.entity.User;
import lombok.AllArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
//@Component
public interface /*class*/ RegisterMapper {

    //@Mapping(source = "userName",target = "username") if field name is different
    //@Mapping(source = "userEmail",target = "username")
    public User toEntity(RegisterRequest requestDto);
   /* {
        User user= new User();

        user.setUsername(requestDto.getUsername());
        user.setEmail(requestDto.getEmail());
        return user;
    }*/

    public RegisterResponse toDto(User user);
   /* {
        RegisterResponse response=new RegisterResponse();
        response.setUsername(user.getUsername());
        response.setEmail(user.getEmail());
        return response;

    }*/


}
