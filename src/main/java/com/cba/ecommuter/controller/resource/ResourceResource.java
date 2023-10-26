package com.cba.ecommuter.controller.resource;

import com.cba.ecommuter.dto.ResourceResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface ResourceResource {

    @GetMapping
    ResponseEntity<List<ResourceResponseDto>> getAll() throws Exception;
}
