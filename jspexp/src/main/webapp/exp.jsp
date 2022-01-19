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
</script>
</head>
<body>
<form action="">
숫자1<input type="text" name="num01"/><br>
숫자2<input type="text" name="num02"/><br>
<input type="submit" value="합산"/>
</form>
<%
int num01, num02; num01=num02=0;
String num01S = request.getParameter("num01"); if(num01S!=null) num01=Integer.parseInt(num01S);
String num02S = request.getParameter("num02"); if(num02S!=null) num02=Integer.parseInt(num02S);
int tot = num01+num02;
%>
<h4>총계:<%=tot %></h4>
</body>
</html>