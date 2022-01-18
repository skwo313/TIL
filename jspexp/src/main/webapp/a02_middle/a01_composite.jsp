<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="jspexp.z01_vo.*"
    import="jspexp.a03_database.*"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<%-- <%@ include file="" %>포함해서 함께 컴파일시킬 jsp/html페이지 --%>  
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
# jsp페이지의 구성요소
1. 디렉티브(directive)
	- page : jsp페이지에 대한 정보를 지정
		문서의 타입, 출력 버퍼의 크기, 에러 페이지 등 정보 지정
	- taglib : 사용할 태그 라이브러리를 지정
	- include : 다른 문서를 포함
2. 스크립트 : scriptlet, expression, declaration
3. 표현언어(expression language) ${변수명}
4. 기본 객체(implicit object)
	protected void service(HttpServletRequest request, HttpServletResponse response)
	jsp의 경우 반환될 서블릿 자바에서 위 내용을 감싸기에 가능하다.
	- request : 요청 정보를 구할 때 사용
	- response : 응답과 관련될 설정(헤더, 쿠키 등) 시 사용
	- out : 직접 응답을 출력할 때 사용
	- session : 세션 관리에 사용
	
5. 정적 데이터 : 변수, 객체 등 스크립트에서 사용되는 데이터
6. 표준 액션 태그(action tag) : <jsp:include, <jsp:useBean>
7. 커스텀 태그 : <c:set	<c:if	<c:forEach
 
--%>
//
	$(document).ready(function(){
		
	});
<%!public int producttotal(int price, int cnt){
	int total = price*cnt;
	return total;
}

%>
</script>
</head>
<body>
	<h3>제목</h3>
	<table>
		<tr><th>함수호출</th></tr>
		<tr><td><%=producttotal(3000,3) %></td></tr>
	</table>
</body>
</html>