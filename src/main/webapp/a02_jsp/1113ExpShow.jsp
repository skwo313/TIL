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
	String pname = request.getParameter("pname");
	String price = request.getParameter("price");
	String cnt = request.getParameter("cnt");
	%>
	<h2>입력한 물건명: <%=pname %></h2>	
	<h2>입력한 가격: <%=price %></h2>	
	<h2>입력한 갯수: <%=cnt %></h2>
	
</body>
</html>