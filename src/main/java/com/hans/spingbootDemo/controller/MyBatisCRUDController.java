package com.hans.spingbootDemo.controller;


import com.hans.spingbootDemo.domain.HansJSONResult;
import com.hans.spingbootDemo.domain.SysUser;
import com.hans.spingbootDemo.service.UserService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("mybatis")
public class MyBatisCRUDController {

    @Autowired
    private UserService userService;

    @Autowired
    private Sid sid;

    @RequestMapping("/saveUser")
    public HansJSONResult saveUser() throws Exception {
        String userId = sid.nextShort();
        SysUser user = new SysUser();
        user.setId(userId);
        user.setUsername("hans" + new Date().getTime());
        user.setPassword("pwd" + new Date().getTime());
        user.setIsDelete(0);
        user.setRegistTime(new Date());
        userService.saveUser(user);
        return HansJSONResult.ok("save success hans");
    }

    @RequestMapping("/updateUser")
    public HansJSONResult updateUser() {
        SysUser user = new SysUser();
        user.setId("181220B79S45XF3C");
        user.setUsername("hans updateUser" + new Date().getTime());
        user.setPassword("pwd updateUser" + new Date().getTime());
        user.setIsDelete(0);
        userService.updateUser(user);
        return HansJSONResult.ok("update success");
    }


    @RequestMapping("/queryUserListPaged")
    public HansJSONResult queryUserListPaged(Integer page) {
        SysUser user = new SysUser();
        if (null == page) {
            page = 1;
        }

        int pageSize = 10;

        List<SysUser> sysUsers = userService.queryUserList(user, page, pageSize);

        return HansJSONResult.ok(sysUsers);
    }

    @RequestMapping("/queryById")
    public HansJSONResult queryById(String id) {
        System.out.println("queryById");
        SysUser user = userService.queryUserById(id);
        return HansJSONResult.ok(user);
    }


    @RequestMapping("/queryUserListByCustomize")
    public HansJSONResult queryUserListByCustomize(String id) {
        SysUser user = userService.queryUserListByCustomize(id);
        return HansJSONResult.ok(user);
    }


    @RequestMapping("/saveUserTransactional")
    public HansJSONResult saveUserTransactional() {

        String userId = sid.nextShort();

        SysUser user = new SysUser();
        user.setId(userId);
        user.setUsername("hx" + new Date());
        user.setPassword("aaa123");
        user.setIsDelete(0);
        user.setRegistTime(new Date());

        userService.saveUserTransactional(user);

        return HansJSONResult.ok("保存成功");
    }


}
