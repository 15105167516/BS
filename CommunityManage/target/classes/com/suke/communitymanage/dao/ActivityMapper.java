package com.suke.communitymanage.dao;

import com.suke.communitymanage.bean.Activity;
import com.suke.communitymanage.bean.ActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityMapper {
    long countByExample(ActivityExample example);

    int deleteByExample(ActivityExample example);

    int deleteByPrimaryKey(Integer actiId);

    int insert(Activity record);

    int insertSelective(Activity record);

    List<Activity> selectByExample(ActivityExample example);

    Activity selectByPrimaryKey(Integer actiId);

    Activity  selectAct_Com_InfoById(Integer actiId);

    List<Activity>  selectActivityRecommend();

    List<Activity> selectActivityJoined(String memid);

    List<Activity> selectLikeActivityRecommend (String condition);

    int updateByExampleSelective(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
}