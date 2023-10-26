package com.cba.ecommuter.mapper;

import com.cba.ecommuter.dto.PermissionRequestDto;
import com.cba.ecommuter.dto.PermissionResponseDto;
import com.cba.ecommuter.model.Permission;
import com.cba.ecommuter.model.Resource;
import com.cba.ecommuter.model.Role;

public class PermissionMapper {

    public static PermissionResponseDto toDto(Permission entity) {
        PermissionResponseDto responseDto = new PermissionResponseDto();
        responseDto.setId(entity.getId());
        responseDto.setCreated(entity.getCreated().intValue());
        responseDto.setDeleted(entity.getDeleted().intValue());
        responseDto.setReadd(entity.getReadd().intValue());
        responseDto.setUpdated(entity.getUpdated().intValue());
        responseDto.setRoleId(entity.getRole().getId());
        responseDto.setRoleName(entity.getRole().getRoleName());
        responseDto.setResourceId(entity.getResource().getId());
        responseDto.setResourceName(entity.getResource().getName());
        return responseDto;
    }

    public static Permission toModel(PermissionRequestDto requestDto) {
        Permission entity = new Permission();
        entity.setRole(new Role(requestDto.getRoleId()));
        entity.setResource(new Resource(requestDto.getResourceId()));
        entity.setCreated(requestDto.getCreated().byteValue());
        entity.setUpdated(requestDto.getUpdated().byteValue());
        entity.setDeleted(requestDto.getDeleted().byteValue());
        entity.setReadd(requestDto.getReadd().byteValue());
        return entity;
    }
}
