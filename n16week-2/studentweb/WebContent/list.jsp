<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="utf-8" />
<title>学生信息列表</title>
<link rel=stylesheet href="../css/demo.css" type="text/css">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<META HTTP-EQUIV="Expires" CONTENT="0">
<script type="text/javascript">
	function del() {
		//客户端验证,验证是否选中学生

		//确认窗口确认删除
		alert("ok");
		//提交表单到deleteStudents
		var ofrom = document.getElementsByName("frmAction")[0];
		ofrom.action = "/studentweb/DeleteStudents";
		ofrom.submit();
		//
	}
	function add() {
		alert("ok");
		var ofrom = document.getElementsByName("frmAction")[0];
		ofrom.action = "/studentweb/add.html"
		ofrom.submit();

	}

	function query() {
		alert("ok");
		var ofrom = document.getElementsByName("frmAction")[0].action = "/studentweb/detail.html";
		ofrom.submit();
	}
</script>

</head>


<body topmargin="10" leftmargin="10">
	<form name="frmAction" method="post" action="add.jsp">
		<table width="100%" class="toolBar" id="toggleDemoTable"
			class="tex004">
			<tr>
				<td>欢迎你:admin&nbsp;&nbsp;&nbsp; <a href="login.jsp">重新登录</a>
				</td>
				<td id="addbutton" align="right"><input type="button"
					onclick="add()" value="增加">&nbsp;&nbsp; <input
					type="button" onclick="edit()" value="编辑">&nbsp;&nbsp; <input
					type="button" onclick="del()" value="删除">&nbsp;&nbsp; <input
					type="button" onclick="query()" value="查询">&nbsp;&nbsp;</td>
			</tr>
		</table>

		<table width="100%" border="0" cellpadding="3" cellspacing="1"
			class="toolTable">
			<!--此处为列标题-->
			<tr align="center" class="colom">
				<td><input type="checkBox" name="chkAll" onClick="selectAll()" /></td>
				<td align='center'>姓名</td>
				<td>学号</td>
				<td>性别</td>
				<td>出生日期</td>
				<td>政治面貌</td>
			</tr>
			<c:forEach var='student' items='${limitStudnet}'>
				<tr class='even'>
					<td align='center'><input type='checkbox' name='chkStudent'
						value='<c:out value="${student.id }"></c:out>'>
					<td align=center><a
						href='/studentweb/EditStudentServlet?id=${student.id }'
						title='查询学生详细信息'> <c:out value="${student.name }"></c:out></a></td>
					<td align=center><c:out value="${student.sno }"></c:out></td>
					<td align=center><c:choose>
							<c:when test="${student.sex==0 }">男</c:when>
							<c:when test="${student.sex==1 }">女</c:when>

						</c:choose></td>
					<td align=center><c:out value="${student.polity }"></c:out></td>
					<td align=center><c:choose>
							<c:when test="${student.sex==1 }">党员</c:when>
							<c:when test="${student.sex==2 }">积极分子</c:when>
							<c:when test="${student.sex==3 }">团员</c:when>
							<c:when test="${student.sex==4 }">群众</c:when>

						</c:choose></td>
			</c:forEach>


		</table>

		<table width='100%' class="tex004">
			<tr>
				<td align='left'><a href='/studentweb/ListStudent?curPage=1'
					onClick='pageQuery(1)'><span>首页</span></a> <a
					href='/studentweb/ListStudent?curPage=${page+1}'><span>下一页</span></a>
					<a href='/studentweb/ListStudent?curPage=${pageNum}'
					onClick="pageQuery(4)">尾页</a></td>
				<td align='left'>${num}条&nbsp;&nbsp;共${pageNum }页&nbsp;&nbsp;第${page}页</td>
			</tr>
		</table>
	</form>
</body>
</html>

