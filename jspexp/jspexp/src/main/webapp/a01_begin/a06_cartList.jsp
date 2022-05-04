<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="jspexp.z01_vo.*"
    import="jspexp.a03_database.*"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<c:set var="path" value="${pageContext.request.contextPath}"/> 
<fmt:requestEncoding value="UTF-8" /> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" 
	href="${path}/a00_com/a00_com.css">
<style>

</style>
<script type="text/javascript" 
  src="${path}/a00_com/jquery-3.5.1.js"></script>
<script type="text/javascript">
<%--

 
--%>
//
	$(document).ready(function(){
		
	});
</script>
</head>
<body>
	<h3>장바구니 목록</h3>
	<%
	ArrayList<Cart> cart = new ArrayList<Cart>();
	cart.add(new Cart("사과", 3000, 3));
	cart.add(new Cart("바나나", 2000, 4));
	cart.add(new Cart("과자", 3000, 5));
	%>
	
	<table>
		<tr><th>번호</th><th>물건명</th><th>가격</th><th>갯수</th><th>단위계</th></tr>
		<%
		int tot = 0;
		for(int i=0;i<cart.size();i++){
			Cart c01 = cart.get(i);
			int sum = c01.getPrice()*c01.getCnt();
			tot += sum;
		%>
		<tr><td><%= i+1 %></td><td><%=c01.getPname() %></td>
		<td><%=c01.getPrice() %></td><td><%=c01.getCnt() %></td><td><%=sum %></td></tr>
		<%} %>
		<tr><td colspan="2"><%=tot %></td></tr>
	</table>
</body>
</html>