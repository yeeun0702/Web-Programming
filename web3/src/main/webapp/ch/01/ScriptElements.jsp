<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%! 
public int add(int num1, int num2){
	return num1 + num2;
}

%>

<html>
<head><title>스크립트 요소</title></head>
<body>
<%
int result = add(10,20);
out.println(result);
%>
<br />
덧셈 결과1 : <%= result %> <br />
덧셈 결과2 : <%= add(30,40) %>
</body>
</html>

