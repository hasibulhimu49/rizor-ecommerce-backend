package com.business.rizor_ecommerce_api.user.mapper;

import com.business.rizor_ecommerce_api.user.dto.request.UserCreateRequestDto;
import com.business.rizor_ecommerce_api.user.dto.response.UserResponseDto;
import com.business.rizor_ecommerce_api.user.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserCreateRequestDto dto)
    {
        User user=new User();
        user.setFullName(dto.getFullName());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        user.setAddress(dto.getAddress());
        user.setRole(dto.getRole());
        return user ;
    }

    public UserResponseDto toDto(User user)
    {
        UserResponseDto responseDto=new UserResponseDto();
        responseDto.setFullName(user.getFullName());
        responseDto.setUsername(user.getUsername());
        responseDto.setEmail(user.getEmail());
        responseDto.setRole(user.getRole());
        responseDto.setPhone(user.getPhone());
        responseDto.setAddress(user.getAddress());
        return responseDto;
    }
}
