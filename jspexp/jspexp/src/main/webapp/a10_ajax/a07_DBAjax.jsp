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
		$("#btn").click(function(){
			var prodname = $("[name=prodname]").val();
			var price = $("[name=price]").val();
			var cnt = $("[name=cnt]").val();
			$.ajax({
				url:"${path}/ajaxMvc04.do",
				data:"prodname="+prodname+"&price="+price+"&cnt="+cnt,
				type:"get",
				dataType:"json",
				success:function(data){
					var prod = data;
					$("span").eq(0).text(prod.prodname);
					$("span").eq(1).text(prod.price);
					$("span").eq(2).text(prod.cnt);
				}
			});
		});
		/* $("h4").click(function(){
			var name = $([name=name]).val();
			$.ajax({
				url:"${path}/ajaxMvc05.do"
				data:"name="+name
			});
		}); */
		
		$("h5").click(function(){
			var stname = $("[name=stname]").val();
			var kor = $("[name=kor]").val();
			var eng = $("[name=eng]").val();
			var math = $("[name=math]").val();
			$.ajax({
				url:"${path}/ajaxMvc05.do",
				data: "stname="+stname+"&kor="+kor+"&eng="+eng+"&math="+math,
				type: "get",
				dataType: "json",
				success:function(data){
					$("#stud td").eq(0).text(data.stname);
					$("#stud td").eq(1).text(data.kor);
					$("#stud td").eq(2).text(data.eng);
					$("#stud td").eq(3).text(data.math);
				}
			});
		});
	});
</script>
</head>
<body>
	<h4></h4>
	<table>
		<tr><th>물건명</th><td><input type="text" name="prodname"></td></tr>
		<tr><th>가격</th><td><input type="text" name="price"></td></tr>
		<tr><th>갯수</th><td><input type="text" name="cnt"></td></tr>
		<tr><td colspan="2" ><input type="button" id="btn" value="입력"></td></tr>
	</table>
	<h4>물건명:<span></span> 가격:<span>0</span> 갯수:<span>0</span></h4>
	
	<h5>성적정보</h5>
	이름: <input type="text" name="stname" ><br>
	국어: <input type="text" name="kor" ><br>
	영어: <input type="text" name="eng" ><br>
	수학: <input type="text" name="math" ><br>
	<table id="stud">
		<tr><th>이름</th><th>국어</th><th>영어</th><th>수학</th></tr>
		<tr><td></td><td></td><td></td><td></td></tr>
	</table>
</body>
</html>