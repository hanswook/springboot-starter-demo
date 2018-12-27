package com.hans.spingbootDemo.service.impl;

import com.github.pagehelper.PageHelper;
import com.hans.spingbootDemo.domain.SysUser;
import com.hans.spingbootDemo.mapper.SysUserMapper;
import com.hans.spingbootDemo.mapper.SysUserMapperCustomize;
import com.hans.spingbootDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper userMapper;

    @Autowired
    private SysUserMapperCustomize sysUserMapperCustomize;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveUser(SysUser user) throws Exception {
        userMapper.insert(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateUser(SysUser user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteUser(String userId) {
        userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SysUser queryUserById(String userId) {

        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<SysUser> queryUserList(SysUser user, Integer page, int pageSize) {

// 开始分页
        PageHelper.startPage(page, pageSize);

        Example example = new Example(SysUser.class);
        Example.Criteria criteria = example.createCriteria();

//        if (!StringUtils.isEmptyOrWhitespace(user.getNickname())) {
//            criteria.andLike("nickname", "%" + user.getNickname() + "%");
//        }
        example.orderBy("registTime").desc();
        List<SysUser> userList = userMapper.selectByExample(example);

        return userList;

    }

    @Override
    public SysUser queryUserListByCustomize(String id) {

        List<SysUser> sysUsers = sysUserMapperCustomize.queryUserSimplyInfoById(id);
        if (null != sysUsers && !sysUsers.isEmpty()) {
            return sysUsers.get(0);
        }
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveUserTransactional(SysUser user) {


        userMapper.insert(user);

        int a = 1 / 0;

        user.setIsDelete(1);

        userMapper.updateByPrimaryKeySelective(user);
    }
}
