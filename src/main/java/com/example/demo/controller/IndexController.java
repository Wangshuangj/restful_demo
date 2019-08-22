package com.example.demo.controller;/*
 *
 *用户 DELL
 *邮箱：921017769@qq.com
 * 编码时间 ：2019/8/21
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangshuangjiang
 */
@RestController
public class IndexController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
