package com.cba.ecommuter.service.impl;

import com.cba.ecommuter.dao.ResourceDao;
import com.cba.ecommuter.dto.ResourceResponseDto;
import com.cba.ecommuter.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResourceServiceImpl implements ResourceService {

    private final ResourceDao dao;

    @Override
    public List<ResourceResponseDto> findAll() throws Exception {
        return dao.findAll();
    }
}
