package com.shiyanlou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.Errors;
import javax.validation.Valid;
import com.shiyanlou.entity.User;


@Controller
public class UserController {

    // 进入注册页面
    @RequestMapping(value = "/registerform")
    public String registerform(Model model) {
        User user = new User();
        user.setUsername("zjw");
        model.addAttribute("user", user);
        return "register";
    }

    // 注册请求的响应方法
    @RequestMapping(value = "/register")
    public String register(@Valid  @ModelAttribute("user") User user, Errors errors,Model model) {
        model.addAttribute("user", user);
        if(errors.hasErrors()){
            System.out.println(errors.getObjectName());
            return "register";
        }
        return "success";
    }
}

