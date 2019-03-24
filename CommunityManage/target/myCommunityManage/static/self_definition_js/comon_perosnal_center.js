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
                //显示第一页参加结束的活动
                window.location.href = "http://localhost:8080/CommunityManage/ddActMember/getUnderwayAct/" + $('#input').val();
                $("#commom4").siblings().css('display', 'none');
                $("#commom4").css('display', 'block');
                break;
            default:
                //活动推荐，第一页
                window.location.href = "http://localhost:8080/CommunityManage/activity/getActivityRecommend/" + $('#input').val() + "/" + $("#userlabel").val();
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
            url: path_root + "/activity/getActivityCommunity/" + act_id,
            type: "GET",
            success: function (result) {

                console.log(result);
                var activity = result.extend.activity;
                var community = activity.community;
                var chariman = community.chairman;
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
                var activityStartTime = datetimeFormat(activity.activityStartTime);
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
    function datetimeFormat(longTypeDate) {
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
    function dateFormat(longTypeDate) {
        var dateTypeDate = "";
        var date = new Date();
        date.setTime(longTypeDate);
        dateTypeDate += date.getFullYear();   //年
        dateTypeDate += "-" + getMonth(date); //月
        dateTypeDate += "-" + getDay(date);   //日
        return dateTypeDate;
    }

    //返回 01-12 的月份值
    function getMonth(date) {
        var month = "";
        month = date.getMonth() + 1; //getMonth()得到的月份是0-11
        if (month < 10) {
            month = "0" + month;
        }
        return month;
    }

    //返回01-30的日期
    function getDay(date) {
        var day = "";
        day = date.getDate();
        if (day < 10) {
            day = "0" + day;
        }
        return day;
    }

    //小时
    function getHours(date) {
        var hours = "";
        hours = date.getHours();
        if (hours < 10) {
            hours = "0" + hours;
        }
        return hours;
    }

    //分
    function getMinutes(date) {
        var minute = "";
        minute = date.getMinutes();
        if (minute < 10) {
            minute = "0" + minute;
        }
        return minute;
    }

    //秒
    function getSeconds(date) {
        var second = "";
        second = date.getSeconds();
        if (second < 10) {
            second = "0" + second;
        }
        return second;
    }

//初始化星星评价
    $('#total_score').rating({
        min: 0,
        max: 5,
        step: 0.1,
        size: 'md',
        showClear: false,
        readonly: true
    });
    //自己为活动打的分数
    $('#self_evaluate').rating({
        min: 0,
        max: 5,
        step: 0.1,
        size: 'xs',
        showClear: false
    });
    //查看活动评价
    $(document).on("click", ".evaluate_btn", function () {
        $(".comment_textarea").val("");
        $('#self_evaluate').rating('reset');
        // $('#total_score').rating('update', 3); //这样子把值存进去。
        //$("#act_evaluate_modal").modal('show');
        //  var ratingValue = $('#total_score').rating().val();
        var act_id = $(this).attr("act_id");
        //1、将增加评论添加活动id属性
        $(".comment_btn").attr("act_id", act_id);
        //2、获取活动平均得分，并赋值
        build_average_score(act_id);
        //3、去首页
        to_page(act_id, 1);

    })

    function build_average_score(act_id) {

        $.ajax({
            url: path_root + "/evaluate/getEvaluateScoreByActId/" + act_id,
            type: "GET",
            success: function (result) {

                $('#total_score').rating('update', result.extend.average_score); //这样子把值存进去。
            }
        });
    }

    function to_page(act_id, pn) {
        $.ajax({
            url: path_root + "/evaluate/getActivityEvaluate/" + act_id,
            data: "pn=" + pn,
            type: "GET",
            success: function (result) {


                //1、解析并显示活动评价内容
                build_comments(result);
                //2、解析并显示分页信息
                build_page_info(result);
                //3、解析显示分页条数据;
                build_page_nav(act_id, result);
            }
        });
    }

    function build_comments(result) {
        //清空table表格
        $(".comment_div").empty();


        var comments = result.extend.pageInfo.list;
        $.each(comments, function (index, item) {

            //评论内容div
            var outline = $("<div class='row'></div>");
            var comment_content = $("<div class='col-md-12' style=\"font-family: '微软雅黑', Arial;\"></div>").append(item.memEva);
            outline.append(comment_content).appendTo(".comment_div");
            $("<br>").appendTo(".comment_div")
//评论成员姓名
            var name = $("<span></span>").append(item.member.memberName);
            var mem_name_outline = $("<div class='col-md-4'>评论成员:</div>").append(name);
//评论成员评分
            var comments = $("<div class='col-md-3'>&nbsp;&nbsp;评分：</div>")
            var score = $("<span></span>").append(item.evaScore);
            var comment_outline = comments.append(score).append("分");
//评论时间
            var comment_time = $("<div class=\"col-md-5\">评论时间:</div>");
            var time_content = $("<span></span>").append(item.evaTime);
            var time_outline = comment_time.append(time_content);
//放入div
            $(outline).append(comment_outline).append(mem_name_outline).append(time_outline).appendTo(".comment_div");
            $("<br>").appendTo(".comment_div")


        });

    }

    function build_page_info(result) {

        //清空表格
        $(".nav-comment").empty();
        $(".nav-comment").append("当前" + result.extend.pageInfo.pageNum + "页,总" +
            result.extend.pageInfo.pages + "页,总" +
            result.extend.pageInfo.total + "条记录")
        totalRecord = result.extend.pageInfo.total;
        currentPage = result.extend.pageInfo.pageNum;
    }

    //解析显示分页条，点击分页要能去下一页....
    function build_page_nav(act_id, result) {
        //page_nav_area
        var ul = $("<ul></ul>").addClass("am-pagination");

        //构建元素
        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href", "#"));
        var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
        if (result.extend.pageInfo.hasPreviousPage == false) {
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        } else {
            //为元素添加点击翻页的事件
            firstPageLi.click(function () {
                to_page(act_id, 1);
            });
            prePageLi.click(function () {
                to_page(act_id, result.extend.pageInfo.pageNum - 1);
            });
        }


        var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
        var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href", "#"));
        if (result.extend.pageInfo.hasNextPage == false) {
            nextPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        } else {
            nextPageLi.click(function () {
                to_page(act_id, result.extend.pageInfo.pageNum + 1);
            });
            lastPageLi.click(function () {
                to_page(act_id, result.extend.pageInfo.pages);
            });
        }


        //添加首页和前一页 的提示
        ul.append(firstPageLi).append(prePageLi);
        //1,2，3遍历给ul中添加页码提示
        $.each(result.extend.pageInfo.navigatepageNums, function (index, item) {

            var numLi = $("<li></li>").append($("<a></a>").append(item));
            if (result.extend.pageInfo.pageNum == item) {
                numLi.addClass("active");
            }
            numLi.click(function () {
                to_page(act_id, item);
            });
            ul.append(numLi);
        });
        //添加下一页和末页 的提示
        ul.append(nextPageLi).append(lastPageLi);

        //把ul加入到nav
        var navEle = $("<nav></nav>").append(ul);
        var nav_out = $("<div class='am-fr nav_num'> </div>");
        nav_out.append(navEle);
        $(".nav-comment").append(nav_out);
    }


    //点击提交评论
    $(document).on("click", ".comment_btn", function () {

        var mem_id = user_id;
        var comment_textarea = $(".comment_textarea").val().trim();
        var ratingValue = $('#self_evaluate').rating().val();
        //获取活动id
        var act_id = $(this).attr("act_id");


        if (ratingValue == "") {
            toastr.warning("您没有对活动评价分数，请评分后提交")
        } else {

            if (comment_textarea.length <= 20) {
                toastr.warning("评价内容必须大于20个子，小于50个字！")
            } else {
                //1.检查是否已经评价过了
                checkIsEvaluate(mem_id, act_id, comment_textarea, ratingValue);
            }

        }
    })

    function checkIsEvaluate(mem_id, act_id, comment_textarea, ratingValue) {
        $.ajax({
            url: path_root + "/evaluate/checkIsEvaluate/" + mem_id + "/" + act_id,
            type: "GET",
            success: function (result) {

                if (result.code == 100) {

                    insertEvaluate(mem_id, act_id, comment_textarea, ratingValue);
                } else {
                    toastr.warning("您已经评价一次，不能参与评价")
                }
            }
        });
    }

    function insertEvaluate(mem_id, act_id, comment_textarea, ratingValue) {
        var insert_Evaluate = {
            "memId": mem_id,
            "actId": act_id,
            "memEva": comment_textarea,
            "evaScore": ratingValue
        }

        $.ajax({
            url: path_root + "/evaluate/insertEvaluate",
            type: "POST",
            data: JSON.stringify(insert_Evaluate),
            contentType: "application/json; charset=utf-8",
            success: function (result) {

                if (result.code == 100) {

                    toastr.success("评论成功");
                    //把评价数据初始化
                    $(".comment_textarea").val("");
                    $('#self_evaluate').rating('reset');

                    //1、获取活动平均得分，并赋值
                    build_average_score(act_id);
                    //2、跳转到首页
                    to_page(act_id, 1);
                } else {
                    toastr.fail("评论异常，请稍后再试，或者联系管理员！")
                }
            }
        });
    }


    /*****************************************************************************************/
    /*进行中的活动开始*/
    //模糊查询实现搜索；
    $(".underway_act_search_btn").click(function () {
        var mem_id = user_id;
        var condition = $(".underway_activity").val();

        if (condition.trim() != "") {
            window.location.href = path_root + "/ddActMember/likeUnderwayAct/" + mem_id + "/" + condition;
        } else {
            toastr.warning("搜索值不能为空")
        }
    })


    //模糊查询实现推荐活动的查询；
    $(".recommend_search_btn").click(function () {
        var mem_id = user_id;
        var condition = $(".recommend_search_input").val().trim();

        if (condition.trim() != "") {
            window.location.href = "http://localhost:8080/CommunityManage/activity/getLikeActivityRecommend/"
                + $('#input').val() + "/" + $("#userlabel").val() + "/" + condition;
        } else {
            toastr.warning("搜索值不能为空")
        }
    })


    //点击活动报名
    $(document).on("click", ".act_register_btn", function () {
        var memid = user_id;
        var act_id = $(this).attr("act_id");
        var com_id = $(this).attr("com_id");
        var act_number=Number($(this).attr("act_number"))+1;
alert(memid);
        //判断是否属于此活动社团的人员
        $.ajax({

            url: path_root+"/community/checkIsMember/" + com_id + "/" + memid,
            type: 'GET',
            success: function (result) {
//状态码   100-成功    200-失败
                if (result.code == 100) {

                    toastr.warning("您还不是此活动举办社团的成员，请前去首页申请加入社团！");


                } else {
                    if (confirm("您已经是该社团成员，是否直接加入活动？")) {
                        joinActivity(memid, act_id,act_number);
                    }

                }

            }
        })
    });


    function joinActivity(memid, act_id,act_number) {
        $.ajax({

            url: path_root+"/ddActMember/userInsertActivity/" + memid + "/" + act_id+ "/"+act_number,
            type: 'POST',
            data:'',
            success: function (result) {
if (result.code==100){

    toastr.success("参与成功");
    setTimeout(function () {
        window.location.href = "http://localhost:8080/CommunityManage/activity/getActivityRecommend/" + memid+ "/" + $("#userlabel").val();

    }, 1500)
}else {
    toastr.success("加入异常");
}
            }
        });
    }
});

