<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.net.URLEncoder" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<body>

<h2 style="text-align:cneter">添加学生</h2>
<form action="add.do" method="post">
姓名:<input type="text" name="sname" /></br>
性别:<input type="text" name="sex" /></br>
年龄:<input type="text" name="age" /></br></br>
&nbsp;&nbsp;<input type="submit" value="添加"/>
</form>
</body>
</html>