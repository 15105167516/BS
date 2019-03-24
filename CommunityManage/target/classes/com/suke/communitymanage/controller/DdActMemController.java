package com.suke.communitymanage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suke.communitymanage.bean.Activity;
import com.suke.communitymanage.bean.DdActMem;
import com.suke.communitymanage.service.DdActMemService;
import com.suke.communitymanage.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/ddActMember")
public class DdActMemController {
    @Autowired
    DdActMemService ddActMemService;









    /**
     * 用户插入到社团活动
     */
    @RequestMapping(value = "/userInsertActivity/{user_id}/{act_id}/{act_number}", method = RequestMethod.POST)
@ResponseBody
    public Msg userInsertActivity(Activity activity, DdActMem ddActMem, @PathVariable("act_number") Integer act_number, @PathVariable("user_id") String user_id, @PathVariable("act_id") Integer act_id) {
        ddActMem.setActivityId(act_id);
        ddActMem.setMemId(user_id);
        activity.setActiId(act_id);
        activity.setActPeopleCount(act_number);
        //用户参与活动
        boolean b=ddActMemService.userInsertActivity(ddActMem,activity);

        if (b==true){

            return Msg.success();
        }else {
            return Msg.fail();
        }
    }










    @RequestMapping(value = "/likeUnderwayAct/{mem_id}/{condition}", method = RequestMethod.GET)
    public String likeUnderwayAct(@RequestParam(value = "pn", defaultValue = "1")Integer pn,@PathVariable("condition") String condition,@PathVariable("mem_id") String mem_id, Model model) {
        PageHelper.startPage(pn, 3);
        // startPage后面紧跟的这个查询就是一个分页查询
        List<DdActMem> ddActMemList = ddActMemService.likeUnderwayAct(mem_id,condition);

        PageInfo page = new PageInfo(ddActMemList, 3);
        List<DdActMem> list = page.getList();
        //判断是否点击搜索按钮
        model.addAttribute("LikeCheck", 1);
        //保存查询的条件
        model.addAttribute("condition", condition);
        model.addAttribute("underwayList", list);
        //封装对点击查询的判断,显示哪个div
        model.addAttribute("check", "4");
        //封装分页信息
        model.addAttribute("page", page);
        return "common_user/personal_center";
    }






    @RequestMapping(value = "/getUnderwayAct/{mem_id}", method = RequestMethod.GET)
    public String getUnderwayAct(@RequestParam(value = "pn", defaultValue = "1") Integer pn, @PathVariable("mem_id") String mem_id, Model model) {
        PageHelper.startPage(pn, 3);
        // startPage后面紧跟的这个查询就是一个分页查询
        List<DdActMem> ddActMemList = ddActMemService.getUnderwayAct(mem_id);

        PageInfo page = new PageInfo(ddActMemList, 3);
        List<DdActMem> list = page.getList();
        model.addAttribute("underwayList", list);
        //封装对点击查询的判断
        model.addAttribute("check", "4");
        //封装分页信息
        model.addAttribute("page", page);
        return "common_user/personal_center";
    }













    @RequestMapping(value = "/LikeSelectActByUserId/{mem_id}/{condition}", method = RequestMethod.GET)
    public String LikeSelectActByUserId(@RequestParam(value = "pn", defaultValue = "1")Integer pn,@PathVariable("condition") String condition, @PathVariable("mem_id") String mem_id, Model model) {
        // 这不是一个分页查询；
        // 引入PageHelper分页插件
        // 在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pn, 3);
        // startPage后面紧跟的这个查询就是一个分页查询
        List<DdActMem> ddActMemList = ddActMemService.LikeSelectActByUserId(mem_id,condition);


        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(ddActMemList, 3);

        List<DdActMem> list = page.getList();
        model.addAttribute("ActivityList", list);
        //判断是否点击搜索按钮
        model.addAttribute("LikeCheck", 1);
        //保存查询的条件
        model.addAttribute("condition", condition);
        //封装对点击查询的判断
        model.addAttribute("check", "3");
        //封装分页信息
        model.addAttribute("page", page);
        return "common_user/personal_center";
    }
    @RequestMapping(value = "/getJoinedAct/{mem_id}", method = RequestMethod.GET)
    public String getJoinedAct(@RequestParam(value = "pn", defaultValue = "1") Integer pn, @PathVariable("mem_id") String mem_id, Model model) {
        // 这不是一个分页查询；
        // 引入PageHelper分页插件
        // 在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pn, 3);
        // startPage后面紧跟的这个查询就是一个分页查询
        List<DdActMem> ddActMemList = ddActMemService.getJoinedAct(mem_id);
//        //查出用户参加的的活动之后，筛选出活动结束的放入新list里面
//        List<DdActMem> newddActMemList = new ArrayList<DdActMem>();
//
//        for (DdActMem ddactm : ddActMemList
//                ) {
//            //获取数据库活动结束时间
//            Date date = ddactm.getActivity().getActivityEndTime();
//            long endtime = date.getTime();
//            //获取系统当前时间
//            long current = System.currentTimeMillis();
//           // System.out.println(endtime - current);
//            //时间按进行比较，把数据库时间已经结束的活动从新放入list
//            // System.out.println(time+"$$$"+current);
//            if (endtime - current <= 0) {
//                newddActMemList.add(ddactm);
//
//            }
//
//        }

        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(ddActMemList, 3);

        List<DdActMem> list = page.getList();
        model.addAttribute("ActivityList", list);
        //封装对点击查询的判断
        model.addAttribute("check", "3");
        //封装分页信息
        model.addAttribute("page", page);
        return "common_user/personal_center";
    }
}
