package com.suke.communitymanage.service;

import com.suke.communitymanage.bean.Evaluate;
import com.suke.communitymanage.bean.EvaluateExample;
import com.suke.communitymanage.dao.EvaluateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluateService {
    @Autowired
    EvaluateMapper evaluateMapper;

    public List<Evaluate> getEvaluatesByActId(Integer act_id) {
//        EvaluateExample evaluateExample=new EvaluateExample();
//        EvaluateExample.Criteria criteria=evaluateExample.createCriteria();
//        criteria.andActIdEqualTo(act_id);
//        return evaluateMapper.selectByExample(evaluateExample);
    return     evaluateMapper.selectEvaByActivityId(act_id);
    }

    public boolean checkIsEvaluate(String mem_id, Integer act_id) {
                EvaluateExample evaluateExample=new EvaluateExample();
        EvaluateExample.Criteria criteria=evaluateExample.createCriteria();
        criteria.andActIdEqualTo(act_id);
       criteria.andMemIdEqualTo(mem_id);
        List<Evaluate> evaluates=evaluateMapper.selectByExample(evaluateExample);
     if(evaluates.size()!=0){
         return false;
     }else {
         return true;
     }
    }

    public boolean insertEvaluate(Evaluate evaluate) {
        try {
            evaluateMapper.insert(evaluate);
        }catch (Exception e){
            return  false;
        }
       return true;
    }
}
