package com.cba.ecommuter.controller;

import com.cba.ecommuter.controller.resource.GenericResource;
import com.cba.ecommuter.dto.PermissionRequestDto;
import com.cba.ecommuter.dto.PermissionResponseDto;
import com.cba.ecommuter.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@Component
@RequiredArgsConstructor
//@RequestMapping("/${application.resource.permissions}")
@RequestMapping("/permissions")
public class PermissionController implements GenericResource<PermissionResponseDto, PermissionRequestDto> {


    private static final Logger logger = LoggerFactory.getLogger(PermissionController.class);

    private final GenericService<PermissionResponseDto, PermissionRequestDto> service;
    private final MessageSource messageSource;

    @Override
    public ResponseEntity<List<PermissionResponseDto>> getAllByPageWise(int page, int pageSize) throws Exception {
        Locale currentLocale = LocaleContextHolder.getLocale();
        logger.debug(messageSource.getMessage("PERMISSION_GET_ALL_DEBUG", null, currentLocale));
        try {
            Page<PermissionResponseDto> responseDtoList = service.findAll(page, pageSize);
            return ResponseEntity.ok().body(responseDtoList.getContent());
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }

    @Override
    public ResponseEntity<PermissionResponseDto> getOne(int id) throws Exception {
        Locale currentLocale = LocaleContextHolder.getLocale();
        logger.debug(messageSource.getMessage("PERMISSION_GET_ONE_DEBUG", null, currentLocale));

        try {
            PermissionResponseDto responseDto = service.findById(id);
            return ResponseEntity.ok().body(responseDto);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }

    @Override
    public ResponseEntity<List<PermissionResponseDto>> searchAllByPageWise(List<Map<String, String>> searchParamList, int page, int pageSize) throws Exception {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteOne(int id) throws Exception {
        Locale currentLocale = LocaleContextHolder.getLocale();// works only when as local statement
        logger.debug(messageSource.getMessage("PERMISSION_DELETE_ONE_DEBUG", null, currentLocale));

        try {
            PermissionResponseDto responseDto = service.deleteById(id);
            return ResponseEntity.ok().body(messageSource.getMessage("PERMISSION_DELETE_ONE_SUCCESS", null, currentLocale));
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }

    @Override
    public ResponseEntity<PermissionResponseDto> updateOne(int id, PermissionRequestDto requestDto) throws Exception {
        Locale currentLocale = LocaleContextHolder.getLocale();// works only when as local statement
        logger.debug(messageSource.getMessage("PERMISSION_UPDATE_ONE_DEBUG", null, currentLocale));
        try {
            PermissionResponseDto responseDto = service.updateById(id, requestDto);
            return ResponseEntity.ok().body(responseDto);

        } catch (Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }

    @Override
    public ResponseEntity<PermissionResponseDto> createOne(PermissionRequestDto requestDto) throws Exception {
        Locale currentLocale = LocaleContextHolder.getLocale();// works only when as local statement
        logger.debug(messageSource.getMessage("PERMISSION_CREATE_ONE_DEBUG", null, currentLocale));
        try {
            PermissionResponseDto responseDto = service.create(requestDto);
            return ResponseEntity.ok().body(responseDto);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }

    @Override
    public ResponseEntity<String> createBulk(List<PermissionRequestDto> requestDtoList) throws Exception {
        Locale currentLocale = LocaleContextHolder.getLocale();// works only when as local statement
        logger.debug(messageSource.getMessage("PERMISSION_CREATE_BULK_DEBUG", null, currentLocale));

        try {
            List<PermissionResponseDto> responseDtoList = service.createBulk(requestDtoList);
            return ResponseEntity.ok().body(messageSource.getMessage("PERMISSION_CREATE_ALL_SUCCESS", null, currentLocale));
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }

    @Override
    public ResponseEntity<String> deleteBulkByIdList(List<Integer> idList) throws Exception {
        Locale currentLocale = LocaleContextHolder.getLocale();// works only when as local statement
        logger.debug(messageSource.getMessage("PERMISSION_DELETE_BULK_DEBUG", null, currentLocale));
        try {
            service.deleteByIdList(idList);
            return ResponseEntity.ok().body(messageSource.getMessage("PERMISSION_DELETE_ALL_SUCCESS", null, currentLocale));
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }

    @Override
    public ResponseEntity<byte[]> downloadExcel() throws Exception {
        return null;
    }

    @Override
    public ResponseEntity<byte[]> downloadJasper() throws Exception {
        return null;
    }
}
