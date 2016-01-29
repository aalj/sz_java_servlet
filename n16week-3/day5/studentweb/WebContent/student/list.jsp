<!--中文编码设置-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<html>
<head>
<title>学生信息列表</title>
<link rel=stylesheet href="/studentweb/css/demo.css" type="text/css">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<META HTTP-EQUIV="Expires" CONTENT="0">
<script type="text/javascript">
function del() {
	//客户端验证，验证是否选中学生
	//确认窗口确认删除
	//提交表单到DeleteStudents
	alert("ok");
	var oForm = document.getElementsByName("frmAction")[0];
	oForm.action = "/studentweb/DeleteStudents";
	oForm.submit();
}


</script>



</head>


<body topmargin="10" leftmargin="10" >
<form name="frmAction"  method="post" action="add.jsp" >
<table width="100%" class="toolBar" id="toggleDemoTable" class="tex004">
   	<tr >
   		<td>欢迎你:admin&nbsp;&nbsp;&nbsp;
   			<a href="login.jsp" >重新登录</a>
   		</td>
		<td id="addbutton" align="right">
			<input type="button" onclick="add()"  value="增加">&nbsp;&nbsp;
			<input type="button" onclick="edit()" value="编辑">&nbsp;&nbsp;
            <input type="button" onclick="del()" value="删除">&nbsp;&nbsp;
            <input type="button" onclick="query()" value="查询">&nbsp;&nbsp;
       	</td>
   	</tr>
</table>
   	
<table width="100%" border="0" cellpadding="3" cellspacing="1" class="toolTable">
  	<!--此处为列标题-->
   	<tr align="center" class="colom">
		<td><input type="checkBox" name="chkAll" onClick="selectAll()"/></td>
		<td align='center'>姓名</td>
		<td>学号</td>
		<td>性别</td>
		<td>出生日期</td>
		<td>政治面貌</td>
    </tr>
   
    <c:forEach var="s" items="${students}">
    	<tr class='even'>
		<td align='center'><input type='checkbox'  name='chkStudent' value='26' >
		<td align=center><a href='/studentweb/EditStudentServlet?id=${s.id}' title='查询学生详细信息'>
			<c:out value="${s.name}"></c:out></a></td>
		<td align=center><c:out value="${s.sno}"></c:out></td>
		<td align=center><c:out value="${s.sex}"></c:out></td>
		<td align=center><c:out value="${s.birthday}"></c:out></td>
		<td align=center><c:out value="${s.polity}"></c:out></td>
    	</tr>
    </c:forEach>

</table>
	
<table width='100%' class="tex004">
	<tr><td align='left'>
    	<a  href='/studentweb/ListStudentsServlet?curPage=1'><span>首页</span></a>
        
        
        <a href='/studentweb/ListStudentsServlet?curPage=${page+1}' ><span>下一页</span></a>
        
        <a  href='/studentweb/ListStudentsServlet?curPage=${pages}' >尾页</a>
	</td>
    <td  align='left' >共<c:out value="${counts}"/>项&nbsp;&nbsp;
    	<c:out value="${pages}"/>页    go <input type="text" />
    </td></tr>
</table>
</form>
</body>
</html>

