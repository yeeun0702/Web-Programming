<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calcProcess</title>
</head>
<body>
	<%
   int n1 = Integer.parseInt(request.getParameter("n1"));
   int n2 = Integer.parseInt(request.getParameter("n2"));
   
   int result = 0;
   
   String op = request.getParameter("op");
   switch(op){
   case "+": result = n1+n2;break;
   case "-": result = n1-n2;break;
   case "*": result = n1*n2;break;
   case "/": result = n1/n2;break;
   }
   %>
	calcProcess1 계산 결과 :
	<%=result %>
</body>
</html>