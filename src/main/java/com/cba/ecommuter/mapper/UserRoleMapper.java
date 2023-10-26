package com.cba.ecommuter.mapper;

import com.cba.ecommuter.dto.UserRoleRequestDto;
import com.cba.ecommuter.dto.UserRoleResponseDto;
import com.cba.ecommuter.model.Role;
import com.cba.ecommuter.model.Status;
import com.cba.ecommuter.model.User;
import com.cba.ecommuter.model.UserRole;

public class UserRoleMapper {

    public static UserRoleResponseDto toDto(UserRole entity) {
        UserRoleResponseDto responseDto = new UserRoleResponseDto();
        responseDto.setUserId(entity.getUserByUserId().getId());
        responseDto.setRoleId(entity.getRole().getId());
        responseDto.setStatus(entity.getStatus().getStatusCode());
        responseDto.setId(entity.getId());
        return responseDto;
    }

    public static UserRole toModel(UserRoleRequestDto requestDto) {
        UserRole entity = new UserRole();
        entity.setUserByUserId(new User(requestDto.getUserId()));
        entity.setRole(new Role(requestDto.getRoleId()));
        entity.setStatus(new Status(requestDto.getStatus()));
        return entity;
    }
}
