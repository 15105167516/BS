package com.suke.communitymanage.service;

import com.suke.communitymanage.bean.Activity;
import com.suke.communitymanage.bean.DdActMem;
import com.suke.communitymanage.dao.ActivityMapper;
import com.suke.communitymanage.dao.DdActMemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DdActMemService {
    @Autowired
    DdActMemMapper ddActMemMapper;
    @Autowired
    ActivityMapper activityMapper;
    public  boolean userInsertActivity(DdActMem ddActMem, Activity activity) {

            try {
                ddActMemMapper.insert(ddActMem);
                activityMapper.updateByPrimaryKeySelective(activity);
            }catch (Exception e){
                return false;
            }
            return  true;

    }

    public List<DdActMem> getJoinedAct(String mem_id) {
        return  ddActMemMapper.selectActByUserId(mem_id);
    }

    public List<DdActMem> LikeSelectActByUserId(String mem_id, String condition) {
        return  ddActMemMapper.LikeSelectActByUserId(mem_id,condition);
    }


    public List<DdActMem> getUnderwayAct(String mem_id) {
      return   ddActMemMapper.selectUnderwayActByUserId(mem_id);
    }

    public List<DdActMem> likeUnderwayAct(String mem_id, String condition) {
        return  ddActMemMapper.selectLikeUnderwayAct(mem_id,condition);
    }
}
