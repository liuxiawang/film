package com.zeqing.login.services;


import com.zeqing.login.dto.User;

public interface ILoginService {

    User queryUserByNameAndPwd(String username, String password);

}
