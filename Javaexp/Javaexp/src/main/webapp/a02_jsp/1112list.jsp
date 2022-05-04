<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a00_exp.A07_Computer"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	A07_Computer c1 = new A07_Computer("i7-7200", 16, 32);
	
	%>
	<style>
		td {text-align: center;}
	</style>
	<h2 align="center">컴퓨터 부품목록</h2>
	<table align="center" width="50%" border>	
		<tr><th>Cpu</th><td><%=c1.getCpu() %></td></tr>
		<tr><th>Ram</th><td><%=c1.getRam() %></td></tr>
		<tr><th>Hdd</th><td><%=c1.getHdd() %></td></tr>
	</table>



</body>
</html>