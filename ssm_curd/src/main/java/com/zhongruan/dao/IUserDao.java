package com.zhongruan.dao;

import com.zhongruan.bean.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {

    public List<UserInfo> findAll();
}
