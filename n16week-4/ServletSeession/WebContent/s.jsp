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
	
	
	//用户浏览器
	//第一次访问,创建一个session对象,有唯一一个表示id
	
	//下次在访问是客户端带id,服务器对应的session对象
	String id = session.getId();
	out.println("session id"+id);
	System.out.println(id);
	%>
	
</body>
</html>