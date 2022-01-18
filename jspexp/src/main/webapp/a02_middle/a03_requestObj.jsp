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
  src="${path}/a00_com/jquery-3.6.0.js"></script>
<script type="text/javascript">
<%--
 
 
--%>
//
	$(document).ready(function(){
		
	});
	
<%
String id = request.getParameter("id"); if(id==null) id="";
String []ids = request.getParameterValues("id");
%>
</script>
</head>
<body>
	<h3>회원등록</h3>
	<h4>입력된 아이디: <%=id %></h4>
	<%if(ids!=null){
		for(String id2: ids){
	%>
			<h3>다중의 아이디 <%=id2 %></h3>
	<%
		}
	}
	%>	
	<form action="">
	<table>
		<tr><th>아이디1</th><td><input type="text" name="id"/></td></tr>
		<tr><th>아이디2</th><td><input type="text" name="id"/></td></tr>
		<tr><th>아이디3</th><td><input type="text" name="id"/></td></tr>
		<tr><th>아이디4</th><td><input type="text" name="id"/></td></tr>
		<tr><td colspan="2"><input type="submit" value="등록"/></td></tr>
	</table>
	</form>
	
	
	<%
	String []prods = request.getParameterValues("prod");
	if(prods!=null){
		for(String prod: prods){%>
			<h4>구매할물건: <%=prod %></h4>
	<%	}
	}
	%>
	<form action="">
	<table>
		<tr><th>물건명1</th><td><input type="text" name="prod"/></td></tr>
		<tr><th>물건명2</th><td><input type="text" name="prod"/></td></tr>
		<tr><th>물건명3</th><td><input type="text" name="prod"/></td></tr>
		<tr><th>물건명4</th><td><input type="text" name="prod"/></td></tr>
		<tr><td colspan="2"><input type="submit" value="등록"/></td></tr>
	</table>
	</form>
</body>
</html>