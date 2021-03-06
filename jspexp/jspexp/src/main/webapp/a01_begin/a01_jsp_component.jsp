<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="jspexp.z01_vo.*"
    import="jspexp.a03_database.*"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%-- jstl을 통한 변수 선언 
pageContext.request.contextPath : 프로젝트명을 context경로로 변수
path로 지정하여, 절대 경로로 모든 자원들을 활용할 수 있게 한다.
즉, 물리적으로 jspexp\src\main\webapp를 기준 경로로 지정할 수 있다.
저장시 jstl 변수 선언 방식인 <c:set var="변수명" value="저장할 데이터"/>
${path} : jstl에 의해 저장된 변수를 웹 화면에서 사용할 때, 활용하는 변수명
--%>
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
	<%!
	// 선언 부분 : 변수명, 기능메서드, 이 페이지에서만 사용할 클래스
	int plus(int num01, int num02){
		return num01+num02;
	}	
	int price;
	int cnt;
	int calcu(int price, int cnt){
		return price*cnt;
	}
	%>
	<%
	// scriptlet : 선언된 변수, 또는 지역변수 선언, 객체 생성/조건/반복문 처리등 
	//  	자바 파일로 비유하면 main()의 영역과 비슷한 영역이다.
	int tot = plus(25, 30); // 선언된 메서드 호출..
	price = 3000;
	cnt = 2;
	int tot2 = calcu(price, cnt);
	%>
	<h3>결과값 <%=tot%></h3> 
	<%-- expression <%=출력할변수%> 형식으로 화면에 처리할 내용을 사용한다. --%>
	<%--ex) 선언부분에 물건가격과 갯수를 통해 계를 처리하는 메서드 선언하고,
			scriplet에 물건명과 가격, 메서드 호출, expression에 최종 결과를 출력하세요 
			10:30 풀이 합니다.
			--%>
	<table>
		<tr><th>물건가격</th><td><%=price%></td></tr>
		<tr><th>물건갯수</th><td><%=cnt%></td></tr>
		<tr><th>총계</th><td><%=tot2%></td></tr>
	</table>
</body>
</html>