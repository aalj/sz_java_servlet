<%@page import="com.snail.OnLineCount"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
System.out.println("在线人数"+OnLineCount.getCount());
System.out.println("1-------"+System.currentTimeMillis());
System.out.println("在filte这个页面里面");


%>
<h1>第一个Filter.jsp</h1>
</body>
</html>