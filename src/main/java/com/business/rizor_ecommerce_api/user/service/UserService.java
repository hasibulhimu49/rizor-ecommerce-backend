package com.business.rizor_ecommerce_api.user.service;

import com.business.rizor_ecommerce_api.user.dto.request.UserCreateRequestDto;
import com.business.rizor_ecommerce_api.user.dto.response.UserResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public UserResponseDto createUser(UserCreateRequestDto dto);
    public Page<UserResponseDto> getAllUser(int page);
    public UserResponseDto getUserById(Long id);
    public void deleteUser(Long id);

}
