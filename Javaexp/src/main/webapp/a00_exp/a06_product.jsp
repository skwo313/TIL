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
	<h2>넘어온 물건정보</h2>
	<h3>${param.pname }</h3>
	<h3>${param.price }</h3>
	<h3>${param.cnt }</h3>
</body>
</html>