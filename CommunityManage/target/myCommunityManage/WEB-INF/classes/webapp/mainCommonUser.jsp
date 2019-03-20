<%@ page import="com.suke.communitymanage.bean.Member" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>普通用户</title>
</head>
<body>
欢迎<%Member member=(Member) request.getSession().getAttribute("member");out.print(member.getMemberName());%>到来！
</body>
</html>
