package com.suke.communitymanage.service;

import com.suke.communitymanage.bean.Chairman;
import com.suke.communitymanage.dao.ChairmanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChairmanServie {
    @Autowired
    ChairmanMapper chairmanMapper;
    public Chairman hasChairman(String chairmanId) {
        return  chairmanMapper.selectByPrimaryKey(chairmanId);
    }
}
