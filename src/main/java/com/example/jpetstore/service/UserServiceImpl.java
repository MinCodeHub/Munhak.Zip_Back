package com.example.jpetstore.service;

import com.example.jpetstore.dao.mybatis.MybatisMypageDao;
import com.example.jpetstore.dao.mybatis.MybatisUserDao;

public abstract class UserServiceImpl implements UserService{

    private MybatisUserDao mybatisUserDao;

    public UserServiceImpl(MybatisMypageDao mybatisMypageDao) {
        this.mybatisUserDao = mybatisUserDao;
    }

    public int updatePassword(Long id, String newPassword) {
        return mybatisUserDao.updatePassword(id, newPassword);
    }
}
