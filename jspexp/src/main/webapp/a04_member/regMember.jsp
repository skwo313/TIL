<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="jspexp.a04_member.*"  %>
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
		$("#joinBtn").click(function(){
			
			var id = $("[name=id]").val();
			var pass = $("[name=pass]").val();
			var passCfm = $("[name=passCfm]").val();
			var name = $("[name=name]").val();
			var pnum = $("[name=pnum]").val();
			var email = $("[name=email]").val();
			if(id==null){
				alert("아이디를 입력하세요");
				$("[name=id]").focus();
				return;
			}
			if(pass==null){
				alert("패스워드를 입력하세요");
				$("[name=pass]").focus();
				return
			}
			if(passCfm!=pass){
				alert("패스워드가 동일하지 않습니다");
				$("[name=passCfm]").focus();
				return;
			}
			if(name==null){
				alert("이름을 입력하세요");
				$("[name=name]").focus();
				return;
			}
			if(pnum==null){
				alert("핸드폰 번호를 확인하세요\n-표시 없이 입력");
				$("[name=pnum]").val("");
				$("[name=pnum]").focus();
				return;
			}
			if(email==null){
				alert("이메일을 입력하세요");
				$("[name=ename]").focus();
				return;
			}
			if($("#ckId").val()!="Y"){
				alert("회원 아이디 등록 여부를 check하셔야 합니다")
				return;
			}
			if(confirm("회원가입 하시겠습니까?")){
				$("form").submit();
			}
		});
		$("ckIdBtn").click(function(){
			$.ajax({
				url:"${path}/CheckIdMvc.do",
				data:"id="+$("[name=id]").val(),
				success:function(data){
					alert("받은값"+data);
					// ajax 처리 통해서 check해서 지금 등록된 id가 아닐 때
					$("ckId").val(data);
					// if 유효성 check 후,
					// $("[name=id]").attr
				}
			});
			
		});
	});
</script>
</head>
<body>
	<h3>회원가입</h3>
	<form method="post">
			<input type="hidden" id="ckId"/>
		<table>
			<tr><th>아이디</th>
				<td><input type="text" name="id"/>
					<input type="button" id="ckIdBtn" value="등록여부"/>
				</td></tr>
			<tr><th>패스워드</th><td><input type="password" name="pass"/></td></tr>
			<tr><th>패스워드확인</th><td><input type="password" name="passCfm"/></td></tr>
			<tr><th>이름</th><td><input type="text" name="name"/></td></tr>
			<tr><th>전화번호</th><td><input type="text" name="pnum"/></td></tr>
			<tr><th>이메일</th><td><input type="text" name="email"/></td></tr>
			<tr><td colspan="2"><input type="button" id="joinBtn" value="회원가입"/></td></tr>
		</table>
	</form>
	<%
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	String name = request.getParameter("name");
	String pnum = request.getParameter("pnum");
	String email = request.getParameter("email");
	if(id!=null){
		Member_VO ins = new Member_VO(id, pass, name, pnum, email);
		Member_DAO dao = new Member_DAO();
		dao.insertMember(ins);
	%>
	<script type="text/javascript">
		alert("등록 성공\n로그인 페이지 이동!");
		location.href="login.jsp";
	</script>
	<%} %>
</body>
</html>