package com.cba.ecommuter.service.impl;

import com.cba.ecommuter.dao.PermissionDao;
import com.cba.ecommuter.dto.PermissionRequestDto;
import com.cba.ecommuter.dto.PermissionResponseDto;
import com.cba.ecommuter.service.PermissionService;
import com.cba.ecommuter.util.UserBean;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PermissionServiceImpl implements PermissionService<PermissionResponseDto, PermissionRequestDto> {

    private final PermissionDao<PermissionResponseDto, PermissionRequestDto> dao;
    private final UserBean userBean;

    @Override
    public Page<PermissionResponseDto> findAll(int page, int pageSize) throws Exception {
        return dao.findAll(page, pageSize);
    }

    @Override
    public List<PermissionResponseDto> findAll() throws Exception {
        return dao.findAll();
    }

    @Override
    public Page<PermissionResponseDto> findBySearchParamLike(List<Map<String, String>> searchParamList, int page, int pageSize) throws Exception {
        return null;
    }

    @Override
    public PermissionResponseDto findById(int id) throws Exception {
        return dao.findById(id);
    }

    @Override
    public PermissionResponseDto deleteById(int id) throws Exception {
        return dao.deleteById(id);
    }

    @Override
    public void deleteByIdList(List<Integer> idList) throws Exception {
        dao.deleteByIdList(idList);
    }

    @Override
    public PermissionResponseDto updateById(int id, PermissionRequestDto requestDto) throws Exception {
        return dao.updateById(id, requestDto);
    }

    @Override
    public PermissionResponseDto create(PermissionRequestDto requestDto) throws Exception {
        return dao.create(requestDto);
    }

    @Override
    public List<PermissionResponseDto> createBulk(List<PermissionRequestDto> requestDtoList) throws Exception {
        return dao.createBulk(requestDtoList);
    }

    @Override
    public byte[] exportPdfReport() throws Exception {
        return new byte[0];
    }

    @Override
    public byte[] exportExcelReport() throws Exception {
        return new byte[0];
    }

    @Override
    public List<PermissionResponseDto> findAllPermissionsByUser(String username) throws SQLException {
        return dao.findAllPermissionsByUser(username);
    }
}
