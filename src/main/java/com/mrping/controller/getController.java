package com.mrping.controller;

import com.mrping.EntityClass.User;
import com.mrping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api")
public class getController {

    @Autowired
    private UserService userService;



    @RequestMapping("/saves")
    public void save() {

        User user = User.builder().id(6).username("张三").password("123").build();
        userService.save(user);

    }

    @ResponseBody
    @RequestMapping("/findAlls")
    public List<User> findAll() {
        return userService.findAll();
    }
}
