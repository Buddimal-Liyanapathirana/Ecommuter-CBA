package com.cba.ecommuter.dao;

import com.cba.ecommuter.dto.ResourceResponseDto;

import java.util.List;

public interface ResourceDao {
    List<ResourceResponseDto> findAll() throws Exception;
}
