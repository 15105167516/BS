package com.suke.communitymanage.utils;


import com.suke.communitymanage.bean.SuManage;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberInterceptor implements HandlerInterceptor {
    //第一步先执行这个
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
       Object object= httpServletRequest.getSession().getAttribute("login_user");

        if (object==null){

            httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/jump/loginjsp");
            return false;
        }else {

            return true;
        }

    }
    //第二步先执行对应的controller方法
    //第三步下面这个方法
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }
    //第四步下面这个方法
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
