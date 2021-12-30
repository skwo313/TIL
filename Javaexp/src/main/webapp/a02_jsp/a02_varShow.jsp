<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	td {
		text-align: center;
	}
</style>
</head>
<body>
	<%
	String name = "홍길동";
	int age = 25;
	String loc = "서울";
	%>
	<h2 align="center">사람정보</h2>
 	<table align="center" width="50%" border="2">
 		<col width=30%> <!-- col : 컬럼의 비율을 지정 -->
 		<col width=70%>
 		<tr><th>이름</th><td><%=name %></td></tr>
 		<tr><th>나이</th><td><%=age %></td></tr>
 		<tr><th>사는 곳</th><td><%=loc %></td></tr>
 	</table>
</body>
</html>