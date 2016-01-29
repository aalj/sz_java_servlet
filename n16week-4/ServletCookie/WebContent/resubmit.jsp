<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
//生成唯一标识符,随机数
//随机数.存在session作用域中
//随机数,放在form的表单hidden中
String s= ""+Math.random();
session.setAttribute("sid", s);
System.out.println(s);

%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function resubmit(){
		//获得表单对象
		var oFrom=document.getElementsByName("myform")[0];
		oFrom.submit();
// 		alert("ok")
		oFrom.submit();
		
	}
</script>
</head>
<body>
<form method="post" action="/ServletCookie/AvoidReSubmitServlet" name="myform">
用户名:<input type= "text" name="username"/>
<input type="hidden" name="hid" value="<%=s %>">
<input type = "button" onclick="resubmit()" value="提交"/>



</form>
</body>
</html>