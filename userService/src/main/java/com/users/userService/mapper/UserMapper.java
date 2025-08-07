package com.users.userService.mapper;

import com.users.userService.dto.CreateUserRequestDTO;
import com.users.userService.dto.CreateUserResponseDTO;
import com.users.userService.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(CreateUserRequestDTO createUserRequestDTO);

    CreateUserResponseDTO toResponseDto(User user);
}
