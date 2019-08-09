<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index_work.css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
/* 	$(function(){
		$("input[name='checkall']").click(function(){
			if($(this).is(checked)){
				$("input[name='fid']").each(function(){
					this.checked=true
				});
			}else{
				$("input[name='fid']").each(function(){
					this.checked=false
				});
			}
		});
	}); */
	
	function add(){
		location = "add.jsp"
	}

	$(function(){
		 $("input[value='批量删除']").click(function(){
			var x = $("#fid").val()
			if(x.length>0){
				var str = "";
				for ( var i in x) {
					str+=x[i].value()
				}
				var ids = str.substring(1)
				$.post("dels.do",{fid:ids},function(obj){
					if(obj){
						alert("删除成功")
					}else{
						alert("删除失败")
					}
				},"json")
			}
		}); 
		$("input[name='checkall']").click(function(){
			if($(this).is(checked)){
				$("input[name='fid']").each(function(){
					this.checked=true
				});
			}
		});
		
	});
</script>
</head>
<body>
	<h1>欢迎来到列表页面</h1>
	<table>
		<tr>
			<td>
				<input type="button" value="添加" onclick="add()">
				<input type="button" value="批量删除">
			</td>
			<td colspan="5">
				<form action="list.do" method="post">
					查询内容:<input type="text" name="fname" value="${fv.fname }">
					<input type="submit" value="搜索">
				</form>
			</td>
		</tr>
		<tr>
			<td>
				<input type="checkbox">全选
			</td>
			<td>序号</td>
			<td>植物名称</td>
			<td>描述</td>
			<td>类别</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="f">
			<tr>
				<td>
					<input type="checkbox" name="fid" id="fid" value="${f.fid }">
				</td>
				<td>${f.fid }</td>
				<td>${f.fname }</td>
				<td>${f.introduction }</td>
				<td>${f.type.tname }</td>
				<td>
					<a href="show.do?fid=${f.fid }"><input type="button" value="查看"></a>
					<a href="update.jsp?fid=${fid }"><input type="button" value="修改"></a>
					<a href="del.do?fid=${f.fid }"><input type="button" value="删除"></a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10">
				当前${pageInfo.pageNum }页 共${pageInfo.pages }页 共有${pageInfo.total }条数据
				<a href="list.do?pageNum=${pageInfo.firstPage }">首页</a>
				<a href="list.do?pageNum=${pageInfo.prePage }">上一页</a>
				<a href="list.do?pageNum=${pageInfo.nextPage }">下一页</a>
				<a href="list.do?pageNum=${pageInfo.lastPage }">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>