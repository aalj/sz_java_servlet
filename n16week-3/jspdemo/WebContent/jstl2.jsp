<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jsp/function" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="<h2>hello world</h2>" escapeXml="false"/>

${name}
<br/>
${name == 'tom'}
<c:if test="${true}" >
 <h2>这是假的</h2>
</c:if>



<c:choose>
	<c:when test="${score==5 }">优</c:when>
	<c:when test="${score==4 }">良</c:when>
	<c:when test="${score==3 }">中</c:when>
<c:when test="${score==2 }">差</c:when>
<c:when test="${score==1 }">不及格</c:when>
<c:otherwise>异常情况</c:otherwise>
</c:choose>

<c:forEach var="i" begin="1" end="10" step="2">
	<c:out value="${i }">,</c:out>
</c:forEach>


<h2>遍历数组</h2>
<c:forEach var='name' items='${code }'>
<c:out value="${name }"></c:out>
</c:forEach>

<h2>遍历list集合</h2>
${fn:length(listStu)}
<c:forEach var='list' items='${listStu }'>
<c:out value="${list.name }" ></c:out>
<c:out value="${list.age }"></c:out>
<br/>
</c:forEach>


</body>
</html>