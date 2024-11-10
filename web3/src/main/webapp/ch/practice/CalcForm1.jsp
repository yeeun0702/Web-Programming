<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

%>

<h3>계산기</h3>
<form name="calc1" method="post" action="/web3/calcProcess1" encType="UTF-8">
<input type="text" name="n1" size=5>
<input type="text" name="n2" size=5>
<select name="op">
<option value="+">+</option>
<option value="-">+</option>
<option value="*">+</option>
<option value="/">+</option>
<option value="%">+</option>
</select>

<input type="submit" value="계산">
</form>

</body>
</html>