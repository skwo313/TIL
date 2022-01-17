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
 
 
--%>
//
	$(document).ready(function(){
		$("#Btn").click(function(){
			ajaxFunc($("form").serialize());
		});
		$("[name=loc]").on("keyup",function(){
			ajaxFunc($("form").serialize());
		});
	});
	function ajaxFunc(qStr){
		$.ajax({
			url:"${path}/deptAjax.do",
			data: qStr,
			dataType:"json",
			success:function(dlist){
				var listTxt = "";
				$.each(dlist, function(idx,dept){
					listTxt += "<tr><td>"+dept.deptno+"</td><td>"+
					dept.dname+"</td><td>"+dept.loc+"</td></tr>";
				});
				$("#show").html(listTxt);
			}
		});
	};
</script>
</head>
<body>
	<h3>ajax 부서정보</h3>
	<form>
	<table>
		<tr><th>지역</th><td><input type="text" name="loc"/> </td></tr>
		<tr><td colspan="2"><input type="button" id="Btn" value="조회"></td></tr>
	</table>
	</form>
	<table>
		<thead>
			<tr><th>부서번호</th><th>부서이름</th><th>지역</th></tr>
		<thead>
		<tbody id="show">
		</tbody>
	</table>
</body>
</html>