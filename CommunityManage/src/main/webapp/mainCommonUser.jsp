<%@ page import="com.suke.communitymanage.bean.Member" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>首页</title>
    <%
        Member member = (Member) request.getSession().getAttribute("login_user");
        String img = member.getHeadImg();
        String user_id = member.getMemberId();
    %>
    <script src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
    <link
            href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
            rel="stylesheet">
    <script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script src="${APP_PATH }/static/assets/js/jquery.superslide.2.1.1.js"></script>
    <script src="${APP_PATH }/static/toastr/toastr.min.js"></script>

    <link rel="stylesheet" href="${APP_PATH }/static/toastr/toastr.min.css">

    <link rel="stylesheet" href="${APP_PATH }/static/assets/css/style1.css">

</head>

<body>


<%--社团招聘模态框--%>
<div class="modal fade" id="employModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"
                        aria-hidden="true">×
                </button>
                <h4 class="modal-title" id="employModalLabel" style="font-family:'方正舒体';color: #c0a16b;font-size:30px;">
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
                <button type="button" class="btn btn-primary applyCommunity_btn">
                    申请加入
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<%--<img src="/userheadimg/152040135208.jpg">--%>

<div class="wapper_box">
    <div class="header_box"></div>
    <div class="header_box1">
        <div class="header_box2">
            <a class="logo_box" href="index.html"><img src="${APP_PATH }/images/icon/logo.png"/></a>
            <ul class="nav_box">
                <li class="nav_1"><a class="nav_but" href="mainCommonUser.jsp">网站首页</a></li>
                <li class="nav_1"><a class="nav_but">关于苏科</a>
                    <div class="nav_slide">
                        <div class="nav_slide1">
                            <a href="http://www.usts.edu.cn/">学校官网</a>
                            <a href="http://stu.usts.edu.cn/LOGIN.ASPX">奥兰系统</a>
                            <a href="http://jw.usts.edu.cn/">教务系统</a>
                        </div>
                    </div>
                </li>
                <li class="nav_1"><a class="nav_but">社团招新</a>
                    <div class="nav_slide">
                        <div class="nav_slide1" id="community_names">

                        </div>
                    </div>
                </li>
                <li class="nav_1"><a class="nav_but linked_person">紧急联系</a>

                </li>

                <li class="nav_1"><a class="nav_but" href="${APP_PATH}/jump/personal_center">个人中心</a>

                </li>


                <%--<img alt="${sessionScope.get('user').username}的头像" src="component/ace/assets/avatars/user.jpg" class="nav-user-photo">--%>
                <%--<span class="user-info">--%>
                <%--欢迎，${sessionScope.get('user').reality_name}--%>
                <%--<small>${sessionScope.get('user').group.group_name}</small>--%>
                <%--</span>--%>
                <%--<i class="ace-icon fa fa-caret-down"></i>--%>


            </ul>
            <div class="head_class"
                 style="position:absolute;margin: 20px 3px auto auto;display: inline; text-align: center"><img
                    src="<%=img%>" alt="" class="nav-user-photo"
                    style="border-radius:100%;border:2px solid #FFF;max-width:40px;"/>
                <div style="margin-left: 7px;margin-top: 5px;">欢迎<h4
                        style="display: inline;"><%out.print(member.getMemberName());%></h4>同学到来！
                </div>
            </div>
        </div>
        <script>
            $(".nav_1").mouseenter(function () {
                $(this).find(".nav_slide").stop(true, false);
                $(this).find(".nav_slide").slideDown();
            });

            $(".nav_1").mouseleave(function () {
                $(this).find(".nav_slide").stop(true, false);
                $(".nav_slide").slideUp();
            });
            //$(".producys_box").mouseout(function(){
            // $(this).find(".producys_box1").slideUp();
            //});
        </script>
    </div>
    <!--banner部分开始-->
    <div class="banner_box">
        <ul class="banner_pic">
            <li><img src="${APP_PATH }/images/user_image/banner1.jpg"/></li>
            <li><img src="${APP_PATH }/images/user_image/banner2.jpg"/></li>
            <li><img src="${APP_PATH }/images/user_image/banner3.jpg"/></li>

        </ul>
        <a class="prev" href="javascript:void(0)"></a>
        <a class="next" href="javascript:void(0)"></a>
        <div class="num">
            <ul></ul>
        </div>
    </div>
    <script>
        /*鼠标移过，左右按钮显示*/
        $(".banner_box").hover(function () {
            $(this).find(".prev,.next").fadeTo("show", 0.1);
        }, function () {
            $(this).find(".prev,.next").hide();
        })
        /*鼠标移过某个按钮 高亮显示*/
        $(".prev,.next").hover(function () {
            $(this).fadeTo("show", 0.7);
        }, function () {
            $(this).fadeTo("show", 0.1);
        })
        $(".banner_box").slide({
            titCell: ".num ul",
            mainCell: ".banner_pic",
            effect: "fold",
            autoPlay: true,
            delayTime: 700,
            autoPage: true
        });
    </script>
    <!-- 代码 结束 -->
    <!--banner部分结束-->
    <!--琴棋书画模态框-->
    <!-- 琴模态框（Modal） -->
    <div class="modal fade" id="qinModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"
                            aria-hidden="true">×
                    </button>
                    <h4 class="modal-title" id="qinModalLabel"
                        style="font-family:'方正舒体';color: #c0a16b;font-size:30px;">
                        与琴有约
                    </h4>
                </div>
                <div class="modal-body">


                    <div>
                        <h3 style="font-family: '隶书'；">琴的历史:</h3><br/>
                        <div class="main_img" style="text-align: center"><img src="${APP_PATH }/images/icon/qinimg.jpg"
                                                                              style="border-radius: 40%"></div>
                        <br/>
                        &nbsp;&nbsp;&nbsp;&nbsp;古琴是中华民族最早的弹弦乐器，是中华传统文化之瑰宝。她以其历史久远，文献瀚浩、内涵丰富和影响深远为世人所珍视。湖北曾侯乙墓出土的实物距今有二千四百余年，
                        唐宋以来历代都有古琴精品传世。存见南北朝至清代的琴谱百余种，琴曲达三千首，还有大量关于琴家、琴论、琴制、琴艺的文献，遗存之丰硕堪为中国乐器之最。
                        古时，琴、棋、书、画并称，用以概括中华民族的传统文化。历代涌现出许多著名演奏家，他们是历史文化名人，代代传颂。隋唐时期古琴还传入东亚诸国
                        ，并为这些国家的传统文化所汲取和传承。近代又伴随着华人的足迹遍布世界各地，成为西方人心目中东方文化的象征。

                    </div>


                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary"
                            data-dismiss="modal">关闭
                    </button>

                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
    <!-- 棋模态框 -->
    <div class="modal fade" id="qiModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"
                            aria-hidden="true">×
                    </button>
                    <h4 class="modal-title" id="qiModalLabel" style="font-family:'方正舒体';color: #c0a16b;font-size:30px;">
                        与棋有约
                    </h4>
                </div>
                <div class="modal-body">


                    <div>
                        <h3 style="font-family: '隶书'；">棋的历史:</h3><br/>
                        <div class="main_img" style="text-align: center"><img src="${APP_PATH }/images/icon/qiimg.jpg"
                                                                              style="border-radius: 40%"></div>
                        <br/>
                        &nbsp;&nbsp;&nbsp;&nbsp;围棋的起源 尧舜以棋教子 琴棋书画，中国古代四大艺术，源远流长。 琴棋书画之棋，指的就是围棋。 晋朝人张华在他写的《博物志》中说：
                        “尧造围棋以教子丹朱。”还提到，舜觉得儿子商均不甚聪慧，也曾制作围棋教子。 《路史后记》写得更为详细。尧娶妻富宜氏，生下儿子朱，
                        儿子行为不好，尧很难过，特地制作了围棋，“以闲其情。” 按照这种说法，制造围棋，是为了开发智慧，纯洁性情的

                    </div>


                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary"
                            data-dismiss="modal">关闭
                    </button>

                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
    <!-- 书模态框 -->
    <div class="modal fade" id="shuModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"
                            aria-hidden="true">×
                    </button>
                    <h4 class="modal-title" id="shuModalLabel"
                        style="font-family:'方正舒体';color: #c0a16b;font-size:30px;">
                        与书有约
                    </h4>
                </div>
                <div class="modal-body">


                    <div>
                        <h3 style="font-family: '隶书'；">书的历史:</h3><br/>
                        <div class="main_img" style="text-align: center"><img src="${APP_PATH }/images/icon/shuimg.jpg"
                                                                              style="border-radius: 40%"></div>
                        <br/>
                        &nbsp;&nbsp;&nbsp;&nbsp;中国五千年璀璨的文明及无与伦比的丰富文字记载都已为世人所认可，在这一博大精深的历史长河中，
                        中国的书画艺术以其独特的艺术形式和艺术语言再现了这一历时性的嬗变过程。而具有姊妹性质的书画
                        艺术在历史的嬗变中又以其互补性和独立性释读了中国传统文化内涵。由于书、画创作所采用的工具与材
                        料具有一致性。《历代名画记》中谈论古文字、图画的起源时说：“是时也，书、画同体而未分，象制肇创
                        而犹略，无以传其意，故有书；无以见其形，故有画”。书画虽然具有同源的可比性，但以后的发展状况
                        是以互补的独立性发展变化的。中国书法艺术的形成、发展与汉文字的产生与演进存在着密不可分的连带关系。
                        那么究竟什么是“书法”呢？我们可以从它的性质、美学特征、源泉、独特的表现手法方面去理解。书法是以汉
                        字为基础、用毛笔书写的、具有四维特征的抽象符号艺术，它体现了万事万物的“对立统一”这个基本规律又反
                        映了人作为主体的精神、气质、学识和修养。

                    </div>


                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary"
                            data-dismiss="modal">关闭
                    </button>

                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
    <!-- 画模态框 -->
    <div class="modal fade" id="huaModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"
                            aria-hidden="true">×
                    </button>
                    <h4 class="modal-title" id="huaModalLabel"
                        style="font-family:'方正舒体';color: #c0a16b;font-size:30px;">
                        与画有约
                    </h4>
                </div>
                <div class="modal-body">


                    <div>
                        <h3 style="font-family: '隶书'；">画的历史:</h3><br/>
                        <div class="main_img" style="text-align: center"><img src="${APP_PATH }/images/icon/huaimg.jpg"
                                                                              style="border-radius: 40%"></div>
                        <br/>
                        &nbsp;&nbsp;&nbsp; &nbsp;有关中国绘画的起源问题，像有关中国历史的起源一样，令人不可琢磨。究竟中国的绘画
                        开始于何时？何地？是何人所创造？这一谜团千年以来一直萦绕在历代美术史研究者的思绪中。
                        唐代的张彦远在他的开创性著作《历代名画记》中，将中国绘画的起源追溯到传说时代，
                        指出那时的象形文字便是书写与绘画的统一。而在他看来，图形与文字的脱离，才使得绘画成为
                        一门专门的艺术，探讨绘画技巧的工作则晚至秦汉才开始，魏晋时名家的出现，才标志着绘画臻于成熟。
                        这1000多年前提出的有关早期中国绘画发展的理论至今仍基本成立。所不同的是现代考古发掘出土
                        了大量的史前和历史早期绘画形象的实物，不断增加着我们对早期绘画艺术的了解。中国新石
                        器时代的造型艺术，在彩陶及绘画、陶塑和雕刻方面，均有一定的成就。

                    </div>


                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary"
                            data-dismiss="modal">关闭
                    </button>

                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
    <!--内容开始-->
    <div class="content_box">
        <ul class="content_box_top">
            <li>
                <a data-toggle="modal" data-target="#qinModal"><img src="${APP_PATH }/images/icon/qin.PNG"/></a>
                <h3 class="obj_title">琴歌酒赋</h3>
                <p>《北山移文》琴歌既断，酒赋无续<br/>旧皆逸人、高士之事</p>
            </li>
            <li>
                <a data-toggle="modal" data-target="#qiModal"><img src="${APP_PATH }/images/icon/qi.jpg"/></a>
                <h3 class="obj_title">棋逢敌手</h3>
                <p>《说唐》：棋逢对手，将遇良才<br/>交战双方本领不相上下</p>
            </li>
            <li>
                <a data-toggle="modal" data-target="#shuModal"><img src="${APP_PATH }/images/icon/shu.jpg"/></a>
                <h3 class="obj_title">牛角挂书</h3>
                <p>《新唐书.李密传》：挂《汉书》一帙角上，且行读<br/></p>
            </li>
            <li>
                <a data-toggle="modal" data-target="#huaModal"><img src="${APP_PATH }/images/icon/hua.jpg"/></a>
                <h3 class="obj_title">诗情画意</h3>
                <p>《清平乐.横玉亭秋倚》：诗情画意，只在兰轩外<br/></p>
            </li>
        </ul>
        <div class="content_box_bot">
            <ul class="content_box_bot_l">
                <li class="info_news">
                    <div class="info_news_but"><p class="on">公司新闻</p>
                        <p>行业资讯</p></div>
                    <ul class="info_news_text info_news_text1">
                        <li><a href=""><img src="${APP_PATH }/images/icon/info_icon1.png"/>
                            <p>固定资产局部更新的大修理作为日常生产活动<span class="date">2015-08-05</span></p></a></li>
                        <li><a href=""><img src="${APP_PATH }/images/icon/info_icon1.png"/>
                            <p>固定资产局部更新的大修理作为日常生产活动<span class="date">2015-08-06</span></p></a></li>
                        <li><a href=""><img src="${APP_PATH }/images/icon/info_icon1.png"/>
                            <p>固定资产局部更新的大修理作为日常生产活动<span class="date">2015-08-07</span></p></a></li>
                        <li><a href=""><img src="${APP_PATH }/images/icon/info_icon1.png"/>
                            <p>固定资产局部更新的大修理作为日常生产活动<span class="date">2015-08-08</span></p></a></li>
                    </ul>
                    <ul class="info_news_text info_news_text2">
                        <li><a href=""><img src="${APP_PATH }/images/icon/info_icon1.png"/>
                            <p>固定资产局部更新的大修理作为日常生产活动<span class="date">2015-08-09</span></p></a></li>
                        <li><a href=""><img src="${APP_PATH }/images/icon/info_icon1.png"/>
                            <p>固定资产局部更新的大修理作为日常生产活动<span class="date">2015-08-10</span></p></a></li>
                        <li><a href=""><img src="${APP_PATH }/images/icon/info_icon1.png"/>
                            <p>固定资产局部更新的大修理作为日常生产活动<span class="date">2015-08-11</span></p></a></li>
                        <li><a href=""><img src="${APP_PATH }/images/icon/info_icon1.png"/>
                            <p>固定资产局部更新的大修理作为日常生产活动<span class="date">2015-08-12</span></p></a></li>
                    </ul>
                    <script>
                        $(".info_news_but p").each(function (n) {
                            $(this).click(function () {
                                $(this).addClass("on").siblings("p").removeClass("on");
                                $(".info_news_text").hide(400).eq(n).show(500);
                            });
                        });

                    </script>
                </li>
                <li class="search_obj">
                    <p class="search_obj_title">分类搜索<span>Classification search</span></p>
                    <div class="search_obj1">
                        <a href="">一般人</a> <a href="">小规模</a> <a href="">企业类型</a>
                        <a href="">注册资金</a> <a href="">年限</a> <a href="">更多>></a>
                    </div>
                </li>
            </ul>

            <ul class="content_box_bot_r">
                <li class="jianjie_box">
                    <p class="jianjie_title">关于华企<span>COMPANYP</span></p>
                    <div class="jianjie_box1">
                        <img src="${APP_PATH }/images/user_image/jj_pic.jpg"/>
                        <a href="">固定资产投资是建造和购置固定资产的经济活动，即固定资产再生产活动。固定资产再生产过程包括固定资产更新（局部和全部更新）、改建、扩建、新建等活动...<span>[详情]</span></a>
                    </div>
                </li>
                <li class="zichan_box">
                    <P>资产转让登记<span>Transfer of assets</span></P>
                    <a href="">固定资产投资是建造和购置固定资产的经济活动，即固定资产再生产活动。固定资产再生产过程包括固定资产更新（局部和全部更新）、改建、扩建、新建等活动...<span>[详情]</span></a>
                </li>
            </ul>
        </div>

        <div class="info_search">
            <ul class="info_search_l">
                <li>友情链接：
                    <select name="pageselect" onchange="self.location.href=options[selectedIndex].value">
                        <option value="http://www.baidu.com">百度</option>
                        <option value="http://www.gx211.com/">高校之窗</option>
                        <option value="http://www.cnkis.net/">知网论文</option>
                        <option value="https://www.chsi.com.cn/">学信网</option>
                    </select>
                </li>

            </ul>
            <div class="info_search_r">
                <a href=""><img style="border-radius:25px;" src="${APP_PATH }/images/icon/icon5.jpg"/><span>新浪微博</span></a>
                <a href="https://news.163.com/"><img style="border-radius:25px;"
                                                     src="${APP_PATH }/images/icon/icon6.jpg"/><span>网易新闻</span></a>
            </div>
        </div>
    </div>

    <!--内容结束-->
    <div class="footer_box"><p>--版主信息--学号：152040135201 --姓名：王硕--</p></div>

</div>
<script type="text/javascript">
    $(function () {
        getCommunities();
        settoar();

    })

    //设置toar插件的参数
    function settoar() {
        //参数设置，若用默认值可以省略以下面代

        toastr.options = {

            "closeButton": true, //是否显示关闭按钮

            "debug": false, //是否使用debug模式

            "positionClass": "toast-top-full-width",//弹出窗的位置

            "showDuration": "200",//显示的动画时间

            "hideDuration": "1000",//消失的动画时间

            "timeOut": "60000", //展现时间

            "extendedTimeOut": "1000",//加长展示时间

            "showEasing": "swing",//显示时的动画缓冲方式

            "hideEasing": "linear",//消失时的动画缓冲方式

            "showMethod": "fadeIn",//显示时的动画方式

            "hideMethod": "fadeOut" //消失时的动画方式

        };
    }

    //获取所有社团
    function getCommunities() {
        $.ajax({

            url: "${APP_PATH }/community/communities",
            type: 'GET',
            success: function (result) {

                $.each(result.extend.communities, function () {


                    var spanimg = $("<span></span>").append($("<img src='${APP_PATH }/images/user_image/siade_bg1.png'/>"));
                    //data-toggle="modal" data-target="#shuModal"
                    var optionEle = $("<a></a>")
                        .addClass("searchdetails")
                        .append(this.comName)
                        .append(spanimg)
                        .attr("comId", this.comId);
                    optionEle.appendTo($("#community_names"));

                });


            }
        })
    }

    //1、我们是按钮创建之前就绑定了click，所以绑定不上。
    //1）、可以在创建按钮的时候绑定。    2）、绑定点击.live()
    //jquery新版没有live，使用on进行替代
    $(document).on("click", ".searchdetails", function () {
        //alert("edit");
        var com_id = $(this).attr("comId");

        //1、查询得到对应的社团
        getCommunity(com_id);


        //2、把用户的id传递给模态框的申请加入按钮
        $(".applyCommunity_btn").attr("comId", $(this).attr("comId"));
        $("#employModal").modal({
            backdrop: "static"
        });
    });

    //查询相应的社团
    function getCommunity(com_id) {
        //清空之前下拉列表的值

        //$("#employModal").empty();
        $.ajax({
            url: "${APP_PATH}/community/getcommunity_byId/" + com_id,
            type: "GET",
            success: function (result) {
                var community = result.extend.community;
                //社团名称
                var community_name = community.comName;
                $(".commnity_name").html(community_name);
                //社团图片地址
                var com_img = community.comImg;
                $(".main_img img").attr("src", com_img);
                //社团介绍
                var introduction = community.comIntroduction;
                $(".com_introduction").html(introduction);
                //社团人数
                var com_number = community.comMemberNumber;
                $(".com_number").html(com_number);

                //社团创建时间
                var creatTime = community.comCreateDate;
                $(".com_creat_time").html(creatTime);

                //社团会长姓名
                var chairman_name = community.chairman.name;
                $(".chair_name").html(chairman_name);
                //社团会长手机号
                var chairman_phone = community.chairman.phone;
                $(".chair_phone").html(chairman_phone);

                $("#employModal").modal('show');
                console.log(result);
            }
        });
    }

    //点击申请加入社团
    $(document).on("click", ".applyCommunity_btn", function () {
        var com_id = $(this).attr("comId");
        var user_id = "<%=user_id %>";
        //1.首先查询改社团中是否有该成员：
        checkIsMember(com_id,user_id );


    });

    function checkIsMember(com_id,user_id ) {
        $.ajax({

            url: "${APP_PATH }/community/checkIsMember/"+com_id+"/"+user_id,
            type: 'GET',
            success: function (result) {
//状态码   100-成功    200-失败
                if (result.code==100) {
                    //设定参数
                    toastr.options = {
                        closeButton: false,
                        debug: false,
                        progressBar: false,
                        positionClass: "toast-center-center",
                        onclick: null,
                        showDuration: "300",
                        hideDuration: "1000",
                        // timeOut: "1500",
                        extendedTimeOut: "1000",
                        showEasing: "swing",
                        hideEasing: "linear",
                        showMethod: "fadeIn",
                        hideMethod: "fadeOut"
                    };

//2.检查申请表里面是否有申请过；
                   // alert("检查申请表里面是否有申请过")
                    checkApplyIsMember(com_id,user_id);

                }else {

                    toastr.warning("您已经式该社团成员，无需申请！");
                }

            }
        })
    }

    function checkApplyIsMember(com_id,user_id){

        $.ajax({

            url: "${APP_PATH }/applycommunity/checkIsApplyMember/"+com_id+"/"+user_id,
            type: 'GET',
            success: function (result) {
//状态码   100-成功    200-失败
                if (result.code==100) {

                    //插入用户申请信息

                    insertApplyCommunity(com_id,user_id);

                }else {

                    toastr.warning("您已经在审核中，无需再次申请！");
                }

            }
        })
    }


    function insertApplyCommunity(com_id,user_id){
        var apply={
            "temUserId":user_id,
            "temComId":com_id
        }
        $.ajax({

            url: "${APP_PATH }/applycommunity/addApplyCom",
            type: 'POST',
            data:JSON.stringify(apply),
            contentType: "application/json; charset=utf-8",
            success: function (result) {
//状态码   100-成功    200-失败
                if (result.code==100) {

                    toastr.success("您已经在审核中，无需再次申请！");

                }else {

                    toastr.error("申请失败，点击紧急联系寻求帮助");
                }

            }
        })
    }

    //点击联系人，跳出相关联系人
    $(".linked_person").click(function () {
        toastr.clear();
        toastr.warning("数据负责人：王磊，手机号：13180986783；      活动负责老师：张宝剑，手机号：12347678989");
    })
</script>
</body>

</html>





