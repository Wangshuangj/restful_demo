package com.example.demo.controller;
/*
 *
 *用户 DELL
 *邮箱：921017769@qq.com
 * 编码时间 ：2019/8/21
 */

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangshuangjiang
 */
@RestController
@RequestMapping(value = "api/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 新增
     * @param user
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.DELETE)
    public boolean addUser(@RequestBody User user){
        System.out.println("开始新增");
        userService.addUser(user);
        return true;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public boolean delete(@RequestParam("id") int id){
        System.out.println("开始删除");
        userService.deleteUser(id);
        return true;
    }

    /**
     * 修改
     * @param user
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public boolean update(@RequestBody User user){
        System.out.println("开始更新");
        userService.updateUser(user);
        return true;
    }

    /**
     * 根据名字查询
     * @param name
     * @return
     */
    @RequestMapping(value = "/query",method = RequestMethod.GET)
    @ResponseBody
    public User query(@RequestParam("name") String name){
        System.out.println("开始查询byName");
        User user = userService.findByName(name);
        return user;
    }

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/queryAll",method = RequestMethod.GET)
    @ResponseBody
    public List<User> queryAll(){
        System.out.println("查询所有");
        List<User> list = userService.finAll();
        return list;
    }


}
