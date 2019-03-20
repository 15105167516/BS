package com.suke.communitymanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/jump")
public class ToOtherJspController {

    @RequestMapping("/personal_center")
    public ModelAndView ToPersonal_center(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("common_user/personal_center");
        return modelAndView;
    }
    @RequestMapping("/loginjsp")
    public String ToLoginJsp(){

        return "memberLogin";
    }
}
