package com.zhongruan.controller;


import com.zhongruan.bean.UserInfo;
import com.zhongruan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;


    @RequestMapping("/findAll.do")
    public ModelAndView findAll() {
        List<UserInfo> userInfos = userService.findAll();
        System.out.println(userInfos);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", userInfos);
        mv.setViewName("allUser");
        return mv;
    }
}
