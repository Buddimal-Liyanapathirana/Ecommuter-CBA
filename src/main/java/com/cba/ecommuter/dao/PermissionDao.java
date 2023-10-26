package com.cba.ecommuter.dao;

import com.cba.ecommuter.dto.PermissionResponseDto;

import java.sql.SQLException;
import java.util.List;

public interface PermissionDao<T, K> extends GenericDao<T, K> {

    public List<PermissionResponseDto> findAllPermissionsByUser(String username) throws SQLException;
}
