<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!String[] names = { "꽃분홍", "브라보", "부싯돌", "렌보짱", "남대찬" };

	int add(int num1, int num2) {
		return num1 + num2;
	} // 선언부에 작성%>


	add(10,20) 결과: <%=add(10, 20)%>
	<hr>
	
	<h4>jspHello.jsp 포함 </h4>
	<%@ include file="jspHello.jsp" %>
	<hr>
	<h4>배열 데이터 출력</h4>
	<%
	for(String name : names){
		%>
		<li><%= name %></li>
		<%
	}
	 %>
	
</body>
</html>
