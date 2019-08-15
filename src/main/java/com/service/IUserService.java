package com.service;

import com.bean.userinfo;

import java.util.List;

public interface IUserService {
    List<userinfo>findAll();
    int addUser(userinfo a);
    int delete(long id);
    int updateuser(userinfo a);
    userinfo userB(long id);
}
