package com.cba.ecommuter.mapper;

import com.cba.ecommuter.dto.UserRequestDto;
import com.cba.ecommuter.dto.UserResponseDto;
import com.cba.ecommuter.model.Status;
import com.cba.ecommuter.model.User;
import com.cba.ecommuter.model.UserType;

public class UserMapper {
    public static UserResponseDto toDto(User entity) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setName(entity.getName());
        responseDto.setUserName(entity.getUserName());
        responseDto.setId(entity.getId());
        responseDto.setContactNo(entity.getContactNo());
        responseDto.setEmail(entity.getEmail());
        return responseDto;
    }

    public static User toModel(UserRequestDto requestDto) {
        User entity = new User();
        entity.setName(requestDto.getName());
        entity.setUserName(requestDto.getUserName());
        entity.setContactNo(requestDto.getContactNo());
        entity.setEmail(requestDto.getEmail());
        entity.setStatus(new Status(requestDto.getStatus()));
        entity.setUserType(new UserType(requestDto.getUserType()));
        return entity;
    }
}
