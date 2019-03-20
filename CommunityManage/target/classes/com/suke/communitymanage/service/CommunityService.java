package com.suke.communitymanage.service;

import com.suke.communitymanage.bean.Community;
import com.suke.communitymanage.bean.DdActMemExample;
import com.suke.communitymanage.bean.DdComMemExample;
import com.suke.communitymanage.bean.EvaluateExample;
import com.suke.communitymanage.dao.CommunityMapper;
import com.suke.communitymanage.dao.DdActMemMapper;
import com.suke.communitymanage.dao.DdComMemMapper;
import com.suke.communitymanage.dao.EvaluateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommunityService {
    @Autowired
    CommunityMapper communityMapper;
    @Autowired
    EvaluateMapper evaluateMapper;
    @Autowired
    DdActMemMapper ddActMemMapper;
    @Autowired
    DdComMemMapper ddComMemMapper;
    public List<Community> getCommunities() {
        List<Community> list=  communityMapper.selectByExample(null);
        return  list;
    }

    public Community getCommunityById(Integer com_id) {
        Community community=communityMapper.selectCommunityAndAdminById(com_id);
        return  community;
    }

    public boolean checkIsMember(Integer com_id, String user_id) {
        Map paramMap = new HashMap();
        paramMap.put("comId", com_id);
        paramMap.put("memid", user_id);

        Community community = communityMapper.selectCommunityAndMemberById(paramMap);
        //System.out.print(com_id+"%%%%"+user_id);
        if (community==null){
            return true;
        }else {
            return false;
        }

    }

    public List<Community> getJoinedCom(String mem_id) {
        Map paramMap = new HashMap();

        paramMap.put("mem_id", mem_id);
        List<Community> communities = communityMapper.getkjoinedCommunity(paramMap);
        return  communities;
    }


    public boolean delcommunity_byId(String userId, Integer com_id) {

try{

    //1.删除活动评价
    Map paramMap1 = new HashMap();
    paramMap1.put("comid", com_id);
    paramMap1.put("memid", userId);
    int e=     evaluateMapper.deleteByComIDMemId(paramMap1);
    //2.删除用户对应的社团活动关联表
    Map paramMap2 = new HashMap();
    paramMap2.put("comid", com_id);
    paramMap2.put("memid", userId);
    int a=  ddActMemMapper.deleteByComIDMemId(paramMap2);
    //3.删除用户对应的社团关联表
    DdComMemExample ddComMemExample=new DdComMemExample();
    DdComMemExample.Criteria criteria3=ddComMemExample.createCriteria();
    criteria3.andMemberIdEqualTo(userId);
    criteria3.andComIdEqualTo(com_id);
    int c= ddComMemMapper.deleteByExample(ddComMemExample);
}catch (Exception e){
    return false;
}
        return  true;

    }

    public List<Community> likeSearchJoinedCom(String mem_id, String condition) {
        Map paramMap = new HashMap();

        paramMap.put("mem_id", mem_id);
        paramMap.put("condition", condition);
      return   communityMapper.likeSearchJoinedCom(paramMap);

    }
}
