package com.zeqing.login.mappers;

import com.zeqing.login.dto.User;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {

    User queryUserByNameAndPwd(@Param("username") String username, @Param("password") String password);

}
