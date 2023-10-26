package com.cba.ecommuter.dao;

import com.cba.ecommuter.dto.ChangePasswordRequestDto;

public interface UserDao<T, K> extends GenericDao<T, K> {

    String changePassword(ChangePasswordRequestDto requestDto, String userName) throws Exception;

}
