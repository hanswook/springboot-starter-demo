package com.hans.spingbootDemo.service;

import com.hans.spingbootDemo.domain.SysUser;

import java.util.List;

public interface UserService {

    public void saveUser(SysUser user) throws Exception;

    void updateUser(SysUser user);

    void deleteUser(String userId);

    SysUser queryUserById(String userId);

    List<SysUser> queryUserList(SysUser user, Integer page, int pageSize);

}
