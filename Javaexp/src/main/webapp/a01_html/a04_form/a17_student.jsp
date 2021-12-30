<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>넘어온 학생정보</h2>
	<h4>${param.name}</h4>
	<h4>${param.grade}</h4>
	<h4>${param.gender}</h4>
</body>
</html>