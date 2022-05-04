<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="jspexp.a04_member.*"  %>
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
<%
	String id = request.getParameter("id"); 
	String pass = request.getParameter("pass"); 
	
	String status = "init";
	if(id!=null){
		status = "login";
		Member_DAO dao = new Member_DAO();
		Member_VO m = dao.login(id, pass);
		if(m!=null){
			status = "success";
			session.setAttribute("mem",m);
		}else{
			status = "fail";
		}
	}
	
%>
	$(document).ready(function(){
		var status = "<%=status%>";
		if(status=="success"){
			alert("로그인 성공");
			location.href="main.jsp";
		}
		if(status=="fail"){
			alert("로그인 실패\n다시 로그인 하세요!");
			$("[name=id]").focus();
		}
		
		$("#loginBtn").click(function(){
			var id = $("[name=id]").val();
			var pass = $("[name=pass]").val();
			if(id!=""&&pass!=""){
				$("form").submit(); // form에 요청값을 처리
			}else{
				alert("입력하세요")
			}
		});
	});
</script>
</head>
<body>
	<h3>로그인</h3>
	<form method="post">
	<table>
		<tr><th>아이디</th><td><input type="text" name="id"/></td></tr>
		<tr><th>패스워드</th><td><input type="password" name="pass"/></td></tr>
		<tr><td colspan="2"><input type="button" id="loginBtn" value="로그인"/></td></tr>
		<tr><td colspan="2">회원가입</td></tr>
	</table>
	</form>
	
</body>
</html>