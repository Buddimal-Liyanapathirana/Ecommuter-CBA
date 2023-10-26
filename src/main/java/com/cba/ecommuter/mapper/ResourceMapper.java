package com.cba.ecommuter.mapper;

import com.cba.ecommuter.dto.ResourceResponseDto;
import com.cba.ecommuter.model.Resource;

public class ResourceMapper {

    public static ResourceResponseDto toDto(Resource entity) {
        ResourceResponseDto responseDto = new ResourceResponseDto();
        responseDto.setId(entity.getId());
        responseDto.setName(entity.getName());
        return responseDto;
    }

}
