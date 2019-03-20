package com.suke.communitymanage.controller;

import com.suke.communitymanage.bean.SuManage;
import com.suke.communitymanage.service.SuManageService;
import com.suke.communitymanage.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admins")
public class SuManageController {
    @Autowired
    SuManageService suManageService;
    //社团成员登陆
    @RequestMapping(value = "/login/{adminName}/{adminPassword}",method = RequestMethod.GET)
    @ResponseBody
    public Msg login(@PathVariable String adminName, @PathVariable String adminPassword, HttpSession session){
        //如果用户id不存在告知
        List<SuManage> list =suManageService.hasSuManage(adminName);

        if (list.size()==0){

            return    Msg.fail().add("info","管理员账号不存在！");
        }else {
            if (  !list.get(0).getSuPassword().equals(adminPassword)){
                return    Msg.fail().add("info","密码错误");
            }else {
                session.setAttribute("suManage",list.get(0));
                return  Msg.success();
            }

        }

    }

}
