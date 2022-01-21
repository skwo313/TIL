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
	function gogo(){
		$("form").submit();
	}
</script>
</head>
<%
	String url = request.getParameter("goPage");
	if(url!=null){	%>
		<jsp:forward page="<%=url %>"/>
	<%	
	}
%>
<body>
	<h3>쇼핑몰 페이지 이동</h3>
	<form>
	<table>
		<tr><td>
		<select name="goPage" onchange="gogo()">
			<option>이동할 페이지 선택</option>
			<option value="a17_login.jsp">로그인 페이지</option>
			<option value="a18_admin.jsp">관리자 페이지</option>
			<option value="a19_cloth.jsp">의류</option>
		</select> </td></tr>
	</table>
	</form>
</body>
</html>