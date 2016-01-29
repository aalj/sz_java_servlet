<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% int i=10;
int j= 20;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>i+j=<%= i+j %></h2>


<%
	//写任意的java代码
	//可用的JSP内置对象
	out.println("hello world<br>");
	//在页面上输出系统当前时间
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String time = "2015-02-02";
	Date d = new Date();
	dateFormat.format(d);
	out.println(dateFormat.parse(time));
%>
<h2>JSP可以和HTML标签</h2>

<%
if(i>j){
	out.println("<div style='color:red'>'i大于j'</div>");
}else{
	out.println("<div style='color:red'>'i小于j'</div>");
	
}



%>
<h2>JSP可以和HTML标签混写</h2>

<% if(i>j){%>
	<div>i大于j</div>
<% }else{%>
<div>i小于j</div>
<%}%>
<h2>中间部分</h2>
<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>