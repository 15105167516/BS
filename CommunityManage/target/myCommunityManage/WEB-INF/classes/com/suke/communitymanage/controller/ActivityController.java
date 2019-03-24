package com.suke.communitymanage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suke.communitymanage.bean.Activity;
import com.suke.communitymanage.service.ActivityService;
import com.suke.communitymanage.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    ActivityService activityService;

    /**
     * 更新活动人数加1的信息；
     */
    @RequestMapping(value = "/addPersonNumber/{act_id}/{act_number}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg addPersonNumber(@Valid Activity activity,@PathVariable("act_id")Integer act_id,@PathVariable("act_number")Integer act_number) {
        activity.setActiId(act_id);
activity.setActPeopleCount(act_number);
        //查出对应的活动
       boolean b=activityService.updateActivity(activity);
      if (b==true){
          return Msg.success();
      }else {
          return Msg.fail();
      }

    }





    /**
     * 模糊查询出所有的活动，但未参加，且还未开始的活动，且与用户的兴趣爱好有两个以及以上的匹配活动（活动推荐）；
     */
    @RequestMapping(value = "/getLikeActivityRecommend/{mem_id}/{userlabel}/{condition}", method = RequestMethod.GET)
    public String getLikeActivityRecommend(@RequestParam(value = "pn", defaultValue = "1")Integer pn,@PathVariable("condition") String condition, @PathVariable("userlabel") String userlabel, @PathVariable("mem_id") String mem_id, Model model) {
        PageHelper.startPage(pn, 3);
        List<Activity> activities=activityService.LikeActivityRecommend(mem_id,userlabel,condition);
        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(activities, 3);
        List<Activity> list = page.getList();
        model.addAttribute("RecommendList", list);
        //判断是否点击搜索按钮
        model.addAttribute("LikeCheck", 1);
        //保存查询的条件
        model.addAttribute("condition", condition);
        //封装对点击查询的判断
        model.addAttribute("check", "5");
        //封装分页信息
        model.addAttribute("page", page);

        return "common_user/personal_center";

    }








    /**
     * 查询出所有的活动，但未参加，且还未开始的活动，且与用户的兴趣爱好有两个以及以上的匹配活动（活动推荐）；
     */
    @RequestMapping(value = "/getActivityRecommend/{mem_id}/{userlabel}", method = RequestMethod.GET)
    public String getActivityRecommend(@RequestParam(value = "pn", defaultValue = "1")Integer pn, @PathVariable("userlabel") String userlabel, @PathVariable("mem_id") String mem_id, Model model) {
        PageHelper.startPage(pn, 3);
       List<Activity> activities=activityService.getActivityRecommend(mem_id,userlabel);
        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(activities, 3);
        List<Activity> list = page.getList();
        model.addAttribute("RecommendList", list);
        //封装对点击查询的判断
        model.addAttribute("check", "5");
        //封装分页信息
        model.addAttribute("page", page);

        return "common_user/personal_center";

    }





    /**
     * 返回对应的社团信息
     */
    @RequestMapping(value = "/getActivityCommunity/{act_id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getActivityById(@PathVariable("act_id") Integer act_id) {
        //查出对应的活动
        Activity activity=activityService.getActivityById(act_id);
        System.out.println(activity);
        return Msg.success().add("activity", activity);
    }
}
