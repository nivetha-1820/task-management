package com.users.userService.controller;

import com.users.userService.dto.CreateUserRequestDTO;
import com.users.userService.dto.CreateUserResponseDTO;
import com.users.userService.mapper.UserMapper;
import com.users.userService.model.User;
import com.users.userService.service.UserRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "usersController")
@RequestMapping("/api/v1")
public class UsersController {

    @Autowired
    private UserRequestService userRequestService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/users")
    public List<User> getUsers() {
        return  userRequestService.fetchAllUsers();
    }

    @PostMapping("/users/update")
    public CreateUserResponseDTO updateUser(@RequestBody CreateUserRequestDTO userDTO) {

        User user = userRequestService.createUser(userDTO);
        return userMapper.toResponseDto(user);
    }

}
