<%@ page import="java.util.Collection"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 응답 헤더에 추가할 값 준비 
SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm");
long add_date = s.parse(request.getParameter("add_date")).getTime();
int add_int = Integer.parseInt(request.getParameter("add_int"));
String add_str = request.getParameter("add_str");

// 응답 헤더에 값 추가
response.addDateHeader("날짜", add_date);
response.addIntHeader("숫자", add_int);
response.addIntHeader("숫자", 1004); // 추가
response.addHeader("이름", add_str);
response.addHeader("이름", "부싯들");
// response.setHeader("이름", "브라보");  // 수정
%>
<html>
<head>
	<title>내장 객체 - request</title>
</head>
<body>
    <h3>응답 헤더정보 출력하기</h3>
    <%
    Collection<String> headerNames = response.getHeaderNames();
    for (String hName : headerNames) {
        String hValue = response.getHeader(hName);
    %>
        <li><%= hName %> : <%= hValue %></li>
    <%}   
    %>  
    <h3>숫자만 출력하기</h3>
    <%
	Collection<String> myNumber = response.getHeaders("숫자");
	for (String num : myNumber) {
	%>
		<li>숫자 : <%= num %></li>
	<%}
	%>
	
<h3>이름만 출력하기</h3>
    <%
   Collection<String> myName = response.getHeaders("이름");
   for (String name : myName) {
   %>
      <li>이름 : <%= name %></li>
   <%
   }
   %>
</body>
</html>