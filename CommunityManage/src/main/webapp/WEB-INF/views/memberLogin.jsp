<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>苏州科技大学社团管理登陆</title>
    <%
        application.setAttribute("APP_PATH", request.getContextPath());
    %>


    <!-- CSS -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
    <link
            href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
            rel="stylesheet">
    <link rel="stylesheet" href="${APP_PATH }/static/assets/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${APP_PATH }/static/assets/css/form-elements.css">
    <link rel="stylesheet" href="${APP_PATH }/static/assets/css/style.css">

    <!-- Favicon and touch icons -->
    <link rel="shortcut icon" href="${APP_PATH }/static/assets/ico/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144"
          href="${APP_PATH }/static/assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114"
          href="${APP_PATH }/static/assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72"
          href="${APP_PATH }/static/assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="${APP_PATH }/static/assets/ico/apple-touch-icon-57-precomposed.png">

</head>


<body style="background: url(${APP_PATH }/static/assets/img/backgrounds/1.jpg) no-repeat center center;">
<!-- 社团成员注册模态框 -->
<div class="modal fade" id="userRigisterModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">普通用户注册</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal"  ENCTYPE="multipart/form-data">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">学号：</label>
                        <div class="col-sm-10">


                            <input type="text" id="memberId_add_input" class="form-control col-sm-10" maxlength="12" title="学号"
                                   name="memberId"
                                   data-original-title="" data-toggle="popover" data-placement="right" placeholder="学号"
                                   data-content="">
                            <span class="glyphicon glyphicon-remove-circle col-sm-2 " style="display: inline;color: red;"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">姓名：</label>
                        <div class="col-sm-10 ">

                            <input type="text" name="memberName" class=" col-sm-10 form-control" id="memberName_add_input" maxlength="8" title="姓名"
                                   data-original-title="" data-toggle="popover" data-placement="right" data-content=""
                                   placeholder="姓名">
                            <span class="glyphicon glyphicon-remove-circle col-sm-2 " style="display: inline;color: red;"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">密码：</label>
                        <div class="col-sm-10">
                            <input type="text" name="memberPassword" class="form-control col-sm-10 " id="memberPassword_add_input"
                                   placeholder="******">

                        </div>
                    </div>
                    <div class="form-group" id="color">
                        <label class="col-sm-2 control-label">性别：</label>
                        <div class="col-sm-10" style="text-align: justify;"><label class="btn btn-default">
                            <input type="radio" value="男" name="sex"> 男
                        </label>
                            <label class="btn btn-default" style="margin-left: 70px;">
                                <input type="radio" value="女" name="sex"> 女
                            </label>
                        </div>

                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">兴趣：</label>
                        <div class="col-sm-10">
                             <textarea class="form-control" rows="1" name="interest" id="interest_add_input" title="兴趣"
                                       data-original-title="" data-toggle="popover" data-placement="right" data-content=""
                                       placeholder="格式：唱歌 跳舞 跑步"></textarea>
                        </div>

                    </div>


                    <div class="form-group">
                        <label class="col-sm-2 control-label">手机号：</label>
                        <div class="col-sm-10">
                            <input type="text" name="phone" class="form-control col-sm-10" id="phone_add_input" title="手机号"
                                   data-original-title="" data-toggle="popover" data-placement="right" data-content=""
                                   placeholder="15105165751">
                            <span class="glyphicon glyphicon-remove-circle col-sm-2 " style="display: inline;color: red;"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">班级：</label>
                        <div class="col-sm-10">
                            <input type="text" name="classNum" class="form-control" id="classNum_add_input"
                                   placeholder="Z1512">

                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-sm-2 control-label">头像：</label>
                        <div class="col-sm-10">

                            <input type="file" id="inputfile" class="btn-lg btn">
                        </div>

                    </div>


                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="user_save_btn" >注册</button>
            </div>
        </div>
    </div>
</div>


<!-- Top content -->
<div class="top-content">
    <div class="text" style="float:right;margin-right: 8px;">
        <div class="btn" id="register_view">
            <span class="glyphicon glyphicon-user"></span> <label>若同学还未注册，请点击注册进行登陆！</label>
        </div>
    </div>
    <div class="inner-bg">
        <div class="container">

            <div class="row">
                <div class="col-sm-8 col-sm-offset-2 text">
                    <input id="PageContext" type="hidden" value="${pageContext.request.contextPath}"/>
                    <h1 style="font-family:'华文行楷';font-weight:bold;"><strong>苏州科技大学社团管理系统</strong></h1>
                    <div class="description">
                        <p style="font-family:'Freestyle Script';font-size: 30px;">
                            Association Management System of Suzhou University of Science and Technology
                        </p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 form-box">
                    <div class="form-top">
                        <div class="form-top-left" style="font-family:'华文行楷';">
                            <h3>欢迎来到<label style="font-size: 30px" id="right_control_info">社团成员</label>登陆</h3>

                        </div>
                        <div class="form-top-right">
                            <i class="fa fa-key"></i>
                        </div>
                    </div>
                    <div class="form-bottom">
                        <form role="form" action="#" method="post" class="login-form">
                            <div class="form-group">
                                <label class="sr-only" for="form-username">ID号：</label>
                                <input type="text" name="memberId" placeholder="请输入ID..."
                                       class="form-username form-control" id="form-username">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="form-password">密码：</label>
                                <input type="password" name="memberPassword" placeholder="请输入密码..."
                                       class="form-password form-control" id="form-password">
                            </div>
                            <div><p class="login_hint_info"></p></div>
                            <button type="button" class="btn login_btn user_login_btn" user_limit="1">登陆</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 social-login">

                    <div class="social-login-buttons">
                        <a class="btn btn-link-1 btn-link-1-facebook commen_user">
                            <i class="fa fa-users"></i>社团成员
                        </a>
                        <a class="btn btn-link-1 btn-link-1-twitter chairman_user">
                            <i class="fa fa-user"></i>社团会长
                        </a>
                        <a class="btn btn-link-1 btn-link-1-google-plus admin_user">
                            <i class="fa fa-user-secret"></i>超级管理
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>


<!-- Javascript -->


<script src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH }/static/assets/js/jquery.backstretch.min.js"></script>
<script src="${APP_PATH }/static/assets/js/scripts.js"></script>
<script src="${APP_PATH }/static/self_definition_js/login.js"></script>
<script src="${APP_PATH }/static/toastr/toastr.min.js"></script>
<script src="${APP_PATH }/static/js/ajaxfileupload.js"></script>

<link rel="stylesheet" href="${APP_PATH }/static/toastr/toastr.min.css">


<script type="text/javascript">
    //清空表单样式及内容
    function reset_form(ele) {
        $(ele)[0].reset();
        //清空表单样式
        $(ele).find("*").removeClass("has-error has-success");
        $(ele).find(".help-block").text("");

    }

    //点击注册，启动注册模态框
    $("#register_view").click(function () {
        if ($(".user_login_btn").attr("user_limit") == "1") {
            reset_form("#userRigisterModal form");
            $("#userRigisterModal").modal({
                backdrop: "static"
            });
        }

    })
</script>
<script type="text/javascript">

function  disclosetankuan(ele1,ele2,ele3){
    $(ele1).popover("hide");
    $(ele2).popover("hide");
    $(ele3).popover("hide");

}
    //注册提交
    $("#user_save_btn").click(function () {



        var regphone = /^[1][3,4,5,7,8][0-9]{9}$/;
        var memberphone= $("#phone_add_input").val();
var flagphone=regphone.test(memberphone);


        var regId = /^(1)(\d{11})$/;
        var memberId =  $("#memberId_add_input").val();
        var flagid=regId.test(memberId);

        var regInterest = /^[\u4E00-\u9FFF]+$/;
        var memberInterest =  $("#interest_add_input").val();
        var flagInterest=regInterest.test(memberInterest);




        if($("#phone_add_input").val()==""||$("#memberName_add_input").val()==""||$("#memberId_add_input").val()==""||$("#memberPassword_add_input").val()==""){
//警告消息提示，默认背景为橘黄色
            toastr.warning("手机号、姓名、学号、密码不能为空！");
            return false;
            // alert(  $("#userRigisterModal form").serialize())    ;

            // var formData = new FormData($("#userRigisterModal form")[0]);
            // alert(new FormData($("#userRigisterModal form")[0]));
        }else if( !flagphone||!flagid||!flagInterest){
            toastr.error("与要求格式不匹配，检查后再注册");
            return false;
        }else {
       // alert(  $("#userRigisterModal form").serialize())    ;
          //  alert($("#inputfile").get(0).files[0]);
            var currntTime=getTime();

var fileObj=$("#inputfile").get(0).files[0];
            var formFile = new FormData();
            var memberName=$("#memberName_add_input").val();
            var memberPassword=$("#memberPassword_add_input").val();
            var classNum=$("#classNum_add_input").val();
            var sex=  $("input:radio:checked").val();

            formFile.append("memberId", memberId);
            formFile.append("memberName", memberName);
            formFile.append("memberPassword",memberPassword);
            formFile.append("sex", sex);
            formFile.append("interest", memberInterest );
            formFile.append("phone", memberphone);
            formFile.append("classNum",classNum);
            formFile.append("file", fileObj);


            var data = formFile;
            $.ajax({

                url: "${APP_PATH }/users/save",
                type: 'POST',
                cache: false,
                data:data,
                processData: false,
                contentType: false,
                success: function (result) {
                    if (result.code == 100) {
                        //提示注册成功
                        toastr.success("注册成功");
                        //关闭模态框
                        $("#userRigisterModal").modal("hide");


                    } else {
                        if (result.extend.errorFields.memberId != undefined) {
                            toastr.error(result.extend.errorFields);

                        }
                        if (result.extend.errorFields.phone != undefined) {
                            toastr.error(result.extend.errorFields);

                        }

                    }


                }
            })
        }
    })
    //手机号验证
    $("#phone_add_input").bind('input propertychange blur', function (){


        var regphone = /^[1][3,4,5,7,8][0-9]{9}$/;

        var memberphone = this.value;
        if (memberphone==""){
            show_validate_msg("#phone_add_input", "格式错误", "手机号不能为空", "格式错误");
            $(this).popover('show');
            disclosetankuan("#memberName_add_input","#memberId_add_input","#interest_add_input");
            $(".glyphicon-remove-circle").eq(2).show();
            }

        if(!regphone.test(memberphone)){

            show_validate_msg("#phone_add_input", "格式错误", "手机号码格式有误", "格式错误");
            $(this).popover('show');
            disclosetankuan("#memberName_add_input","#memberId_add_input","#interest_add_input");
            $(".glyphicon-remove-circle").eq(2).show();

        }else {
            $(this).popover('hide');
            $(".glyphicon-remove-circle").eq(2).hide();
        }

    })
//验证输入的兴趣规则
$("#interest_add_input").bind('input propertychange blur', function (){

    disclosetankuan();
    var regInterest = /^[\u4E00-\u9FFF]+$/;

    var memberInterest = this.value;
    if (memberInterest==""){
        $(this).popover('hide');
        return false;}
        var interest= memberInterest.replace(/\s/g,"");
    if(!regInterest.test(interest)){

            show_validate_msg("#interest_add_input", "格式错误", "例子：唱歌 跳舞 游泳", "格式错误");
            $(this).popover('show');
        disclosetankuan("#memberName_add_input","#memberId_add_input","#phone_add_input");

    }else {
        $(this).popover('hide');

    }

})
    //验证名字的合理性
    $("#memberName_add_input").bind('input propertychange blur', function () {
        //前端验证输入的姓名
        var memberName = this.value;
        var regName = /^[\u4E00-\u9FA5A-Za-z]+$/;
        if (!regName.test(memberName)) {

            show_validate_msg("#memberName_add_input", "格式错误", "用户名为在校真实姓名", "格式错误");
            $(this).popover('show');
            disclosetankuan("#interest_add_input","#memberId_add_input","#phone_add_input");
            $(".glyphicon-remove-circle").eq(1).show();

        } else {
            show_validate_msg("#memberName_add_input", "格式正确", "用户名合法", "输入合理");
            $(this).popover('hide');
            $(".glyphicon-remove-circle").eq(1).hide();
        }
    })
//实时验证用户id的合理性
    $("#memberId_add_input").bind('input propertychange blur', function () {


        //获取input 元素,并实时监听用户输入id

        //前端验证输入的id
        var memberId = this.value;
        var regId = /^(1)(\d{11})$/;
        if (!regId.test(memberId)) {

            show_validate_msg("#memberId_add_input", "格式错误", "用户ID以1开头的12位整数", "错误信息");
            $(this).popover('show');
            disclosetankuan("#interest_add_input","#memberName_add_input","#phone_add_input");
            $(".glyphicon-remove-circle").eq(0).show();
            return false;
        } else {
            $.ajax({
                url: "${APP_PATH }/users/check/" + memberId,
                type: "GET",
                success: function (result) {

                    if (result.code == 200) {
                        if (result.extend.info == "用户学号不符合规则") {
                            show_validate_msg("#memberId_add_input", "用户错误", result.extend.info, "输入错误");
                        } else if (result.extend.info == "用户Id已经被使用") {
                            show_validate_msg("#memberId_add_input", "用户错误", result.extend.info, "输入错误");

                        }

                        $(this).popover('show');
                        disclosetankuan("#interest_add_input","#memberName_add_input","#phone_add_input");
                        $(".glyphicon-remove-circle").eq(0).show();

                    } else if (result.code == 100) {

                        $(this).popover('hide');

                        show_validate_msg("#memberId_add_input", "用户合理", "用户可以使用注册", "输入可用");
                        $(".glyphicon-remove-circle").eq(0).hide();

                    }
                }
            })


        }
    })

    //popover
    function show_validate_msg(ele, title, content, head) {
        $(ele).attr("title", title).attr("data-content", content).attr("data-original-title", head);
        $(".popover-title").text(head).next().text(content);
        $(ele).popover("show");
    }
//设置toastr的参数
    $(function(){
//隐藏所有错误图标

//参数设置，若用默认值可以省略以下面代

        toastr.options = {

            "closeButton": false, //是否显示关闭按钮

            "debug": false, //是否使用debug模式

            "positionClass": "toast-bottom-right",//弹出窗的位置

            "showDuration": "200",//显示的动画时间

            "hideDuration": "1000",//消失的动画时间

            "timeOut": "3000", //展现时间

            "extendedTimeOut": "1000",//加长展示时间

            "showEasing": "swing",//显示时的动画缓冲方式

            "hideEasing": "linear",//消失时的动画缓冲方式

            "showMethod": "fadeIn",//显示时的动画方式

            "hideMethod": "fadeOut" //消失时的动画方式

        };

// 清除窗口绑定
//
//         $("#clear").click(function(){
//
//             toastr.clear();
//
//         })
//
   });





function getTime() {
    /**
     *
     * 获取当前时间
     */
    function getNow(s) {
        return s < 10 ? '0' + s: s;
    }
    var myDate = new Date();
//获取当前年
    var year=myDate.getFullYear();
//获取当前月
    var month=myDate.getMonth()+1;
//获取当前日
    var date=myDate.getDate();
    var h=myDate.getHours();       //获取当前小时数(0-23)
    var m=myDate.getMinutes();     //获取当前分钟数(0-59)
    var s=myDate.getSeconds();

    var now=year+'-'+getNow(month)+"-"+getNow(date)+" "+getNow(h)+':'+getNow(m)+":"+getNow(s);
    return now;
}
</script>

<style>
    /*设置弹出气泡；*/
    .popover {
        width: inherit;
    }
</style>
</body>

</html>