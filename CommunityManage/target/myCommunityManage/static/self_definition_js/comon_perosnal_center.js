$(function () {

    //设置toastr插件参数
    //参数设置，若用默认值可以省略以下面代

    toastr.options = {

        "closeButton": false, //是否显示关闭按钮

        "debug": false, //是否使用debug模式

        "positionClass": "toast-center-center",//弹出窗的位置

        "showDuration": "200",//显示的动画时间

        "hideDuration": "1000",//消失的动画时间

        "timeOut": "2000", //展现时间

        "extendedTimeOut": "1000",//加长展示时间

        "showEasing": "swing",//显示时的动画缓冲方式

        "hideEasing": "linear",//消失时的动画缓冲方式

        "showMethod": "fadeIn",//显示时的动画方式

        "hideMethod": "fadeOut" //消失时的动画方式

    };
//获取用户的id
    var user_id = $("#input").val();
    var panduan = $("#check").val();
    //获取项目路径
    var path_root = "";
    var pathName = window.location.pathname.substring(1);
    var webName = pathName == '' ? '' : pathName.substring(0, pathName.indexOf('/'));
    if (webName == "") {
        path_root = window.location.protocol + '//' + window.location.host;
    }
    else {
        path_root = window.location.protocol + '//' + window.location.host + '/' + webName;
    }


    //这是当前页码数
    // var pageNov=$(".page_num").html();
    //这是总共的页码数量
    //var page_toatal=$(".page_toatal").html();

    //当进入个人中心的时候，进行判断点击了哪一个进来的；


    switch (panduan) {
        case "1":
            $("#commom1").siblings().css('display', 'none');
            $("#commom1").css('display', 'block');
            $(".page-title").html("参加的社团");
            break;
        case "2":
            $("#commom2").siblings().css('display', 'none');
            $("#commom2").css('display', 'block');
            $(".page-title").html("申请中的社团");
            break;
        case "3":
            $("#commom3").siblings().css('display', 'none');
            $("#commom3").css('display', 'block');
            $(".page-title").html("已参加的活动");
            break;
        case "4":
            $("#commom4").siblings().css('display', 'none');
            $("#commom4").css('display', 'block');
            $(".page-title").html("进行中的活动");
            break;
        case "5":
            $("#commom5").siblings().css('display', 'none');
            $("#commom5").css('display', 'block');
            $(".page-title").html("相关活动推荐");
            break;
        default:
            $(".bac_img").siblings().css('display', 'none');
            $(".bac_img").css('display', 'block');
            $(".page-title").html("首页");
    }


    //点击首页更改标题为首页，首页背景设置；
    $("#main_page").click(function () {
        $(".bac_img").siblings().css('display', 'none');
        $(".bac_img").css('display', 'block');
        $(".page-title").html("首页");
    })
//更改标头的内容以及更换右下角的div
    $(".admin-parent a span").click(function () {
        var n = $(this).attr("search");
        switch (n) {
            case "1":
                //显示第一页的已参加社团
                window.location.href = "http://localhost:8080/CommunityManage/community/getJoinedCom/" + $('#input').val();
                // getJoinedCommunity();
                $("#commom1").siblings().css('display', 'none');
                $("#commom1").css('display', 'block');
                break;
            case "2":
                //显示第一页的申请中社团
                window.location.href = "http://localhost:8080/CommunityManage/applycommunity/GetApplyCommunity/" + $('#input').val();
                $("#commom2").siblings().css('display', 'none');
                $("#commom2").css('display', 'block');

                break;
            case "3":
                //显示第一页参加结束的活动
                window.location.href = "http://localhost:8080/CommunityManage/ddActMember/getJoinedAct/" + $('#input').val();
                $("#commom3").siblings().css('display', 'none');
                $("#commom3").css('display', 'block');
                break;
            case "4":
                $("#commom4").siblings().css('display', 'none');
                $("#commom4").css('display', 'block');
                break;
            default:
                $("#commom5").siblings().css('display', 'none');
                $("#commom5").css('display', 'block');
        }
        $(".page-title").html($(this).html());

    })


//点击查看社团详情
    $(document).on("click", ".search_info", function () {

        var com_id = $(this).attr("mark");


        $.ajax({
            url: path_root + "/community/getcommunity_byId/" + com_id,
            type: "GET",
            success: function (result) {

                var community = result.extend.community;
                //社团名称
                var community_name = community.comName;
                $(".commnity_name").empty();
                $(".commnity_name").html(community_name);
                //社团图片地址
                var com_img = community.comImg;
                $(".main_img img").empty();
                $(".main_img img").attr("src", com_img);
                //社团介绍
                var introduction = community.comIntroduction;
                $(".com_introduction").empty();
                $(".com_introduction").html(introduction);
                //社团人数
                var com_number = community.comMemberNumber;
                $(".com_number").empty();
                $(".com_number").html(com_number);

                //社团创建时间
                var creatTime = community.comCreateDate;
                $(".com_creat_time").empty();
                $(".com_creat_time").html(creatTime);

                //社团会长姓名
                var chairman_name = community.chairman.name;
                $(".chair_name").empty();
                $(".chair_name").html(chairman_name);
                //社团会长手机号
                var chairman_phone = community.chairman.phone;
                $(".chair_phone").empty();
                $(".chair_phone").html(chairman_phone);
                setTimeout(function () {
                    $("#com_info_modal").modal('show');

                }, 500)


            }
        });
    })


    $(document).on("click", ".exit_com_btn", function () {
        var mem_id = user_id;
        var com_id = $(this).attr("mark");
        var page_num = $(this).attr("page_num").substring(1);
        if (confirm("退出社团将会清除您在此社团参与活动以及评价的所有信息，确认退出吗？")) {
            //确认，发送ajax请求删除即可
            $.ajax({
                url: path_root + "/community/delcommunity_byId/" + mem_id + "/" + com_id,
                type: "DELETE",
                success: function (result) {
                    if (result.code == 100) {
                        toastr.success("退出成功")
                        setTimeout(function () {
                            window.location.href = path_root + "/community/getJoinedCom/" + mem_id + "?pn=" + page_num;

                        }, 2000)


                    } else {
                        toastr.fail("删除失败！")
                    }

                }
            });
        }

    })


    //点击参加社团的模糊搜索查询
    $(".likeSearch").click(function () {
        var condition = $(".search-content").val();
        var mem_id = user_id;
        window.location.href = path_root + "/community/likeSearchJoinedCom/" + mem_id + "?condition=" + condition;
    })


    /**************************************************************************************************/
    /*用户的申请表*/
//取消申请
    $(document).on("click", ".calcel_com_btn", function () {
        var com_id = $(this).attr("com_id");
        var page_num = $(this).attr("page_num");
        var mem_id = user_id;
        if (confirm("确定取消此社团的申请吗？")) {
            $.ajax({
                url: path_root + "/applycommunity/DelApplyCommunity/" + mem_id + "/" + com_id,
                type: "DELETE",
                success: function (result) {
                    if (result.code == 100) {
                        toastr.success("取消成功")
                        setTimeout(function () {
                            //window.location.href = path_root + "/community/getJoinedCom/" + mem_id + "?pn=" + page_num;
                            window.location.href = path_root + "/applycommunity/GetApplyCommunity/" + mem_id + "?pn=" + page_num;
                        }, 1500)


                    } else {
                        toastr.fail("删除失败！")
                    }

                }
            });
        }
    })
    //用户催促
    $(document).on("click", ".urge_handle", function () {
        var com_id = $(this).next().attr("com_id");
        var page_num = $(this).next().attr("page_num");
        var mem_id = user_id;
        var status = $(this).attr("status");

        if (status != "3") {
            var newstatus = parseInt(status) + 1;
            var updatestaus = {
                "temUserId": mem_id,
                "temComId": com_id,
                "status": newstatus
            }
            $.ajax({
                url: path_root + "/applycommunity/changeApplyCommunityStatus/",
                type: "PUT",
                data: JSON.stringify(updatestaus),
                contentType: "application/json; charset=utf-8",
                success: function (result) {
                    if (result.code == 100) {
                        toastr.success("催促成功")
                        setTimeout(function () {
                            window.location.href = path_root + "/applycommunity/GetApplyCommunity/" + mem_id + "?pn=" + page_num;
                        }, 1500)


                    } else {
                        toastr.fail("催促异常！")
                    }

                }
            });
        } else {
            toastr.warning("催促已经三次了，请耐心等待！")
        }

    })

    //模糊查询临时申请的信息
    $(".temporary_apply_com_btn").click(function () {
        var mem_id = user_id;
        var condition = $(".temporary_apply_com").val();

        if (condition.trim() != "") {
            window.location.href = path_root + "/applycommunity/LikeSearchApplyCommunity/" + mem_id + "/" + condition;
        } else {
            toastr.warning("搜索值不能为空")
        }

    })

    /*********************************************************************************************************/
    //已经结束的活动
    $(".over_activity_btn").click(function () {
        var mem_id = user_id;
        var condition = $(".over_activity_input").val();

        if (condition.trim() == "") {
            toastr.warning("请输入有效内容")
        } else {
            window.location.href = path_root + "/ddActMember/LikeSelectActByUserId/" + mem_id + "/" + condition;
        }

    })

    //查看活动详情
    $(document).on("click", ".act_info_btn", function () {
        var act_id = $(this).attr("act_id");
        $.ajax({
            url: path_root + "/activity/getActivityCommunity/"  + act_id,
            type: "GET",
            success: function (result) {
                var activity = result.extend.activity;
                var community = activity.community;
                var chariman=community.chairman;
                //活动详情
                var activityIntroduction = activity.activityIntroduction;
                $(".act_introduction").empty();
                $(".act_introduction").html(activityIntroduction);
                //活动图片地址
                var activityImg = activity.activityImg;
                $(".main_img img").empty();
                $(".main_img img").attr("src", activityImg);
                //社团会长
                var name = chariman.name;
                $(".chair_name").empty();
                $(".chair_name").html(name);
                //联系会长
                var phone = chariman.phone;
                $(".chair_phone").empty();
                $(".chair_phone").html(phone);

                //活动主题
                var activityTheme = activity.activityTheme;
                $(".act_theme").empty();
                $(".act_theme").html(activityTheme);

                //活动人数
                var actPeopleCount = activity.actPeopleCount;
                $(".act_number").empty();
                $(".act_number").html(actPeopleCount);
                //活动开始时间
                var activityStartTime =datetimeFormat(activity.activityStartTime);
                $(".act_start_time").empty();
                $(".act_start_time").html(activityStartTime);
                //活动结束时间
                var activityEndTime = datetimeFormat(activity.activityEndTime);
                $(".act_end_time").empty();
                $(".act_end_time").html(activityEndTime);
            }
        });
        setTimeout(function () {
            $("#act_info_modal").modal('show');
        }, 1000)

    })
    /*
*将long类型转换为时间
* 时间格式化工具
* 把Long类型的1527672756454日期还原yyyy-MM-dd 00:00:00格式日期
*/
    function datetimeFormat(longTypeDate){
        var dateTypeDate = "";
        var date = new Date();
        date.setTime(longTypeDate);
        dateTypeDate += date.getFullYear();   //年
        dateTypeDate += "-" + getMonth(date); //月
        dateTypeDate += "-" + getDay(date);   //日
        dateTypeDate += " " + getHours(date);   //时
        dateTypeDate += ":" + getMinutes(date);     //分
        dateTypeDate += ":" + getSeconds(date);     //分
        return dateTypeDate;
    }
    /*
     * 时间格式化工具
     * 把Long类型的1527672756454日期还原yyyy-MM-dd格式日期
     */
    function dateFormat(longTypeDate){
        var dateTypeDate = "";
        var date = new Date();
        date.setTime(longTypeDate);
        dateTypeDate += date.getFullYear();   //年
        dateTypeDate += "-" + getMonth(date); //月
        dateTypeDate += "-" + getDay(date);   //日
        return dateTypeDate;
    }
    //返回 01-12 的月份值
    function getMonth(date){
        var month = "";
        month = date.getMonth() + 1; //getMonth()得到的月份是0-11
        if(month<10){
            month = "0" + month;
        }
        return month;
    }
    //返回01-30的日期
    function getDay(date){
        var day = "";
        day = date.getDate();
        if(day<10){
            day = "0" + day;
        }
        return day;
    }
    //小时
    function getHours(date){
        var hours = "";
        hours = date.getHours();
        if(hours<10){
            hours = "0" + hours;
        }
        return hours;
    }
    //分
    function getMinutes(date){
        var minute = "";
        minute = date.getMinutes();
        if(minute<10){
            minute = "0" + minute;
        }
        return minute;
    }
    //秒
    function getSeconds(date){
        var second = "";
        second = date.getSeconds();
        if(second<10){
            second = "0" + second;
        }
        return second;
    }
});

