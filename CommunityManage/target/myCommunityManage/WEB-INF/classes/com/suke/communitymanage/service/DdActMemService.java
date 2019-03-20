package com.suke.communitymanage.service;

import com.suke.communitymanage.bean.DdActMem;
import com.suke.communitymanage.dao.DdActMemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DdActMemService {
    @Autowired
    DdActMemMapper ddActMemMapper;

    public List<DdActMem> getJoinedAct(String mem_id) {
        return  ddActMemMapper.selectActByUserId(mem_id);
    }

    public List<DdActMem> LikeSelectActByUserId(String mem_id, String condition) {
        return  ddActMemMapper.LikeSelectActByUserId(mem_id,condition);
    }
}
