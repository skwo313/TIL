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
# ajax 처리 순서
1. 어떤 js이벤트에 의해서 ajax처리할 것인가를 결정
	1) key를 입력했을 때,
	2) 특정한 button을 클릭했을 때
	
2. ajax통해서 호출할 자원(controller, jsp지정)
	1) servlet의 경우는 mapping url 호출..
		url:"${path}/empAjax.do"
		==> controller 중에서 urlPatterns = { "/empAjax.do" }
		로 선언한 부분을 호출한다.
	2) 서버에 전달할 요청값에 대한 처리
		data:$("form).serialize(),
			: jqeury에서 아래 query string 형식으로 자동으로 만들어준다.
				form하위에 있는 모든 요소객체를 name="key" value="value"
		data:"key=value&key2=value"
			ename=A&job=SA
		controller
			request.getParameter("ename");
			request.getParameter("job");
	3) url과 요청내용에서 받은 결과를 가져오기
		dataType:"json",
		success:function(data){
				매개변수인 data를 통해서 받은 데이터
				dataType의 유형이 text : 문자열 그대로 받기 처리.
				dataType의 유형이 json : 문자열을 객체로 변환해서 받는다.
				객체를 받은 내용을 필요로 하는 html 문자열로 변환해서 반복문과 조건을 통해
					특정한 DOM객체 html(), append()를 통해서 화면에 출력한다.
			
			}
--%>
//
	$(document).ready(function(){
		$("#schBtn").click(function(){
			ajaxFunc("");
		});
		$("[name=ename],[name=job]").on("keyup",function(){
			// $("form").serialize() : form하위에 있는 모든 요소객체들을 서버에 요청값으로
			//	자동으로 변환 처리해주는 jquery 기능 메서드이다.(한글 encoding처리..)
			//$("h3").text( $("form").serialize() );
			console.log( $("form").serialize() );
			ajaxFunc($("form").serialize());
			
	});
	function ajaxFunc(qStr){
		$.ajax({
			url:"${path}/empAjax.do",
			dataType:"json",
			data:qStr,
			success:function(data){
				var emplist = data;
				console.log(data);
				var listTxt = "";
				$.each(emplist, function(idx,emp){
					console.log(idx+":"+emp);
					listTxt+= "<tr><td>"+emp.empno+"</td><td>"+emp.ename+"</td>"+
						"<td>"+emp.job+"</td><td>"+emp.sal+"</td>"+
						"<td>"+emp.comm+"</td><td>"+emp.deptno+"</td></tr>";
				});
				//$("h3").append(", 건수:"+emplist.length);
				$("#show").html(listTxt);
			}
		});
	}
</script>
</head>
<body>
	<h3>DB ajax 처리(Emp)</h3>
	<form>
	<table>
		<tr><th>사원명</th><td><input type="text" name="ename" /></td></tr>
		<tr><th>직책</th><td><input type="text" name="job"/></td></tr>
		<tr><td colspan="2"><input type="button" id="schBtn" value="조회"/></td></tr>
	</table>
	</form>
	<table>
		<thead>
			<tr><th>사원번호</th><th>사원명</th><th>직책명</th><th>급여</th>
				<th>보너스</th><th>부서번호</th></tr>
		</thead>
		<tbody id="show"></tbody>
	</table>
</body>
</html>