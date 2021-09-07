<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.net.URLEncoder" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<body>

<h2 style="text-align:cneter">修改学生</h2>
<form action="update.do" method="post">
姓名:<input type="text" name="sname" value="${stu.sname}"/></br>
性别:<input type="text" name="sex" value="${stu.sex}"/></br>
年龄:<input type="text" name="age" value="${stu.age}"/></br>
<input type="hidden" name="sid" value="${stu.sid}"/><br/>
&nbsp;&nbsp;<input type="submit" value="修改"/>
</form>
</body>
</html>