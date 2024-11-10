<%@ page import="java.util.HashMap"%>
<%@ page import="common.Person"%>
<%@ page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>application 영역</title>
</head>
<body>
    <h3>application 영역의 공유</h3>
    <%
    Map<String, Person> maps = new HashMap<>(); // Map<String, Person> maps = new HashMap<String, Person>();
    maps.put("actor1", new Person("브라보", 30));
    maps.put("actor2", new Person("부싯돌", 28));
    application.setAttribute("maps", maps);
    %>
    application 영역에 속성이 저장되었습니다.
</body>
</html>