<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>序号</td>
			<td>植物名称</td>
			<td>描述</td>
			<td>类别</td>
		</tr>
		<c:forEach items="${flower }">
		<tr>
			<td>flower.fid </td>
			<td>${flower.fname }</td>
			<td>${flower.introduction }</td>
			<td>${flower.type.tname }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>