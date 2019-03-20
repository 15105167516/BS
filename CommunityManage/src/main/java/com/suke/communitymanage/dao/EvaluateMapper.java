package com.suke.communitymanage.dao;

import com.suke.communitymanage.bean.Evaluate;
import com.suke.communitymanage.bean.EvaluateExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface EvaluateMapper {
    long countByExample(EvaluateExample example);

    int deleteByExample(EvaluateExample example);

    int deleteByPrimaryKey(Integer id);

    int deleteByComIDMemId(Map paramMap);

    int insert(Evaluate record);

    int insertSelective(Evaluate record);

    List<Evaluate> selectByExample(EvaluateExample example);

    Evaluate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    int updateByExample(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    int updateByPrimaryKeySelective(Evaluate record);

    int updateByPrimaryKey(Evaluate record);
}