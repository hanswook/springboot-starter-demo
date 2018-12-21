package com.hans.spingbootDemo.mapper;

import com.hans.spingbootDemo.domain.SysUser;

import java.util.List;

public interface SysUserMapperCustomize {

    List<SysUser> queryUserSimplyInfoById(String id);

}
