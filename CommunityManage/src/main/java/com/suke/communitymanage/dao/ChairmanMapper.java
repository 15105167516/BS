package com.suke.communitymanage.dao;

import com.suke.communitymanage.bean.Chairman;
import com.suke.communitymanage.bean.ChairmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChairmanMapper {
    long countByExample(ChairmanExample example);

    int deleteByExample(ChairmanExample example);

    int deleteByPrimaryKey(String memberId);

    int insert(Chairman record);

    int insertSelective(Chairman record);

    List<Chairman> selectByExample(ChairmanExample example);

    Chairman selectByPrimaryKey(String memberId);

    int updateByExampleSelective(@Param("record") Chairman record, @Param("example") ChairmanExample example);

    int updateByExample(@Param("record") Chairman record, @Param("example") ChairmanExample example);

    int updateByPrimaryKeySelective(Chairman record);

    int updateByPrimaryKey(Chairman record);
}