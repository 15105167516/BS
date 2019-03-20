jQuery(document).ready(function () {

    /*
        Fullscreen background
    */


    /*
        Form validation
    */
    $('.login-form input[type="text"], .login-form input[type="password"], .login-form textarea').on('focus', function () {
        $(this).removeClass('input-error');
    });

    $(".user_login_btn").on("click", function (e) {
        var flag = true;
        $(".login-form").find('input[type="text"], input[type="password"], textarea').each(function () {
            if ($(this).val() == "") {
                e.preventDefault();
                $(this).parent().addClass('has-warning');
                $(".login_hint_info").addClass('alert alert-warning').text("用户名或密码不能为空！");
                flag = false;
            }
            else {
                $(this).parent().removeClass('has-warning');


            }
        });
        //都不是空的；
if (flag==true){
    //发送ajax登陆请求
    var memberId=$("#form-username").val();
    var memberPassword=$("#form-password").val();
    var address;
    if ($(".user_login_btn").attr("user_limit")=="1") {

        address="/users/login/"+memberId+"/"+memberPassword;


    }else if ($(".user_login_btn").attr("user_limit")=="2"){
        address="/chairmen/login/"+memberId+"/"+memberPassword;

    }else {
        address="/admins/login/"+memberId+"/"+memberPassword;

    }

    $.ajax({
        url: $("#PageContext").val()+address,
        type:"GET",
        success:function (result) {

            if(result.code==200){
                $(".login_hint_info").addClass('alert alert-warning').text(result.extend.info);

            }else {
                if($(".user_login_btn").attr("user_limit")=="1"){

                  window.top.location.href=$("#PageContext").val()+"/mainCommonUser.jsp";
                }else if($(".user_login_btn").attr("user_limit")=="2"){
                    window.top.location.href=$("#PageContext").val()+"/mainChairman.jsp";

                }else {
                    window.top.location.href=$("#PageContext").val()+"/mainAdmin.jsp";

                }

            }
        }
    })
}

    });


});
