<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table,td{
border:1px solid;"
}


</style>
</head>
<body>
<h2 style="text-align:center">学生列表</h2>
<table>
<tr>
<td>编号:</td><td>姓名:</td><td>性别:</td><td>年龄:</td>
<td>详细信息&nbsp;</td><td>修改&nbsp;</td><td>删除&nbsp;</td>
</tr>
<c:forEach items="${list}" var="stu">
<tr>
<td>${stu.sid}</td><td>${stu.sname}</td><td>${stu.sex}</td><td>${stu.age}</td>
<td><a href="detail.do?id=${stu.sid}">详细信息&nbsp;</a></td>
<td><a href="toupdate.do?id=${stu.sid}">修改&nbsp;</a></td>
<td><a href="delete.do?id=${stu.sid}" onclick="return confirm('你确认要删除该学生信息吗?')">删除&nbsp;</a></td>
</tr>
</c:forEach>
</table>
<br/>
&nbsp;&nbsp;<a href="toadd.do">添加学生</a><br/>


</body>
</html>