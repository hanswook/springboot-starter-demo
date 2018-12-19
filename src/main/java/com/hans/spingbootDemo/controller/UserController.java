package com.hans.spingbootDemo.controller;


import com.hans.spingbootDemo.domain.HansJSONResult;
import com.hans.spingbootDemo.domain.ResourceHans;
import com.hans.spingbootDemo.domain.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    ResourceHans resourceHans;

    @RequestMapping("/getUser")
//    @ResponseBody
    public User showUser() {

        User user = new User();
        user.setAge(18);
        user.setBirthday(new Date());
        user.setDesc(null);
        user.setName("hans");
        user.setPassword("password");

        return user;
    }

    @RequestMapping("/getJsonUser")
    public HansJSONResult getJsonUser() {
        User user = new User();
        user.setAge(46);
        user.setBirthday(new Date());
        user.setDesc("show desc111");
        user.setName("hans");
        user.setPassword("password22222");
        return HansJSONResult.ok(user);
    }

    @RequestMapping("/getResource")
    public HansJSONResult getResource() {
        ResourceHans bean = new ResourceHans();
        BeanUtils.copyProperties(resourceHans, bean);
        return HansJSONResult.ok(bean);

    }
}
