package com.service.impl;

import com.bean.userinfo;
import com.dao.IUserDao;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserDao userdao;
    @Override
    public List<userinfo> findAll() {
        return userdao.findAll();
    }

    @Override
    public int addUser(userinfo a)
    {
        return userdao.addUser(a);
    }

    @Override
    public int delete(long id) {
        return userdao.delete(id);
    }

    @Override
    public int updateuser(userinfo a)
    {
        return userdao.updateUser(a);
    }
    public userinfo userB(long id)
    {
        return userdao.userB(id);
    }

}
