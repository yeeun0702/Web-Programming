<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<h3>계정 : <%= request.getParameter("user_id") %></h3>
	<h3>암호 : <%= request.getParameter("user_pw") %></h3>
</body>
</html>