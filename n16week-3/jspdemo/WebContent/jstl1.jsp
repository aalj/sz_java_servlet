<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>${1+2*3},${3<5}</h2>

	<h2>${(2>1)&&(3>2)}</h2>
	<h2>${2<1 ? "ok1": "cuole"}</h2>
	<p>获得对象的属性</p>
	
	<h2>通过EL，获得用户名:${student.name}${student.getAge() }</h2>
<%-- 	${student.setName("李四") } --%>
<!-- 	<br/> -->
<%-- 	${student.getName()} --%>
	<h2 style="color: blue">获得数组内容</h2>
	${code[1]}
	<h2 style="color:red">获得对象数组</h2>
	名字=${students[1].name }。年龄=${students[1].age}
	<h2>获得集合对象</h2>
	${listStu.get(1).name }
	<h2>获得map集合对象</h2>
	${namemap["name"][0].name }
	<p>遍历list</p>
	<c:forEach items="listStu"   var="item">
	
	<p>${item}</p>
	</c:forEach>
	
	
	
	
</body>
</html>