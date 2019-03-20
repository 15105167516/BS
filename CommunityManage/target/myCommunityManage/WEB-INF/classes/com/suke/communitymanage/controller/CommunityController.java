package com.suke.communitymanage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suke.communitymanage.bean.Community;
import com.suke.communitymanage.service.CommunityService;
import com.suke.communitymanage.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/community")
public class CommunityController {
    @Autowired
    CommunityService communityService;
    /**
     * 返回对应用户参加的社团
     */
    @RequestMapping(value = "/likeSearchJoinedCom/{mem_id}", method = RequestMethod.GET)
    public String searchLike( @PathVariable("mem_id") String mem_id,@RequestParam(value = "condition")String condition, Model model) {

        PageHelper.startPage(1, 3);
        List<Community> communities = communityService.likeSearchJoinedCom(mem_id,condition);
        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(communities, 3);
        List<Community> list = page.getList();
        model.addAttribute("list", list);
        //封装对点击查询的判断
        model.addAttribute("check", "1");
        //封装分页信息
        model.addAttribute("page", page);
        return "common_user/personal_center";

    }

    /**
     * 删除用户所在的社团关联表信息，以及用户的评价，用户的活动记录
     */
    @RequestMapping(value = "/delcommunity_byId/{userId}/{com_id}", method = RequestMethod.DELETE)
    @ResponseBody
public Msg delcommunity_byId(@PathVariable("userId") String userId,@PathVariable("com_id") Integer com_id){

        boolean b=communityService.delcommunity_byId(userId,com_id);

        if (b==true){

            return Msg.success();
        }else {
            return  Msg.fail();
        }

    }

    /**
     * 返回对应用户参加的社团
     */
    @RequestMapping(value = "/getJoinedCom/{mem_id}", method = RequestMethod.GET)
    public String getJoinedCom(@RequestParam(value = "pn", defaultValue = "1") Integer pn, @PathVariable("mem_id") String mem_id, Model model) {

// 这不是一个分页查询；
        // 引入PageHelper分页插件
        // 在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pn, 3);
        // startPage后面紧跟的这个查询就是一个分页查询
        List<Community> communities = communityService.getJoinedCom(mem_id);
        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(communities, 3);
        List<Community> list = page.getList();
        model.addAttribute("list", list);
        //封装对点击查询的判断
        model.addAttribute("check", "1");
        //封装分页信息
        model.addAttribute("page", page);
        return "common_user/personal_center";

    }

    /**
     * 返回对应的社团和用户
     */
    @RequestMapping(value = "/checkIsMember/{com_id}/{user_id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg checkIsMember(@PathVariable("com_id") Integer com_id, @PathVariable("user_id") String user_id) {
        //查出对应的社团和用户组合
        boolean b = communityService.checkIsMember(com_id, user_id);
        // System.out.print(b);
        if (b == true) {
            return Msg.success();
        } else {
            return Msg.fail();
        }

    }


    /**
     * 返回对应的社团信息
     */
    @RequestMapping(value = "/getcommunity_byId/{com_id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getCommunityById(@PathVariable("com_id") Integer com_id) {
        //查出对应的社团
        Community community = communityService.getCommunityById(com_id);

        return Msg.success().add("community", community);
    }

    /**
     * 返回所有的社团信息
     */
    @RequestMapping(value = "/communities", method = RequestMethod.GET)
    @ResponseBody

    public Msg getCommunities() {
        //查出的所有部门信息
        List<Community> list = communityService.getCommunities();
        return Msg.success().add("communities", list);
    }
}
