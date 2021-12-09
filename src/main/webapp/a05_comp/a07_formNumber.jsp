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
	// 1. 구구단의 숫자 임의로 설정
	int grade = (int)(Math.random()*8+2); // 2~9까지의 임의의 수 발생..
	int cnt = (int)(Math.random()*9+1); // 1~9까지 임의의 수 발생..
	%>
	<form>
		<input type="text" size="2" name="num01">
		X <input type="text" size="2" name="num02">
		= <input type="text" size="2" name="num02">
		<br>
		<input type="submit" value="결과확인">
	</form>
	<%
	// 1. 요청값을 받는 처리
	String num01S = request.getParameter("num01");
	String num02S = request.getParameter("num02");
	String resultS = request.getParameter("result");
	// 2. 요청값이 초기화면이 아닐 때, 화면 출력하게 처리
	if(num01S!=null && num02S!=null){
		int num01 = Integer.parseInt(num01S);
		int num02 = Integer.parseInt(num02S);
	%>
		<h3><%=num01%> X <%=num02 %> = <%=(num01*num02) %></h3>
	<%}%>	
</body>
</html>