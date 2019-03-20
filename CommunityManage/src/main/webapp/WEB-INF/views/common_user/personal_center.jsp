<%@ page import="com.suke.communitymanage.bean.Member" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>个人中心</title>
    <%
        Member member = (Member) request.getSession().getAttribute("login_user");
        String img = member.getHeadImg();
        String user_id = member.getMemberId();
        String user_naem = member.getMemberName();
    %>

    <link rel="stylesheet" href="${applicationScope.APP_PATH }/static/self_definition_css/amazeui.css"/>
    <link rel="stylesheet" href="${applicationScope.APP_PATH }/static/self_definition_css/font-awesome.min.css">
    <link rel="stylesheet" href="${applicationScope.APP_PATH }/static/self_definition_css/core.css"/>
    <link rel="stylesheet" href="${applicationScope.APP_PATH }/static/self_definition_css/menu.css"/>
    <link rel="stylesheet" href="${applicationScope.APP_PATH }/static/self_definition_css/admin.css"/>
    <link rel="stylesheet" href="${applicationScope.APP_PATH }/static/self_definition_css/typography.css"/>

    <link rel="stylesheet" href="${applicationScope.APP_PATH }/static/self_definition_css/comon_perosnal_center.css"/>
    <script src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
    <script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <link
            href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
            rel="stylesheet">
    <script type="text/javascript" src="${APP_PATH }/static/self_definition_js/amazeui.min.js"></script>
    <script type="text/javascript" src="${APP_PATH }/static/self_definition_js/app.js"></script>
    <script type="text/javascript" src="${APP_PATH }/static/self_definition_js/blockUI.js"></script>
    <script src="${APP_PATH }/static/toastr/toastr.min.js"></script>
    <link rel="stylesheet" href="${APP_PATH }/static/toastr/toastr.min.css">
    <script type="text/javascript" src="${APP_PATH }/static/self_definition_js/comon_perosnal_center.js"></script>
</head>
<body>
<input type="text" style="display: none;" value="<%=user_id%>" id="input">
<input type="text" style="display: none;" value="${check}" id="check">











<!-- Begin page -->
<header class="am-topbar am-topbar-fixed-top">
    <div class="am-topbar-left am-hide-sm-only">
        <a href="index.html" class="logo"><span>社团管理</span><i class="zmdi zmdi-layers"></i></a>
    </div>

    <div class="contain">
        <ul class="am-nav am-navbar-nav am-navbar-left">

            <li><h4 class="page-title">首页</h4></li>
        </ul>

        <ul class="am-nav am-navbar-nav am-navbar-right">
            <li class="inform"><i class="am-icon-bell-o" aria-hidden="true"></i></li>

        </ul>
    </div>
</header>
<!-- end page -->


<div class="admin">
    <!-- 左边导航栏开始 -->
    <div class="admin-sidebar am-offcanvas  am-padding-0" id="admin-offcanvas" style="z-index: 2;">
        <div class="am-offcanvas-bar admin-offcanvas-bar">
            <!-- User -->
            <div class="user-box am-hide-sm-only">
                <div class="user-img">
                    <img src="<%=img%>" alt="user-img" title="<%=user_naem%>"
                         class="img-circle img-thumbnail img-responsive">

                </div>
                <h5><a href="#"><%=user_naem%>
                </a></h5>

            </div>
            <!-- End User -->

            <ul class="am-list admin-sidebar-list">
                <li id="main_page"><a><span class="am-icon-home"></span> 首页</a></li>
                <li class="admin-parent">
                    <a class="am-cf" data-am-collapse="{target: '#collapse-nav1'}"><span class="am-icon-table"></span>
                        社团相关 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
                    <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav1">
                        <li><a class="am-cf"> <span search="1">参加的社团</span></a></li>
                        <li><a><span search="2">申请中的社团</span></a></li>

                    </ul>
                </li>
                <li class="admin-parent">
                    <a class="am-cf" data-am-collapse="{target: '#collapse-nav2'}"><i class="am-icon-line-chart"
                                                                                      aria-hidden="true"></i> 活动相关 <span
                            class="am-icon-angle-right am-fr am-margin-right"></span></a>
                    <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav2">
                        <li><a class="am-cf"> <span search="3">已参加的活动</span></a></li>
                        <li><a class="am-cf"> <span search="4">进行中的活动</span></a></li>
                        <li><a class="am-cf"> <span search="5">相关活动推荐</span></a></li>
                    </ul>
                </li>
                <li class="admin-parent">
                    <a class="am-cf" data-am-collapse="{target: '#collapse-nav5'}"><span class="am-icon-file"></span>
                        个人相关
                        <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
                    <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav5">
                        <li><a class="am-cf"><span> 修改密码</span></a></li>
                        <li><a class="am-cf"><span>退出登录</span></a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <!-- ========== 左边导航栏结束 ========== -->


    <%--社团详情模态框--%>
    <div  class="modal fade" id="com_info_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"
                            aria-hidden="true">×
                    </button>
                    <h4 class="modal-title" id="comModalLabel" style="font-family:'方正舒体';color: #c0a16b;font-size:30px;">
                        欢迎加入<span style="font-family: '华文彩云';font-size:40px;color: #ac2925; " class="commnity_name"></span>社团
                    </h4>
                </div>
                <div class="modal-body">


                    <div>
                        <h3 style="font-family: '隶书'；">社团介绍：</h3><br/>
                        <div class="main_img" style="text-align: center"><img src=""
                                                                              style="border-radius: 40%"></div>
                        <br/>
                        <span class="com_introduction">

                   </span>

                    </div>
                    <br/>
                    <table class="table table-striped">


                        <tr>
                            <td>社团会长：</td>
                            <td><span class="chair_name"></span></td>

                        </tr>
                        <tr>
                            <td>联系会长：</td>
                            <td><span class="chair_phone"></span></td>

                        </tr>
                        <tr>
                            <td>社团人数：</td>
                            <td><span class="com_number"></span>人</td>

                        </tr>
                        <tr>
                            <td>创办时间：</td>
                            <td><span class="com_creat_time"></span></td>

                        </tr>
                    </table>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary"
                            data-dismiss="modal">关闭
                    </button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>

<%--活动详情模态框--%>
    <div  class="modal fade" id="act_info_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"
                            aria-hidden="true">×
                    </button>
                    <h4 class="modal-title" id="actModalLabel" style="font-family:'方正舒体';color: #c0a16b;font-size:30px;">
                        活动有你，更精彩！
                    </h4>
                </div>
                <div class="modal-body">


                    <div>
                        <h3 style="font-family: '隶书'；">活动详情：</h3><br/>
                        <div class="main_img" style="text-align: center"><img src=""
                                                                              style="border-radius: 40%"></div>
                        <br/>
                        <span class="act_introduction">

                   </span>

                    </div>
                    <br/>
                    <table class="table table-striped">


                        <tr>
                            <td>社团会长：</td>
                            <td><span class="chair_name"></span></td>

                        </tr>
                        <tr>
                            <td>联系会长：</td>
                            <td><span class="chair_phone"></span></td>

                        </tr>
                        <tr>
                            <td>活动主题：</td>
                            <td><span class="act_theme"></span></td>

                        </tr>
                        <tr>
                            <td>活动人数：</td>
                            <td><span class="act_number"></span>人</td>

                        </tr>
                        <tr>
                            <td>活动开始时间：</td>
                            <td><span class="act_start_time"></span></td>

                        </tr>
                        <tr>
                            <td>活动结束时间：</td>
                            <td><span class="act_end_time"></span></td>

                        </tr>

                    </table>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary"
                            data-dismiss="modal">关闭
                    </button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>
    <!-- ============================================================== -->
    <!-- 右下角内容 -->
    <div class="content-page">
        <div class="content">


            <!-- 点击首页显示内容 -->
            <div class="bac_img">
                <img src="${APP_PATH }/static/assets/img/backgrounds/1.jpg" alt=""
                     style="height: 545px;width: 1050px;"/>
            </div>


            <!-- 点击参加的社团显示内容 -->
            <div class="main_data" id="commom1">

                <div class="content-page">

                    <div class="content">
                        <div class="card-box">
                            <!--查栏-->
                            <div class="am-g">
                                <div class="am-u-sm-12 am-u-md-3">
                                    <div class="am-input-group am-input-group-sm">
                                        <input type="text" class="am-form-field search-content">
                                        <span class="am-input-group-btn">
				            <button class="am-btn am-btn-default likeSearch" type="button">搜索</button>
				          </span>
                                    </div>
                                </div>
                            </div>
                            <!-- Row end -->
                            <!-- 数据显示-->
                            <div class="am-g">
                                <div class="am-u-sm-12">

                                        <table class="am-table am-table-striped am-table-hover table-main">
                                            <thead>
                                            <tr>
                                                <th class="table-id">ID</th>
                                                <th class="table-title">社团名称</th>
                                                <th class="table-type">社团人数</th>
                                                <th class="table-author am-hide-sm-only">创建时间</th>
                                                <th class="table-set">操作</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${list}" var="com">
                                                <tr>
                                                    <td>${com.comId}</td>
                                                    <td>${com.comName}</td>
                                                    <td class="am-hide-sm-only">${com.comMemberNumber}</td>
                                                    <td class="am-hide-sm-only">${com.comCreateDate}</td>
                                                    <td>
                                                        <div class="am-btn-toolbar">
                                                            <div class="am-btn-group am-btn-group-xs">
                                                                <button class="am-btn am-btn-default am-btn-xs am-text-secondary search_info" data-toggle="modal" data-target="#com_info_modal" mark="${com.comId}">
                                                                    <span class="am-icon-pencil-square-o"></span> 查看详情
                                                                </button>

                                                                <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only exit_com_btn" mark="${com.comId}" page_num=">${page.pageNum}">
                                                                    <span class="am-icon-trash-o"></span> 退出社团
                                                                </button>
                                                            </div>
                                                        </div>
                                                    </td>
                                                </tr>
                                            </c:forEach>


                                            </tbody>
                                        </table>


                                        <%--页码导航开始--%>
                                        <div class="am-cf">当前第<span class="page_num">${page.pageNum}</span>页，
                                            共 ${page.total} 条记录，共<span class="page_toatal">${page.pages}</span>页
                                            <div class="am-fr">
                                                <ul class="am-pagination">
                                                    <li><a href="${APP_PATH}/community/getJoinedCom/<%=user_id%>?pn=1">首页</a>
                                                    </li>
                                                    <%--判断是否已经到达首页--%>
                                                    <c:if test="${page.pageNum==1}">
                                                        <li class="am-disabled"><a href="#">«</a></li>
                                                    </c:if>
                                                    <c:if test="${page.pageNum!=1}">
                                                        <li>
                                                            <a href="${APP_PATH}/community/getJoinedCom/<%=user_id%>?pn=${page.pageNum-1}">«</a>
                                                        </li>
                                                    </c:if>

                                                    <c:forEach items="${page.navigatepageNums}" var="nav">
                                                        <c:if test="${nav==page.pageNum}">
                                                            <li class="daohangNum am-active" name="${nav}"><a
                                                                    href="${APP_PATH}/community/getJoinedCom/<%=user_id%>?pn=${nav}">${nav}</a>
                                                            </li>
                                                        </c:if>
                                                        <c:if test="${nav!=page.pageNum}">
                                                            <li class="daohangNum" name="${nav}"><a
                                                                    href="${APP_PATH}/community/getJoinedCom/<%=user_id%>?pn=${nav}">${nav}</a>
                                                            </li>
                                                        </c:if>

                                                    </c:forEach>



                                                    <c:if test="${page.pageNum==page.pages}">
                                                        <li class="am-disabled">
                                                            <a href="#">»</a>
                                                        </li>
                                                    </c:if>
                                                    <c:if test="${page.pageNum!=page.pages}">
                                                        <li>
                                                            <a href="${APP_PATH}/community/getJoinedCom/<%=user_id%>?pn=${page.pageNum+1}">»</a>
                                                        </li>
                                                    </c:if>
                                                    <li>
                                                        <a href="${APP_PATH}/community/getJoinedCom/<%=user_id%>?pn=${page.pages}">末页</a>
                                                    </li>

                                                </ul>
                                            </div>
                                        </div>
                                        <%--页码导航结束--%>
                                        <hr/>
                                        <p>注：社团一但加入，不可随意退出社团，请端正态度，对社团负责，对自己负责。</p>

                                </div>

                            </div>
                        </div>

                    </div>


                </div>
            </div>
            <!-- 点击申请中的社团显示内容 -->
            <div class="main_data" id="commom2">
                <div class="content-page">

                    <div class="content">
                        <div class="card-box">
                            <!--查栏-->
                            <div class="am-g">
                                <div class="am-u-sm-12 am-u-md-3">
                                    <div class="am-input-group am-input-group-sm">
                                        <input type="text" class="am-form-field temporary_apply_com">
                                        <span class="am-input-group-btn">
				            <button class="am-btn am-btn-default temporary_apply_com_btn" type="button">搜索</button>
				          </span>
                                    </div>
                                </div>
                            </div>
                            <!-- Row end -->
                            <!-- 数据显示-->
                            <div class="am-g">
                                <div class="am-u-sm-12">

                                    <table class="am-table am-table-striped am-table-hover table-main">
                                        <thead>
                                        <tr>
                                            <th class="table-id">社团ID</th>
                                            <th class="table-title">社团名称</th>
                                            <th class="table-type">社团当前人数</th>
                                            <th class="table-author am-hide-sm-only">申请时间</th>
                                            <th class="table-set">操作</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${temp_apply_list}" var="com">
                                            <tr>
                                                <td>${com.community.comId}</td>
                                                <td>${com.community.comName}</td>
                                                <td class="am-hide-sm-only">${com.community.comMemberNumber}</td>
                                                <td class="am-hide-sm-only">${com.applyTime}</td>
                                                <td>
                                                    <div class="am-btn-toolbar">
                                                        <div class="am-btn-group am-btn-group-xs">
                                                            <button class="am-btn am-btn-default am-btn-xs am-text-secondary urge_handle"  status="${com.status}">
                                                                <span class="am-icon-pencil-square-o" ></span>催促处理
                                                            </button>

                                                            <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only calcel_com_btn"  page_num="${page.pageNum}" com_id="${com.community.comId}">
                                                                <span class="am-icon-trash-o"></span> 取消申请
                                                            </button>
                                                        </div>
                                                    </div>
                                                </td>
                                            </tr>
                                        </c:forEach>


                                        </tbody>
                                    </table>


                                    <%--页码导航开始--%>
                                    <div class="am-cf">当前第<span class="page_num">${page.pageNum}</span>页，
                                        共 ${page.total} 条记录，共<span class="page_toatal">${page.pages}</span>页
                                        <div class="am-fr">
                                            <ul class="am-pagination">
                                                <li><a href="${APP_PATH}/applycommunity/GetApplyCommunity/<%=user_id%>?pn=1">首页</a>
                                                </li>
                                                <%--判断是否已经到达首页--%>
                                                <c:if test="${page.pageNum==1}">
                                                    <li class="am-disabled"><a href="#">«</a></li>
                                                </c:if>
                                                <c:if test="${page.pageNum!=1}">
                                                    <li>
                                                        <a href="${APP_PATH}/applycommunity/GetApplyCommunity/<%=user_id%>?pn=${page.pageNum-1}">«</a>
                                                    </li>
                                                </c:if>

                                                <c:forEach items="${page.navigatepageNums}" var="nav">
                                                    <c:if test="${nav==page.pageNum}">
                                                        <li class="daohangNum am-active" name="${nav}"><a
                                                                href="${APP_PATH}/applycommunity/GetApplyCommunity/<%=user_id%>?pn=${nav}">${nav}</a>
                                                        </li>
                                                    </c:if>
                                                    <c:if test="${nav!=page.pageNum}">
                                                        <li class="daohangNum" name="${nav}"><a
                                                                href="${APP_PATH}/applycommunity/GetApplyCommunity/<%=user_id%>?pn=${nav}">${nav}</a>
                                                        </li>
                                                    </c:if>

                                                </c:forEach>



                                                <c:if test="${page.pageNum==page.pages}">
                                                    <li class="am-disabled">
                                                        <a href="#">»</a>
                                                    </li>
                                                </c:if>
                                                <c:if test="${page.pageNum!=page.pages}">
                                                    <li>
                                                        <a href="${APP_PATH}/applycommunity/GetApplyCommunity/<%=user_id%>?pn=${page.pageNum+1}">»</a>
                                                    </li>
                                                </c:if>
                                                <li>
                                                    <a href="${APP_PATH}/applycommunity/GetApplyCommunity/<%=user_id%>?pn=${page.pages}">末页</a>
                                                </li>

                                            </ul>
                                        </div>
                                    </div>
                                    <%--页码导航结束--%>
                                    <hr/>
                                    <p>注：不可恶意多次申请退出，扰乱系统正常运作。</p>

                                </div>

                            </div>
                        </div>

                    </div>


                </div>
            </div>
            <!-- 点击已经参加的活动显示内容 -->
            <div class="main_data" id="commom3">
                <div class="content-page">

                    <div class="content">
                        <div class="card-box">
                            <!--查栏-->
                            <div class="am-g">
                                <div class="am-u-sm-12 am-u-md-3">
                                    <div class="am-input-group am-input-group-sm">
                                        <input type="text" class="am-form-field over_activity_input">
                                        <span class="am-input-group-btn">
				            <button class="am-btn am-btn-default over_activity_btn" type="button">搜索</button>
				          </span>
                                    </div>
                                </div>
                            </div>
                            <!-- Row end -->
                            <!-- 数据显示-->
                            <div class="am-g">
                                <div class="am-u-sm-12">

                                    <table class="am-table am-table-striped am-table-hover table-main">
                                        <thead>
                                        <tr>
                                            <th class="table-type">社团名称</th>
                                            <th class="type">活动名称</th>
                                            <th class="table-type">活动人数</th>
                                            <th class="table-set">操作</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${ActivityList}" var="com">
                                            <tr>

                                                <td>${com.activity.community.comName}</td>
                                                <td class="am-hide-sm-only">${com.activity.activityTheme}</td>
                                                <td class="am-hide-sm-only">${com.activity.actPeopleCount}</td>
                                                <td>
                                                    <div class="am-btn-toolbar">
                                                        <div class="am-btn-group am-btn-group-xs">
                                                            <button class="am-btn am-btn-default am-btn-xs am-text-secondary act_info_btn"  data-toggle="modal" data-target="#act_info_modal"  act_id="${com.activity.id}">
                                                                <span class="am-icon-pencil-square-o" ></span>活动详情
                                                            </button>

                                                            <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only calcel_com_btn"  page_num="${page.pageNum}" >
                                                                <span class="am-icon-trash-o"></span> 活动评价
                                                            </button>
                                                        </div>
                                                    </div>
                                                </td>
                                            </tr>
                                        </c:forEach>


                                        </tbody>
                                    </table>


                                    <%--页码导航开始--%>
                                    <div class="am-cf">当前第<span class="page_num">${page.pageNum}</span>页，
                                        共 ${page.total} 条记录，共<span class="page_toatal">${page.pages}</span>页
                                        <div class="am-fr">
                                            <ul class="am-pagination">
                                                <li><a href="${APP_PATH}/ddActMember/getJoinedAct/<%=user_id%>?pn=1">首页</a>
                                                </li>
                                                <%--判断是否已经到达首页--%>
                                                <c:if test="${page.pageNum==1}">
                                                    <li class="am-disabled"><a href="#">«</a></li>
                                                </c:if>
                                                <c:if test="${page.pageNum!=1}">
                                                    <li>
                                                        <a href="${APP_PATH}/ddActMember/getJoinedAct/<%=user_id%>?pn=${page.pageNum-1}">«</a>
                                                    </li>
                                                </c:if>

                                                <c:forEach items="${page.navigatepageNums}" var="nav">
                                                    <c:if test="${nav==page.pageNum}">
                                                        <li class="daohangNum am-active" name="${nav}"><a
                                                                href="${APP_PATH}/ddActMember/getJoinedAct/<%=user_id%>?pn=${nav}">${nav}</a>
                                                        </li>
                                                    </c:if>
                                                    <c:if test="${nav!=page.pageNum}">
                                                        <li class="daohangNum" name="${nav}"><a
                                                                href="${APP_PATH}/ddActMember/getJoinedAct/<%=user_id%>?pn=${nav}">${nav}</a>
                                                        </li>
                                                    </c:if>

                                                </c:forEach>



                                                <c:if test="${page.pageNum==page.pages}">
                                                    <li class="am-disabled">
                                                        <a href="#">»</a>
                                                    </li>
                                                </c:if>
                                                <c:if test="${page.pageNum!=page.pages}">
                                                    <li>
                                                        <a href="${APP_PATH}/ddActMember/getJoinedAct/<%=user_id%>?pn=${page.pageNum+1}">»</a>
                                                    </li>
                                                </c:if>
                                                <li>
                                                    <a href="${APP_PATH}/ddActMember/getJoinedAct/<%=user_id%>?pn=${page.pages}">末页</a>
                                                </li>

                                            </ul>
                                        </div>
                                    </div>
                                    <%--页码导航结束--%>
                                    <hr/>
                                    <p>注：只有参加过的活动参可以评价</p>

                                </div>

                            </div>
                        </div>

                    </div>


                </div>
            </div>
            <!-- 点击进行中的活动显示内容 -->
            <div class="main_data" id="commom4">4</div>
            <!-- 点击结束的活动显示内容 -->
            <div class="main_data" id="commom5">5</div>
            <!-- end right Content here -->
            <!--</div>-->
        </div>
    </div>


</div>


</body>

</html>
