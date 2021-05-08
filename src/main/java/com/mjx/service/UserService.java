package com.mjx.service;

import com.mjx.dao.User;
import com.mjx.domain.UserClass;

import java.util.List;

/**
 * @author mjx
 * @create 2021-05-07 20:04
 */
public interface UserService {
    int addUser(UserClass user);

    List<UserClass> findUsers();
}
