package com.zhongruan.service.impl;

import com.zhongruan.bean.UserInfo;
import com.zhongruan.dao.IUserDao;
import com.zhongruan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;

    public List<UserInfo> findAll() {
        return userDao.findAll();
    }
}
