<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
# post 방식의 한글 요청값을 contentType을 설정하여야 정상적으로 처리한다.
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">구매 리스트</h2>
	<h3 align="center">물건명: <%=request.getParameter("pname") %></h3>
	<h3 align="center">갯수: <%=request.getParameter("cnt") %></h3>
</body>
</html>