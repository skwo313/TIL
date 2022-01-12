<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="jspexp.z01_vo.*"
    import="jspexp.a03_database.*"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="dept" class="jspexp.z01_vo.Dept" scope="page"/>
<jsp:useBean id="emp" class="jspexp.z01_vo.Emp" scope="session"/>
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
	<h3>사원/부서</h3>
	<%
	emp.setEmpno(1);emp.setEname("홍길동");
	dept.setDeptno(10);dept.setDname("인사");
	%>
	<table>
		<tr><th>사원번호</th><td>${emp.empno}</td></tr>
		<tr><th>사원명</th><td>${emp.ename}</td></tr>
		<tr><th>부서번호</th><td>${dept.deptno}</td></tr>
		<tr><th>부서이름</th><td>${dept.dname}</td></tr>
	</table>
	<h3 onclick="location.href='a22_showBean.jsp'">다음 페이지에서 확인</h3>
</body>
</html>