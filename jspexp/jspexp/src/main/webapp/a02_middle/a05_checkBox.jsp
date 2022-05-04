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
  src="${path}/a00_com/jquery-3.6.0.js"></script>
<script type="text/javascript">
<%--
# checkbox의 요청값 특징
1. checkbox형태는 checked가 된 내용만 요청값을 전달한다.
 
--%>
//
	$(document).ready(function(){
		
	});
</script>
</head>
<body>
	<h3>check box(좋아하는 취미)</h3>
	<form>
	<table>
		<tr><th>선택</th><th>취미</th></tr>
		<tr><td><input type="checkbox" name="hobby" value="독서"/></td><td>독서</td></tr>
		<tr><td><input type="checkbox" name="hobby" value="운동"/></td><td>운동</td></tr>
		<tr><td><input type="checkbox" name="hobby" value="여행"/></td><td>여행</td></tr>
		<tr><td><input type="checkbox" name="hobby" value="게임"/></td><td>게임</td></tr>
		<tr><td><input type="checkbox" name="hobby" value="축구"/></td><td>축구</td></tr>
		<tr><td colspan="2"><input type="submit" value="취미등록"/></td></tr>
	</table>
	</form>
	<%
	String[] hobby = request.getParameterValues("hobby");
	if(hobby!=null){
		for(String hob: hobby){ %>
			<h4><%=hob %></h4>
	<%	}
	}
	%>
	<form>
	<table>
		<tr><th colspan="3">장바구니에 담긴 물건</th></tr>
		<tr><td><input type="checkbox" name="price" value="2000"/></td><td>사과</td><td>2000원</td></tr>
		<tr><td><input type="checkbox" name="price" value="3000"/></td><td>바나나</td><td>3000원</td></tr>
		<tr><td><input type="checkbox" name="price" value="4000"/></td><td>딸기</td><td>4000원</td></tr>
		<tr><td colspan="2"><input type="submit" value="총계"/></td></tr>
	</table>
	</form>
	<%
	String[] priceS = request.getParameterValues("price"); 
	int tot = 0;
	if(priceS!=null){
		for(String price:priceS){
			tot+=Integer.parseInt(price);
		} %>
		<h2>총계: <%=tot %></h2>
	<%
	}
	%>
</body>
</html>