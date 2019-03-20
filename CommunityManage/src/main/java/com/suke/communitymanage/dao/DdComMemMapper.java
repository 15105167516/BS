package com.suke.communitymanage.dao;

import com.suke.communitymanage.bean.DdComMem;
import com.suke.communitymanage.bean.DdComMemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DdComMemMapper {
    long countByExample(DdComMemExample example);

    int deleteByExample(DdComMemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DdComMem record);

    int insertSelective(DdComMem record);

    List<DdComMem> selectByExample(DdComMemExample example);

    DdComMem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DdComMem record, @Param("example") DdComMemExample example);

    int updateByExample(@Param("record") DdComMem record, @Param("example") DdComMemExample example);

    int updateByPrimaryKeySelective(DdComMem record);

    int updateByPrimaryKey(DdComMem record);
}