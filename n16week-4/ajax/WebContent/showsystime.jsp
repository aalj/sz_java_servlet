<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function show() {
		// 	alert("ok");
		//使用AJAX技术,发送一个HTTP请求,获得相应(系统时间) 将这个时间放在time输入框中0
		//1.创建XMLHttpRequest
		var req = new XMLHttpRequest();
		//2. 侦听readystatechange
		req.onreadystatechange = function() {
			//req上有两个属性readyState,status(http状态相应码)
// 			alert(req.readyState + "," + req.status);
			if(req.readyState==4&& req.status==200){
				alert(req.responseText);
				document.getElementsByName("time")[0].value=req.responseText;
			}

		}

		//3. 发送请求
		req.open("get", "/ajax/ShowSysTimeServlet?id=2", true);
		req.send(null);
	}
</script>
</head>
<body>
	用户：
	<input type="text" name="name" onkeyup="show()"> 时间：
	<input type="text" name="time">
</body>
</html>