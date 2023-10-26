package com.cba.ecommuter.service;

import com.cba.ecommuter.dto.PermissionResponseDto;

import java.sql.SQLException;
import java.util.List;

public interface PermissionService<T, K> extends GenericService<T, K> {

    public List<PermissionResponseDto> findAllPermissionsByUser(String username) throws SQLException;
}
