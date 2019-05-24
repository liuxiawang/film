package com.zeqing.login.services.impl;

import com.zeqing.login.dto.User;
import com.zeqing.login.mappers.LoginMapper;
import com.zeqing.login.services.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User queryUserByNameAndPwd(String username, String password) {
        return loginMapper.queryUserByNameAndPwd(username, password);
    }
}
