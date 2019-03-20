package com.suke.communitymanage.test;

import com.github.pagehelper.PageInfo;
import com.suke.communitymanage.bean.ApplyCommunity;
import com.suke.communitymanage.bean.Community;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:dispatcherServlet-servlet.xml"})
@WebAppConfiguration
public class MVCTest {
    //传入springmvc的ioc，不能自己注入自己，所以要在上面添加Webappconfigration
    @Autowired
    WebApplicationContext context;

    //虚拟mvc请求，获取到才处理的结果
    MockMvc mockMvc;

    @Before
    public void initMocMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testPage1() throws Exception {

        //perform发送请求；MockMvcRequestBuilders创建请求；.andReturn返回结果；
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/community/getJoinedCom/152040135201").param("pn", "1")).andReturn();
        //请求成功以后，请求域中会有pageInfo；我们可以取出pageInfo进行验证
        MockHttpServletRequest request = result.getRequest();
        PageInfo pi = (PageInfo) request.getAttribute("pageInfo");
        System.out.println(pi.getList());
        for (Community community: (List<Community>)pi.getList()) {
            System.out.println(community.getComName());
        }
//        System.out.println("当前页码：" + pi.getPageNum());
//        System.out.println("总页码：" + pi.getPages());
//        System.out.println("总记录数：" + pi.getTotal());
//        System.out.println("在页面需要连续显示的页码");
//        Assert.assertNotNull(result.getModelAndView().getModel().get("user_id"));
    }
    @Test
    public void testTemporyCom() throws Exception {

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/applycommunity/GetApplyCommunity/152040135201")).andReturn();
        //请求成功以后，请求域中会有pageInfo；我们可以取出pageInfo进行验证
        MockHttpServletRequest request = result.getRequest();
        PageInfo pi = (PageInfo) request.getAttribute("page");
        System.out.println(pi.getList());
        for (ApplyCommunity applyCommunity: (List<ApplyCommunity>)pi.getList()) {
            System.out.println(applyCommunity);
        }
    }
}
