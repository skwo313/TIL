<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="jspexp.a04_member.*"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<c:set var="path" value="${pageContext.request.contextPath}"/> 
<fmt:requestEncoding value="UTF-8" /> 
<%--공통 session 처리 페이지 --%>
<%@include file="ckSession.jsp" /%>
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
	<h3>회원정보(my page)</h3>
	<form method="post">
	<table>
		<tr><th>아이디</th>
			<td><input type="text" name="id" value="${mem.id}"/></td></tr>
		<tr><td>내용</td></tr>
		<tr><th>패스워드</th><td><input type="password" name="pass" value="${mem.}"/></td></tr>
		<tr><th>패스워드확인</th><td><input type="password" name="passCfm"/></td></tr>
		<tr><th>이름</th><td><input type="text" name="name"  value="${mem.name}"/></td></tr>
	</table>
	</form>
</body>
</html>