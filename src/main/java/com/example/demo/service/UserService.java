package com.example.demo.service;/*
 *
 *用户 DELL
 *邮箱：921017769@qq.com
 * 编码时间 ：2019/8/21
 */

import com.example.demo.bean.User;
import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangshuangjiang
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 新增
     * @param user
     */
    public void addUser(User user){
        userDao.addUser(user);
    }

    /**
     * 更新
     * @param user
     */
    public void updateUser(User user){
        userDao.updateUser(user);
    }

    /**
     * 删除
     * @param id
     */
    public void deleteUser(int id){
        userDao.deleteUser(id);
    }

    /**
     * 根据名字查询
     * @param name
     * @return
     */
   public User findByName(String name){
       User user = userDao.findByName(name);
       return user;
   }

    /**
     * 查询所有
     * @return
     */
   public List<User> finAll(){
       List<User> all = userDao.findAll();
       return all;
   }

}
