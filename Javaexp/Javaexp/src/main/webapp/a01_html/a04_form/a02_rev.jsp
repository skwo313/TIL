<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- client의 name="key" 로 입력된 데이터가
		param.key로 받을 수 있다.
	a04_form/a02_rev.jsp?name=홍길동
	 -->
	<h2>전송되어온 데이터:${param.name}</h2>
</body>
</html>