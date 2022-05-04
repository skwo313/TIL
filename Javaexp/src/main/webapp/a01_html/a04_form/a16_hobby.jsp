<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 요청값으로 한글이 넘어올 때 처리
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>선택한 취미(el)</h2>
	<h3>${paramValues.hobby[0] }</h3>
	<h3>${paramValues.hobby[1] }</h3>
	<h3>${paramValues.hobby[2] }</h3>
	<h3>${paramValues.hobby[3] }</h3>
	<h3>${paramValues.hobby[4] }</h3>
	<%--
	# jsp 요청값
	String 단일요청 = request.getParameter("요청키");
	String[] 다중요청 = request.getParameterValues("요청키");
	
	# el을 통한 요청값 받기
	${param.요청키} : 단일값 받기
	${paramValues.요청키[0]} : 다중값 받기
	${param.요청키[2]}
	
	 --%>
	
</body>
</html>