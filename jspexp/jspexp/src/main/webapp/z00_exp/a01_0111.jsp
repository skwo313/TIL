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
[1단계:개념] 5. session의 4가지 범위와 내용에 대하여 기술하세요.
	4가지 scope
	1) page : 페이지 내에서 지역변수처럼 사용
	2) request :  http요청을 WAS가 받아서 웹 브라우저에게 
				응답할 때까지 변수가 유지되는 경우 사용
	3) session : 웹 브라우저 별로 변수가 관리되는 경우 사용
	4) application : 웹 어플리케이션이 시작되고 종료될 때까지 변수가 유지되는 경우 사용
			 
[1단계:개념] 6. 외부 페이지를 포함하는 형식 3가지를 기술하세요.
	1) iframe(js/html)
		css, html, js단위 데이터 넘겨주거나 설정할 수 있음.
		DOM객체(js) 범위로 화면을 처리할 수 있다. 
		
	2) include 액션태그 설정(jsp)
		- 서버측 include가 아닌 클라이언트측의 include
		- include 되는 페이지와 변수를 같이 사용할 수 없다

	3) directive로 페이지 포함..
		- 포함된 페이지를 포함해서 전체적을 컴파일 되기에 
			같은 페이지에서 선언하는 것과 동일하게 변수나 객체를 공유하여 사용할 수 있다.
		- jsp 파일, html 파일 또는 텍스트 파일 일 수 있는 모든 자원의 내용을 포함하는 데 사용
			include 지시문은 페이지 변환시 포함 된 자원의 원래 컨텐츠를 포함
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