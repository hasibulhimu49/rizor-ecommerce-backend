package com.business.rizor_ecommerce_api.auth.service;

import com.business.rizor_ecommerce_api.auth.dto.request.LoginRequest;
import com.business.rizor_ecommerce_api.auth.dto.request.RegisterRequest;
import com.business.rizor_ecommerce_api.auth.dto.response.AuthResponse;
import com.business.rizor_ecommerce_api.auth.dto.response.RegisterResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public interface AuthService {
    public RegisterResponse register(RegisterRequest request);
    public AuthResponse login(LoginRequest loginRequest);
    public void logout();
}
