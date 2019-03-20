package com.suke.communitymanage.controller;

import com.suke.communitymanage.bean.Activity;
import com.suke.communitymanage.service.ActivityService;
import com.suke.communitymanage.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    ActivityService activityService;
    /**
     * 返回对应的社团信息
     */
    @RequestMapping(value = "/getActivityCommunity/{act_id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getActivityById(@PathVariable("act_id") Integer act_id) {
        //查出对应的活动
        Activity activity=activityService.getActivityById(act_id);

        return Msg.success().add("activity", activity);
    }
}
