package com.suke.communitymanage.controller;

import com.suke.communitymanage.bean.Chairman;
import com.suke.communitymanage.bean.Member;
import com.suke.communitymanage.service.ChairmanServie;
import com.suke.communitymanage.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/chairmen")
public class ChairmanController {
    @Autowired
    ChairmanServie chairmanServie;
    //社团成员登陆
    @RequestMapping(value = "/login/{chairmanId}/{chairmanPassword}",method = RequestMethod.GET)
    @ResponseBody
    public Msg login(@PathVariable String chairmanId, @PathVariable String chairmanPassword, HttpSession session){
        //如果用户id不存在告知
        Chairman chairman=chairmanServie.hasChairman(chairmanId);

        if (chairman==null){

            return    Msg.fail().add("info","账户不存在");
        }else {
            if (  !chairman.getPassword().equals(chairmanPassword)){
                return    Msg.fail().add("info","密码错误");
            }else {
                session.setAttribute("login_user",chairman);
                return  Msg.success();
            }

        }

    }
}
