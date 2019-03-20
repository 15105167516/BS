package com.suke.communitymanage.dao;

import com.suke.communitymanage.bean.Community;
import com.suke.communitymanage.bean.CommunityExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CommunityMapper {
    long countByExample(CommunityExample example);

    int deleteByExample(CommunityExample example);

    int deleteByPrimaryKey(Integer comId);

    int insert(Community record);

    int insertSelective(Community record);

    List<Community> selectByExample(CommunityExample example);

    Community selectByPrimaryKey(Integer comId);

    Community selectCommunityAndAdminById(Integer comId);

   Community selectCommunityAndMemberById(Map paramMap);

    List<Community> getkjoinedCommunity(Map paramMap);

    List<Community>  likeSearchJoinedCom (Map paramMap);
    int updateByExampleSelective(@Param("record") Community record, @Param("example") CommunityExample example);

    int updateByExample(@Param("record") Community record, @Param("example") CommunityExample example);

    int updateByPrimaryKeySelective(Community record);

    int updateByPrimaryKey(Community record);
}