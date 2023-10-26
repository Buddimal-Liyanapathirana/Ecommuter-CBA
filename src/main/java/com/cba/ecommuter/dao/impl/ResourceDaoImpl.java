package com.cba.ecommuter.dao.impl;

import com.cba.ecommuter.dao.ResourceDao;
import com.cba.ecommuter.dto.ResourceResponseDto;
import com.cba.ecommuter.exception.NotFoundException;
import com.cba.ecommuter.mapper.ResourceMapper;
import com.cba.ecommuter.model.Resource;
import com.cba.ecommuter.repository.ResourceRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Transactional
@RequiredArgsConstructor
public class ResourceDaoImpl implements ResourceDao {

    private final ResourceRepository repository;

    @Override
    public List<ResourceResponseDto> findAll() throws Exception {
        List<Resource> entityList = repository.findAll();
        if (entityList.isEmpty()) {
            throw new NotFoundException("No Resources found");
        }
        return entityList
                .stream()
                .map(ResourceMapper::toDto)
                .collect(Collectors.toList());
    }
}
