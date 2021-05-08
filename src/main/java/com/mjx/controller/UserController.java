package com.mjx.controller;

import com.mjx.dao.User;
import com.mjx.domain.UserClass;
import com.mjx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author mjx
 * @create 2021-05-07 20:09
 */
@Controller
@RequestMapping(value="student")
public class UserController {

    @Resource
    private UserService userService;
    //注册学生
    @RequestMapping(value="/addStudent")
    public ModelAndView student(UserClass user){
        //调用service处理
        String msg = "注册失败";
        int i = userService.addUser(user);
        if(i>0)
        {
            //注册成功
            msg="学生【" + user.getUsername() + "】注册成功";
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg",msg);
        mv.setViewName("result");
        return mv;

    }
}
