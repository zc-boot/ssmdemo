<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<body>
<h2 style="text-align:center">学生详细信息</h2>
<table>
<tr><td>编号:</td><td>${stu.sid}</td></tr>
<tr><td>姓名:</td><td>${stu.sname}</td></tr>
<tr><td>性别:</td><td>${stu.sex}</td></tr>
<tr><td>年龄:</td><td>${stu.age}</td></tr>
<tr><td colspan=2><a href="list.do">返回</a></td></tr>
</table>
</body>
</html>