package com.cba.ecommuter.service;

import com.cba.ecommuter.dto.ResourceResponseDto;

import java.util.List;

public interface ResourceService {
    List<ResourceResponseDto> findAll() throws Exception;
}
