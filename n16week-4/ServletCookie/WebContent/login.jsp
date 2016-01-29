<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/ServletCookie/LoginServlet" method="post">
		<%
			String name = "";
			String pwd = "";
			Cookie[] cookie = request.getCookies();
			if (cookie != null) {
				for (Cookie c : cookie) {
					if ("info".equals(c.getName())) {
						String[] info = c.getValue().split(",");
						System.out.println("info");
						System.out.println(name);
						System.out.println(pwd);
						name = info[0];
						pwd = info[1];
					}
				}
			}
			
		%>
		<h1>aa <%=name %></h1>
		<h1>aa <%=pwd %></h1>
		用户名：<input type="text" name='username' value=<%=name %> /><br />
		密码：<input type="password" name="pwd" value=<%=pwd %> /><br />
		是否自动登录:<input type='checkbox' name='autologin' value="1" checked /><br />
		<input type=submit value='提交'>


	</form>
</body>
</html>