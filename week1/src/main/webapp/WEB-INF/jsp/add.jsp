<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>欢迎来到添加页面</h1>
	<form action="add.do" method="post">
	植物名称：<input type="text" name="fname">
	描述:<input type="text" name="introduction">
	类别:<select name="${type.tid }" id="tid">
			<option>请选择</option>
		</select>
	<input type="submit" value="提交">
	</form>
</body>
</html>