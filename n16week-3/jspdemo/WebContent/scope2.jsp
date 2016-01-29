<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%
//测试作用域含义及用法，在四个不同的作用域中存数据
//在另一个页面（Scope）中取数据


%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
<p style="color: red">application=<%= application.getAttribute("application") %></p>
<p style="color:blue">session=<%= session.getAttribute("session") %></p>
<p>request=<%= request.getAttribute("request") %></p>
<p>pageContext=<%= request.getAttribute("pageContext") %></p>

</body>
</html>