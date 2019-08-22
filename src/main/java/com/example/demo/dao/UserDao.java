package com.example.demo.dao;
/*
 *
 *用户 DELL
 *邮箱：921017769@qq.com
 * 编码时间 ：2019/8/21
 */

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangshuangjiang
 */
public interface UserDao {

    /**
     * 用户新增
     * @param user
     */
     void addUser(User user);

    /**
     * 用户数据修改
     * @param user
     */
     void updateUser(User user);

    /**
     * 用户数据删除
     * @param id
     */
     void deleteUser(int id);

    /**
     * 根据用户名查询
     * @param name
     * @return
     */
    User findByName(String name);

    /**
     * 查询所有
     * @return
     */
    List<User> findAll();



}
