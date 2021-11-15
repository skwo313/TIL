<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a04_vo.Player"
    %>
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
	Player p1 = new Player("김광현", "투수", "sk와이번즈", 1);
	Player p2 = new Player("석광우", "투수", "Lg트윈스", 2);
	%>
	<h1 align="center">선수 정보</h1>
	<table align="center" border="2" width="75%">
		<col width="25%">
		<col width="25%">
		<col width="25%">
		<col width="25%">
		<thead>
			<tr><th>선수명</th><th>분야</th><th>소속팀</th><th>성적</th></tr>
		</thead>
		<tbody>
			<tr>
				<td><%=p1.getPname()%></td>
				<td><%=p1.getKind()%></td>
				<td><%=p1.getTeam()%></td>
				<td><%=p1.getScore()%>위</td>
			</tr>
			<tr>
				<td><%=p2.getPname()%></td>
				<td><%=p2.getKind()%></td>
				<td><%=p2.getTeam()%></td>
				<td><%=p2.getScore()%>위</td>
			</tr>
		</tbody>
	</table>
</body>
</html>