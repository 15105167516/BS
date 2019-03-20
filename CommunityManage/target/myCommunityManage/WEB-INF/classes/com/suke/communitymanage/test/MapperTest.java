package com.suke.communitymanage.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suke.communitymanage.bean.*;
import com.suke.communitymanage.bean.EvaluateExample.Criteria;
import com.suke.communitymanage.dao.*;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    CommunityMapper communityMapper;

    @Autowired
    ActivityMapper activityMapper;
    @Autowired
    ApplyCommunityMapper applyCommunityMapper;
    @Autowired
    EvaluateMapper evaluateMapper;
    @Autowired
    DdActMemMapper ddActMemMapper;
    @Autowired
    DdComMemMapper ddComMemMapper;

    //测试用户加入的活动；
    @Test
    public void getjoinedActivity(){

      List<DdActMem> list=ddActMemMapper.selectActByUserId("152040135201");
        System.out.println(list);
    }

    //测试催促处理申请测试；
    @Test
    public void updatestatus(){
ApplyCommunity applyCommunity =new ApplyCommunity();
applyCommunity.setTemUserId("152040135201");
applyCommunity.setTemComId(2);
applyCommunity.setStatus(1);
         applyCommunityMapper.updateByPrimaryKeySelective(applyCommunity);

    }
    //模糊查询测试用户申请的社团；
    @Test
    public void LikeSearch(){
        Map paramMap = new HashMap();

        paramMap.put("temUserId", "152040135201");
        paramMap.put("condition", "学生");
        List<ApplyCommunity> list=   applyCommunityMapper.LikeSearchComInfoByIdAndCondition(paramMap);
        System.out.println(list);
    }
    //测试用户申请的社团；
    @Test
    public void getappy(){

        List<ApplyCommunity> list=   applyCommunityMapper.selectComInfoById("152040135201");
        System.out.println(list);
    }



    //测试用户加入社团的模糊查询；
    @Test
    public void likesearch(){
        Map paramMap = new HashMap();

        paramMap.put("mem_id", "152040135201");
        paramMap.put("condition", "8");
      List<Community> list=   communityMapper.likeSearchJoinedCom(paramMap);
        System.out.println(list);
    }
    //测试删除用户和社团的关联信息；
    @Test
    public void del_dd_com(){
     DdComMemExample ddComMemExample=new DdComMemExample();
        DdComMemExample.Criteria criteria=ddComMemExample.createCriteria();
        criteria.andMemberIdEqualTo("152040135201");
        criteria.andComIdEqualTo(1);
        ddComMemMapper.deleteByExample(ddComMemExample);
    }

    //测试删除用户和活动的关联信息；
    @Test
    public void del_dd_act(){
        Map paramMap = new HashMap();
        paramMap.put("comid", 1);
        paramMap.put("memid", "152040135201");
        ddActMemMapper.deleteByComIDMemId(paramMap);

    }

    //测试删除用户的评价信息；
    @Test
    public void del_evaluate(){
        Map paramMap = new HashMap();
        paramMap.put("comid", 1);
        paramMap.put("memid", "152040135201");
        evaluateMapper.deleteByComIDMemId(paramMap);
    }

    //测试查询社团
    @Test
    public void commnity() {
        PageHelper.startPage(1, 3);
        String mem_id="152040135201";
        Map paramMap = new HashMap();
     paramMap.put("mem_id", "152040135201");
        List<Community> communities = communityMapper.getkjoinedCommunity(paramMap);

        PageInfo page = new PageInfo(communities, 3);
        System.out.println(page);
    }



    //测试查询社团
    @Test
    public void test() {
        /*CommunityExample communityExample =new CommunityExample();
        CommunityExample.Criteria criteria=communityExample.createCriteria();
        criteria.andComNameEqualTo("理事会");*/
        List<Community> list = communityMapper.selectByExample(null);
        System.out.println(list);
    }

    //根据id测试查询社团以及相关的管理员
    @Test
    public void community_byId() {

        Community community = communityMapper.selectCommunityAndAdminById(1);
        System.out.println(community);
    }

    //测试查询社团活动
    @Test
    @Ignore
    public void test1() {
        List<Activity> list = activityMapper.selectByExample(null);
        System.out.println(list);
    }

    //测试查询对应社团中的人是否存在；
    @Test
    public void comAndMemberById() {

        Map paramMap = new HashMap();
        paramMap.put("comId", 1);
        paramMap.put("memid", "152040135201");
        Community community = communityMapper.selectCommunityAndMemberById(paramMap);
        System.out.println(community);
    }

    //测试查询对应的用户以及用户申请社团的信息
    @Test
    public void comApply_memById() {
        ApplyCommunityKey applyCommunityKey =new ApplyCommunityKey("152040135201",7);


        ApplyCommunity applyCommunity=applyCommunityMapper.selectByPrimaryKey(applyCommunityKey);

       // ApplyCommunityKey applyCommunityKey=new ApplyCommunityKey("1",1);
//ApplyCommunity applyCommunity=applyCommunityMapper.selectByPrimaryKey(paramMap);
        System.out.println(applyCommunity);
    }

}
