package com.suke.communitymanage.service;

import com.suke.communitymanage.bean.SuManage;
import com.suke.communitymanage.bean.SuManageExample;
import com.suke.communitymanage.dao.SuManageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuManageService {
    @Autowired
    SuManageMapper suManageMapper;
    public List<SuManage> hasSuManage(String adminName) {
        // TODO Auto-generated method stub
        SuManageExample example=new SuManageExample();
        SuManageExample.Criteria criteria = example.createCriteria();
        criteria.andSuNameEqualTo(adminName);
      return   suManageMapper.selectByExample(example);
//        EmployeeExample example = new EmployeeExample();
//        Criteria criteria = example.createCriteria();
//        criteria.andEmpNameEqualTo(empName);
//        long count = employeeMapper.countByExample(example);
//        return count == 0;
    }
}
