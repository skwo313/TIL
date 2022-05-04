<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a08_db.A03_DatabaseDao"
    import="javaexp.a04_vo.Dept"
    import="java.util.ArrayList"
    %>
<%request.setCharacterEncoding("utf-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	A03_DatabaseDao dao = new A03_DatabaseDao();
	%>
	<table align="center" border>
		<tr><th>부서번호</th><th>부서명</th><th>부서위치</th></tr>
		<%for(Dept d:dao.deptList("")){ %>
		<tr><th><%= d.getDeptno() %></th>
			<th><%= d.getDname() %></th>
			<th><%= d.getLoc() %></th></tr>
		<%} %>	
	</table>

</body>
</html>