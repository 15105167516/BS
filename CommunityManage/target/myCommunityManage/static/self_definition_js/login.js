function check(form) {
	if (document.forms.myform.username.value == "") {
		alert("请填写用户名");
		document.forms.myform.username.focus();
		return false;
	}
	if (document.forms.myform.userpass.value == "") {
		alert("请输入密码 ");
		document.forms.myform.userpass.focus();
		return false;
	}
}
$("#register_view label").click(function () {
    if ( $("#register_view label").text()!="若同学还未注册，请点击注册进行登陆！"){
        return false;
    }

})
$(".commen_user").click(function () {

    $("#register_view label").text("若同学还未注册，请点击注册进行登陆！");
    $("body").css("background","url(${APP_PATH }/static/assets/img/backgrounds/1.jpg)")
    $("#right_control_info").text("社团成员");

    $(".login_btn").attr("user_limit","1");
})
$(".chairman_user").click(function () {
    $("#register_view label").text("您选择的登陆权限无法自主注册，请联系社团管理员！");
    $("body").css("background","url(${APP_PATH }/static/assets/img/backgrounds/3.jpg)")
    $("#right_control_info").text("社团会长");
    $(".login_btn").attr("user_limit","2");
})
$(".admin_user").click(function () {
    $("#register_view label").text("您选择的登陆权限无法自主注册，请联系社团管理员！");
    $("body").css("background","url(${APP_PATH }/static/assets/img/backgrounds/4.jpg)")

    $("#right_control_info").text("管理员");
    $(".login_btn").attr("user_limit","3");
})


