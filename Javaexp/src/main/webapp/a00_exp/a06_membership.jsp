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
	<h2>회원가입 정보</h2>
	<h3>${param.id }</h3>
	<h3>${param.pass }</h3>
	<h3>${param.passcheck }</h3>
	<h3>${param.name }</h3>
	<h3>${param.pnum }</h3>
	<h3>${param.pnum01 }</h3>
	<h3>${param.pnum02 }</h3>
	<h3>${param.email }</h3>
</body>
</html>