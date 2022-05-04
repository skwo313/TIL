<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>생일파티정보</h3>
	<h4>날짜:${param.date }</h4>
	<h4>시간:${param.time }</h4>
	<h4>장소:${param.place }</h4>
</body>
</html>