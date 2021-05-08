package com.mjx.dao;

import com.mjx.domain.UserClass;

import java.util.List;

/**
 * @author mjx
 * @create 2021-05-07 19:56
 */
public interface User {
    int insertUser(UserClass user);

    List<UserClass> selectUsers();
}
