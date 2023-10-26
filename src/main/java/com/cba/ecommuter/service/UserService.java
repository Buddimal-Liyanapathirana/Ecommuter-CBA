package com.cba.ecommuter.service;

import com.cba.ecommuter.dto.ChangePasswordRequestDto;

public interface UserService<T, K> extends GenericService<T, K> {

    public String changePassword(ChangePasswordRequestDto requestDto) throws Exception;

}
