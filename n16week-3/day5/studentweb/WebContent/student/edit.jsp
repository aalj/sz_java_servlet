<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>修改学生信息</title>
<link rel=stylesheet href="/studentweb/css/demo.css" type="text/css">
</head>
<script src='/studentweb/common/date/date.js'></script>
<script>

</Script>
<body  topmargin="10" leftmargin="10"  >
	<form name="frmAction"  method="post" action="/studentweb/AddStudent" >
	<table width="95%" border="0" cellpadding="3" cellspacing="1" class="toolBar" align="center">
      		<tr align=left class="colom">
			<td colspan="2">修改学生信息</td>
		</tr>
		<tr class=even>
			<td width='100' align='right' nowrap>姓名&nbsp;</td>
			<td bgcolor='#ffffff'><input type="text" name="stuName" value="${s.name}"><font color=#ff0000>*</font>
				<input type="hidden" name="id" value="${s.id}"/>
			</td>
		</tr>
		<tr class=even>
			<td width='100' align='right' nowrap>学号&nbsp;</td>
			<td bgcolor='#ffffff'><input type="text" name="stuNumber" value="${s.sno}" ><font color=#ff0000>*</font></td>
		</tr>
		<tr class=even>
			<td width='100' align='right' nowrap>口令&nbsp;</td>
			<td bgcolor='#ffffff'><input type="password" name="stuPassword" value="${s.pwd}" ><font color=#ff0000>*</font></td>
		</tr>
		<tr class=even>
			<td width='100' align='right' nowrap>生日&nbsp;</td>
			<td bgcolor='#ffffff'>
				<input type="text" name="stuBirthday"  value="${s.birthday}"  >
				<INPUT type='button' value='选择日期'
				onclick=javascript:document.all['stuBirthday'].value=selectDate() ></td>
		</tr>
		<tr class=even>
			<td width='100' align='right' nowrap>性别&nbsp;</td>
			<td bgcolor='#ffffff'><input type="radio" <c:if  test="${s.sex==1}">checked</c:if>  value="1" name="stuSex" >男
								  <input type="radio" <c:if  test="${s.sex==0}">checked</c:if>  value="0" name="stuSex" >女
			</td>
		</tr>
		<tr class=even>
			<td width='100' align='right' nowrap>政法面貌&nbsp;</td>
			<td bgcolor='#ffffff'>
				<select  name="stuPolity" >
					<option value="1" <c:if  test="${s.polity==1}">selected</c:if> >党员</option>
					<option value="2" <c:if  test="${s.polity==2}">selected</c:if> >团员</option>
					<option value="3" <c:if  test="${s.polity==3}">selected</c:if> >无党派</option>
					<option value="4" <c:if  test="${s.polity==4}">selected</c:if> >其它</option>
				</select>
			</td>
		</tr>
		<tr class=even>
			<td width='100' align='right' nowrap>简介&nbsp;</td>
			<td bgcolor='#ffffff'><textarea cols=30 rows=5 name="stuBrief" >${s.brief}</textarea>
			字符个数不多于250个
			</td>
		</tr>

		<tr class=even>
		   	<td  height=35 colspan="2" >
	   			<input class="input" type="button" value="确定" onclick="javascript:check()" >
	   			<input type="submit" value="提交"/>
				<input class="input" type="button" value="返回" onclick="javascript:back()" >
		   </td>
		</tr>        
	</table>
	</form>
	<iframe name='hideFrame' style="display:none"></iframe>
</body>
</html>