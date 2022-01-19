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
# 회원등록과 로그인 페이지
1. 업무 플로우 순서
	# 일반사용자
	1) 로그인 화면
	2) 회원등록 페이지
	3) 회원상세화면 및 수정/삭제
	
	# 관리자 페이지
 	1) 회원리스트
 	2) 회원의 등록/수정/삭제
 		- 등록 : 회사기반 사원등록 시스템.

2. 처리순서
	1) database 설계 : 테이블 구성
	2) 사용할 sql 정리
	3) 위 sql에 맞게 처리한 VO 구성
	4) DAO 만들기
		- 등록
		- 로그인
		- 리스트
		- 수정
		- 삭제
	5) 화면 구성 페이지 만들기
		- 로그인
		- 회원등록
		- 회원리스트
		- 회원상세
	6) DB 연동 처리
		
 	
--%>
//
	$(document).ready(function(){
		
	});
</script>
</head>
<body>
	<h3>제목</h3>
	<table>
		<tr><th>타이틀</th></tr>
		<tr><td>내용</td></tr>
	</table>
</body>
</html>