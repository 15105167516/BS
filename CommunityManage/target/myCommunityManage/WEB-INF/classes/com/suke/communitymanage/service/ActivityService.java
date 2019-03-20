package com.suke.communitymanage.service;

import com.suke.communitymanage.bean.Activity;
import com.suke.communitymanage.dao.ActivityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {
    @Autowired
    ActivityMapper activityMapper;

    public Activity getActivityById(Integer act_id) {
        return  activityMapper.selectAct_Com_InfoById(act_id);
    }
}
