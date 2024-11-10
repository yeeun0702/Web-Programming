<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!
String str1 = "JSP";
String str2 = "Hello!";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>HelloJSP</title>
</head>
<body>
	<h3>This is my first <%= str1 %> program.</h3>
	<p>
		<%
		out.println(str2 + " Welcome to JSP class!");
		%>
	</p>
</body>
</html>

