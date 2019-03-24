package com.suke.communitymanage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suke.communitymanage.bean.ApplyCommunity;
import com.suke.communitymanage.bean.ApplyCommunityKey;
import com.suke.communitymanage.bean.Community;
import com.suke.communitymanage.service.ApplyCommunityService;
import com.suke.communitymanage.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/applycommunity")
public class ApplyCommunityController {
    @Autowired
    ApplyCommunityService applyCommunityService;


    /**
     * 模糊查找是否有对应的用户申请的所有社团；
     */
    @RequestMapping(value = "/LikeSearchApplyCommunity/{user_id}/{condition}",method = RequestMethod.GET)
    public String LikeSearchApplyCommunity(@RequestParam(value = "pn", defaultValue = "1")Integer pn,@PathVariable("user_id")String user_id,@PathVariable("condition")String condition, Model model){
        Map paramMap = new HashMap();

        paramMap.put("temUserId", user_id);
        paramMap.put("condition", condition);
        PageHelper.startPage(pn, 3);
        List<ApplyCommunity> applyCommunities = applyCommunityService.LikeSearchApplyCommunity(paramMap);
        PageInfo page = new PageInfo(applyCommunities, 3);
        List<ApplyCommunity> list = page.getList();
        model.addAttribute("temp_apply_list", list);
        //判断是否点击搜索按钮
        model.addAttribute("LikeCheck", 1);
        //保存查询的条件
        model.addAttribute("condition", condition);
        //封装对点击查询的判断
        model.addAttribute("check", "2");
        //封装分页信息
        model.addAttribute("page", page);
        return "common_user/personal_center";
    }




    /**
     * 催促处理，也就是增加status的值；
     */
    @RequestMapping(value = "/changeApplyCommunityStatus",method = RequestMethod.PUT)
    @ResponseBody
    public Msg changeApplyCommunityStatus(@RequestBody ApplyCommunity applyCommunity){

        boolean b = applyCommunityService.changeApplyCommunityStatus(applyCommunity);

        if (b==true){
            return Msg.success();
        }else {
            return  Msg.fail();
        }

    }


    /**
     * 用户取消申请，删除申请表中对应的信息；
     */
    @RequestMapping(value = "/DelApplyCommunity/{user_id}/{com_id}",method = RequestMethod.DELETE)
    @ResponseBody
    public Msg DelApplyCommunity(@PathVariable("user_id")String user_id,@PathVariable("com_id")Integer com_id){
 ApplyCommunityKey applyCommunityKey=new ApplyCommunityKey(user_id,com_id);
       boolean b = applyCommunityService.DelApplyCommunity(applyCommunityKey);

      if (b==true){
          return Msg.success();
      }else {
          return  Msg.fail();
      }

    }

    /**
     * 查找是否有对应的用户申请的所有社团；
     */
    @RequestMapping(value = "/GetApplyCommunity/{user_id}",method = RequestMethod.GET)
    public String GetApplyCommunity(@PathVariable("user_id")String user_id,@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model){
        PageHelper.startPage(pn, 3);
        // startPage后面紧跟的这个查询就是一个分页查询
        List<ApplyCommunity> applyCommunities = applyCommunityService.GetApplyCommunity(user_id);
        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(applyCommunities, 3);
        List<ApplyCommunity> list = page.getList();

        model.addAttribute("temp_apply_list", list);
        //封装对点击查询的判断
        model.addAttribute("check", "2");
        //封装分页信息
        model.addAttribute("page", page);
        return "common_user/personal_center";
    }








    /**
     * 增加用户申请信息；
     */
    @RequestMapping(value = "/addApplyCom",method = RequestMethod.POST)
    @ResponseBody
    public Msg addApplyMember(@RequestBody ApplyCommunity applyCommunity){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        //System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        applyCommunity.setApplyTime(df.format(new Date()));//设置申请的时间

        //查出对应的社团和用户组合
       boolean b = applyCommunityService.addApplyMember(applyCommunity);
        // System.out.print(b);
        if (b==true){
            return Msg.success();
        }else {
            return Msg.fail();
        }

    }

    /**
     * 查找是否有对应的用户申请的对应社团；
     */
    @RequestMapping(value = "/checkIsApplyMember/{com_id}/{user_id}",method = RequestMethod.GET)
    @ResponseBody
    public Msg checkIsApplyMember(@PathVariable("com_id")Integer com_id,@PathVariable("user_id")String user_id){
        //查出对应的社团和用户组合
        boolean b = applyCommunityService.checkIsApplyMember(com_id,user_id);
        // System.out.print(b);
        if (b==true){
            return Msg.success();
        }else {
            return Msg.fail();
        }
    }

}
