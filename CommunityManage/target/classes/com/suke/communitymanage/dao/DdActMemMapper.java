package com.suke.communitymanage.dao;

import com.suke.communitymanage.bean.DdActMem;
import com.suke.communitymanage.bean.DdActMemExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DdActMemMapper {
    long countByExample(DdActMemExample example);

    int deleteByExample(DdActMemExample example);

    int deleteByPrimaryKey(Integer id);

    int deleteByComIDMemId(Map paramMap);

    int insert(DdActMem record);

    int insertSelective(DdActMem record);

    List<DdActMem> selectByExample(DdActMemExample example);

    DdActMem selectByPrimaryKey(Integer id);
  List<DdActMem>  selectActByUserId(String memid);
    List<DdActMem>  selectUnderwayActByUserId(String memid);
    List<DdActMem>   LikeSelectActByUserId(String mem_id,String condition);
    List<DdActMem> selectLikeUnderwayAct(String mem_id,String condition);
    int updateByExampleSelective(@Param("record") DdActMem record, @Param("example") DdActMemExample example);

    int updateByExample(@Param("record") DdActMem record, @Param("example") DdActMemExample example);

    int updateByPrimaryKeySelective(DdActMem record);

    int updateByPrimaryKey(DdActMem record);
}