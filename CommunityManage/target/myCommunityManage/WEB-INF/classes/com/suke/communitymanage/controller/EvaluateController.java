package com.suke.communitymanage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suke.communitymanage.bean.Evaluate;
import com.suke.communitymanage.service.EvaluateService;
import com.suke.communitymanage.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/evaluate")
public class EvaluateController {
    @Autowired
    EvaluateService evaluateService;

    /**
     * 插入用户的评价信息
     */
    @RequestMapping(value = "/insertEvaluate", method = RequestMethod.POST)
    @ResponseBody
    public Msg insertEvaluate(@RequestBody Evaluate evaluate) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        evaluate.setEvaTime(df.format(new Date()));//设置申请的时间
        boolean b=evaluateService.insertEvaluate(evaluate);

        if (b==true){
            return Msg.success();
        }else {
            return Msg.fail();
        }

    }



    /**
     * 返回对应的用户参与的社团评价信息
     */
    @RequestMapping(value = "/checkIsEvaluate/{mem_id}/{act_id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg checkIsEvaluate(@PathVariable("mem_id") String mem_id,@PathVariable("act_id") Integer act_id) {
        boolean b=evaluateService.checkIsEvaluate(mem_id,act_id);
        System.out.println(b);
if (b==true){
    return Msg.success();
}else {
    return Msg.fail();
}

    }
    /**
     * 返回对应的用户参与的社团评价信息
     */
    @RequestMapping(value = "/getEvaluateScoreByActId/{act_id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getEvaluateScoreByActId(@PathVariable("act_id") Integer act_id) {


        double d=0;
        double average_score=0;

        List<Evaluate> evaluates=evaluateService.getEvaluatesByActId(act_id);
        for (Evaluate evaluate:
                evaluates) {
            d=Double.parseDouble(evaluate.getEvaScore())+d;
        }
        if (evaluates.size()!=0){
            average_score=d/(evaluates.size());
            average_score = (double) Math.round(average_score * 10) / 10;
        }

        return Msg.success().add("average_score",average_score);
    }
    /**
     * 返回对应的用户参与的社团评价信息
     */
    @RequestMapping(value = "/getActivityEvaluate/{act_id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getEvaluatesByActId(@PathVariable("act_id") Integer act_id,@RequestParam(value = "pn", defaultValue = "1") Integer pn) {


        double d=0;
        double average_score=0;
        // 这不是一个分页查询
        // 引入PageHelper分页插件
        // 在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pn, 3);
        // startPage后面紧跟的这个查询就是一个分页查询
        List<Evaluate> evaluates=evaluateService.getEvaluatesByActId(act_id);
        for (Evaluate evaluate:
                evaluates) {
           d=Double.parseDouble(evaluate.getEvaScore())+d;
        }
        if (evaluates.size()!=0){
            average_score=d/(evaluates.size());
            average_score = (double) Math.round(average_score * 10) / 10;
        }



        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(evaluates, 3);
        return Msg.success().add("pageInfo", page).add("average_score",average_score);
    }
}
