package com.suke.communitymanage.service;

import com.suke.communitymanage.bean.ApplyCommunity;
import com.suke.communitymanage.bean.ApplyCommunityKey;
import com.suke.communitymanage.dao.ApplyCommunityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ApplyCommunityService {
@Autowired
    ApplyCommunityMapper applyCommunityMapper;
    public boolean checkIsApplyMember(Integer com_id, String user_id) {
        ApplyCommunityKey applyCommunityKey =new ApplyCommunityKey(user_id,com_id);


        ApplyCommunity applyCommunity=applyCommunityMapper.selectByPrimaryKey(applyCommunityKey);
        if (applyCommunity==null){
            return true;
        }else {
            return false;
        }

    }

    public boolean addApplyMember(ApplyCommunity applyCommunity) {
     int num = applyCommunityMapper.insert(applyCommunity);
      return  num==0?false:true;
    }

    public List<ApplyCommunity> GetApplyCommunity(String user_id) {
        return          applyCommunityMapper.selectComInfoById(user_id);

    }

    public boolean DelApplyCommunity(ApplyCommunityKey applyCommunityKey) {
        try {
            applyCommunityMapper.deleteByPrimaryKey(applyCommunityKey);
        }
      catch (Exception e){
          return false;
      }
return true;

    }

    public boolean changeApplyCommunityStatus(ApplyCommunity applyCommunity) {
       try{
           applyCommunityMapper.updateByPrimaryKeySelective(applyCommunity);
       }catch (Exception e){
           return false;
       }
        return true;
    }

    public List<ApplyCommunity> LikeSearchApplyCommunity(Map paramMap) {
return  applyCommunityMapper.LikeSearchComInfoByIdAndCondition(paramMap);
    }
}
