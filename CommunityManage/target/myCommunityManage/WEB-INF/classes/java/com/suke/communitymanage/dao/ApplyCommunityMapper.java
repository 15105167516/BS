package com.suke.communitymanage.dao;

import com.suke.communitymanage.bean.ApplyCommunity;
import com.suke.communitymanage.bean.ApplyCommunityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyCommunityMapper {
    long countByExample(ApplyCommunityExample example);

    int deleteByExample(ApplyCommunityExample example);

    int deleteByPrimaryKey(Integer temId);

    int insert(ApplyCommunity record);

    int insertSelective(ApplyCommunity record);

    List<ApplyCommunity> selectByExample(ApplyCommunityExample example);

    ApplyCommunity selectByPrimaryKey(Integer temId);

    int updateByExampleSelective(@Param("record") ApplyCommunity record, @Param("example") ApplyCommunityExample example);

    int updateByExample(@Param("record") ApplyCommunity record, @Param("example") ApplyCommunityExample example);

    int updateByPrimaryKeySelective(ApplyCommunity record);

    int updateByPrimaryKey(ApplyCommunity record);
}