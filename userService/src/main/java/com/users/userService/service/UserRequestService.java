package com.users.userService.service;

import com.users.userService.dto.CreateUserRequestDTO;
import com.users.userService.mapper.UserMapper;
import com.users.userService.model.User;
import com.users.userService.repository.UserServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRequestService {

    @Autowired
    private UserServiceRepository userServiceRepository;
    @Autowired
    private UserMapper userMapper;

    public List<User> fetchAllUsers()
    {
        return userServiceRepository.findAll();
    }

    public User createUser(CreateUserRequestDTO user)
    {
        User userEntity = userMapper.toEntity(user);
        return userServiceRepository.save(userEntity);
    }

   /* private User mapuserDtoToUser(CreateUserRequestDTO userDto)
    {
        User user = new User();
        user.setName(userDto.getName());
        user.setEmailId(userDto.getEmailId());
        user.setPassword(userDto.getPassword());
        user.setPhoneNumber(user.getPhoneNumber());
        user.setUserType(userDto.getUserType());
        return user;
    }*/
}
