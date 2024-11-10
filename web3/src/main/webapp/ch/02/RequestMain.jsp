<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>내장 객체 - request</title>
</head>
<body>
    <h3>1. 클라이언트와 서버의 환경정보 읽기</h3>
    <!-- GET 방식으로 요청 -->
    <form action="RequestWebInfo.jsp" method="get">
        영어: <input type="text" name="eng" /><br />
        한글: <input type="text" name="han" /><br />
       	<input type="submit" value="GET 전송" />
    </form>    
    <!--  <a href="./RequestWebInfo.jsp?eng=Hello&han=안녕">GET 전송</a>
    <br /><br />-->    
    <!-- POST 방식으로 요청 -->
    <form action="RequestWebInfo.jsp" method="post">
        영어: <input type="text" name="eng" value="Bye" /><br />
        한글: <input type="text" name="han" value="안녕" /><br />
        <input type="submit" value="POST 전송" />
    </form>

    <h3>2. 클라이언트의 요청 매개변수 읽기</h3>
    <form method="post" action="RequestParameter.jsp">
        계정: <input type="text" name="id" value="" /><br />
        성별:
        <input type="radio" name="sex" value="man" />남자
        <input type="radio" name="sex" value="woman" checked="checked" />여자
        <br />
        분야:
        <input type="checkbox" name="favo" value="eco" />경제
        <input type="checkbox" name="favo" value="pol" checked="checked" />정치
        <input type="checkbox" name="favo" value="ent" />연예<br />
        소개:
        <textarea name="intro" cols="22" rows="4"></textarea>
        <br />
        <input type="submit" value="전송" />
    </form>
    <h3>3. HTTP 요청 헤더정보 읽기</h3>
    <a href="RequestHeader.jsp">요청 헤더 정보 읽기</a>    
</body>
</html>