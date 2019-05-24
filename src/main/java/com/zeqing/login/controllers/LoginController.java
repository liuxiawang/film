package com.zeqing.login.controllers;

import com.zeqing.login.dto.User;
import com.zeqing.login.services.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 登录接口

@RestController
@RequestMapping(value = "/v1")
public class LoginController {

    @Autowired
    private ILoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public User login(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user = loginService.queryUserByNameAndPwd(username, password);
        if (user != null) {
            return user;
        }
        return null;
    }


}
