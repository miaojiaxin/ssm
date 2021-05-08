package com.mjx.service.impl;

import com.mjx.dao.User;
import com.mjx.domain.UserClass;
import com.mjx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author mjx
 * @create 2021-05-07 20:05
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private User userDao ;
    @Override
    public int addUser(UserClass user) {
        int i = userDao.insertUser(user);
        return i;
    }

    @Override
    public List<UserClass> findUsers() {
       return userDao.selectUsers();
    }
}
