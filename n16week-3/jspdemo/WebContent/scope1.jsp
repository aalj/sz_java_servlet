<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%
//测试作用域含义及用法，在四个不同的作用域中存数据
//在另一个页面（Scope）中取数据
application.setAttribute("application", "aooliction_date");
session.setAttribute("session", "session-date");
request.setAttribute("request", "request_date");
pageContext.setAttribute("pageContext","gageContext" );

//请求转发,请求转发使用的是同一个request对象
// request.getRequestDispatcher("scope2.jsp").forward(request, response);



%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <meta http-equiv="refresh" content="3;url=/jspdemo/scope2.jsp"> -->
<title>Insert title here</title>
</head>
<body>
第一个页面同时存数据，三秒后跳转到第二页面观察能取到几个数据
</body>
</html>