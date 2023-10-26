package com.cba.ecommuter.mapper;

import com.cba.ecommuter.dto.RoleRequestDto;
import com.cba.ecommuter.dto.RoleResponseDto;
import com.cba.ecommuter.model.Role;
import com.cba.ecommuter.model.Status;

public class RoleMapper {

    public static RoleResponseDto toDto(Role entity) {
        RoleResponseDto responseDto = new RoleResponseDto();
        responseDto.setRoleName(entity.getRoleName());
        responseDto.setStatus(entity.getStatus().getStatusCode());
        responseDto.setId(entity.getId());
        return responseDto;
    }

    public static Role toModel(RoleRequestDto requestDto) {
        Role entity = new Role();
        entity.setRoleName(requestDto.getRoleName());
        entity.setStatus(new Status(requestDto.getStatus()));
        return entity;
    }
}
