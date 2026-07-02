package com.business.rizor_ecommerce_api.user.service;

import com.business.rizor_ecommerce_api.common.exception.ResourceNotFoundException;
import com.business.rizor_ecommerce_api.user.dto.request.UserCreateRequestDto;
import com.business.rizor_ecommerce_api.user.dto.response.UserResponseDto;
import com.business.rizor_ecommerce_api.user.entity.User;
import com.business.rizor_ecommerce_api.user.mapper.UserMapper;
import com.business.rizor_ecommerce_api.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    public UserRepository repository;
    public UserMapper mapper;
   // private PasswordEncoder passwordEncoder;

    //Constructor injection
    UserServiceImpl(UserRepository repository,UserMapper mapper)
    {
        this.repository=repository;
        this.mapper=mapper;
    }


    //create User
    public UserResponseDto createUser(UserCreateRequestDto dto)
    {
        User user=mapper.toEntity(dto);
        // user.setRole(Role.USER);
       // user.setPassword(passwordEncoder.encode(dto.getPassword()));
        User saved=repository.save(user);

        return mapper.toDto(saved);
    }



    //Get All User
    public List<UserResponseDto> getAllUser()
    {
        List<User> users=repository.findAll();
        return users.stream().map(user->mapper.toDto(user)).toList();
    }


    //Get User by id
    public UserResponseDto getUserById(Long id)
    {
        User user=repository.findById(id).orElseThrow(()->new ResourceNotFoundException("Can't find any user for id: "+id));
        return mapper.toDto(user);
    }


    public void deleteUser(Long id) {
        if(!repository.existsById(id)) {
            throw new ResourceNotFoundException("Can't find any user for id: " + id);
        }
        repository.deleteById(id);
    }


}
