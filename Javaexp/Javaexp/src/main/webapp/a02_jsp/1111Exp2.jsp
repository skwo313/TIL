// 5.

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a04_vo.Product"
    %>
<!DOCTYPE html>
<html>
<head>
<style>
	td {text-align:center;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Product p1 = new Product("연필", 1000, 2);
	Product p2 = new Product("지우개", 500, 3);
	Product p3 = new Product("색연필", 1500, 3);
	int sum1 = p1.sum();
	int sum2 = p2.sum();
	int sum3 = p3.sum(); 
	int tot = sum1+sum2+sum3;
	%>
	<h2 align="center">물건 정보</h2>
	<table align="center" border="2" width="70%">
		<thead>
			<tr><th>이름</th><th>가격</th><th>갯수</th><th>계</th><tr>
		</thead>
		<tbody>
			<tr>
				<td><%=p1.getProduct()%></td>
				<td><%=p1.getPrice() %></td>
				<td><%=p1.getCnt() %></td>
				<td><%=p1.sum()%></td>
			</tr>
			<tr>
				<td><%=p2.getProduct()%></td>
				<td><%=p2.getPrice() %></td>
				<td><%=p2.getCnt() %></td>
				<td><%=p2.sum()%></td>
			</tr>
			<tr>
				<td><%=p3.getProduct()%></td>
				<td><%=p3.getPrice() %></td>
				<td><%=p3.getCnt() %></td>
				<td><%=p3.sum()%></td>
			</tr>
		</tbody>
		<tfoot>
	 		<tr><td colspan="3">총계</td><td><%=tot %></td></tr>
	 	</tfoot>
	</table>
</body>
</html>