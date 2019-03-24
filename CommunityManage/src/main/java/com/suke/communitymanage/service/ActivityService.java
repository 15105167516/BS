package com.suke.communitymanage.service;

import com.suke.communitymanage.bean.Activity;
import com.suke.communitymanage.dao.ActivityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ActivityService {
    @Autowired
    ActivityMapper activityMapper;

    public Activity getActivityById(Integer act_id) {
        return activityMapper.selectAct_Com_InfoById(act_id);
    }

    public List<Activity> getActivityRecommend(String memid, String userlabel) {
        //标记label重合数量
        int mark = 0;
        //用来把list2暂时存储；
        Map<Integer, Activity> map = new HashMap<>();
        //用户参加过未开始的活动
        List<Activity> list1 = activityMapper.selectActivityJoined(memid);
        //未开始的所有活动
        List<Activity> list2 = activityMapper.selectActivityRecommend();
        // list2.removeAll(list1);这个不能用，因为虽然类型一样，但是地址不一样，只能remove相同的对象（地址值）
        //所以用到map暂时存储，通过判断id的存在，再去删除list2包含list1中数据
        for (Activity a : list2) {
            map.put(a.getActiId(), a);
        }

        for (Activity a : list1) {
            if (map.containsKey(a.getActiId())) {
                list2.remove(map.get(a.getActiId()));
            }
        }
        //现在的list2就是用户未参加且未开始的活动
        //下面就要把用户的label和活动的label进行比较，如果相同数量大于二，就放入新的list中
        String[] str = userlabel.split(" ");
        List<Activity> list3 = new ArrayList<>();
        for (Activity a : list2) {
            mark = 0;
            for (String s : str) {
                if (a.getActivityLabel().contains(s)) {
                    mark++;
                }
                if (mark >= 2) {
                    list3.add(a);
                    break;
                }
            }
        }

        return list3;
    }

    public List<Activity> LikeActivityRecommend(String mem_id, String userlabel, String condition) {

        //标记label重合数量
        int mark = 0;
        //用来把list2暂时存储；
        Map<Integer, Activity> map = new HashMap<>();
        //用户参加过未开始的活动
        List<Activity> list1 = activityMapper.selectActivityJoined(mem_id);
        //未开始的所有活动
        List<Activity> list2 = activityMapper.selectLikeActivityRecommend(condition);
        // list2.removeAll(list1);这个不能用，因为虽然类型一样，但是地址不一样，只能remove相同的对象（地址值）
        //所以用到map暂时存储，通过判断id的存在，再去删除list2包含list1中数据
        for (Activity a : list2) {
            map.put(a.getActiId(), a);
        }

        for (Activity a : list1) {
            if (map.containsKey(a.getActiId())) {
                list2.remove(map.get(a.getActiId()));
            }
        }
        //现在的list2就是用户未参加且未开始的活动
        //下面就要把用户的label和活动的label进行比较，如果相同数量大于二，就放入新的list中
        String[] str = userlabel.split(" ");
        List<Activity> list3 = new ArrayList<>();
        for (Activity a : list2) {
            mark = 0;
            for (String s : str) {
                if (a.getActivityLabel().contains(s)) {
                    mark++;
                }
                if (mark >= 2) {
                    list3.add(a);
                    break;
                }
            }
        }
        return list3;
    }


    public boolean updateActivity(Activity activity) {
        try {
            activityMapper.updateByPrimaryKey(activity);
        } catch (Exception e) {
            return false;
        }
        return true;

    }
}