package com.suke.communitymanage.dao;

import com.suke.communitymanage.bean.SuManage;
import com.suke.communitymanage.bean.SuManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuManageMapper {
    long countByExample(SuManageExample example);

    int deleteByExample(SuManageExample example);

    int deleteByPrimaryKey(Integer suId);

    int insert(SuManage record);

    int insertSelective(SuManage record);

    List<SuManage> selectByExample(SuManageExample example);

    SuManage selectByPrimaryKey(Integer suId);

    int updateByExampleSelective(@Param("record") SuManage record, @Param("example") SuManageExample example);

    int updateByExample(@Param("record") SuManage record, @Param("example") SuManageExample example);

    int updateByPrimaryKeySelective(SuManage record);

    int updateByPrimaryKey(SuManage record);
}