package com.dao;

import com.bean.userinfo;

import java.util.List;

public interface IUserDao {
   public List<userinfo> findAll();

   public int addUser(userinfo user);

   public  int updateUser(userinfo user);

   userinfo userB(long id);

   int delete(long id);

}
