<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="1113ExpShow.jsp">
	물건명: <input type="text" name="pname"><br>
	가격: <input type="text" name="price"><br>
	갯수: <input type="text" name="cnt"><br>
	<input type="button" value="등록" onclick="join()">
	</form>
	<script>
		function join() {
			var pnameObj = document.querySelector("[name=pname]");
			var priceObj = document.querySelector("[name=price]");
			var cntObj = document.querySelector("[name=cnt]");
			if(pnameObj.value==""){
				alert("물건명을 입력하세요");
				return;
			}
			if(priceObj.value==""){
				alert("가격을 입력하세요");
				return;
			}
			if(cntObj.value==""){
				alert("갯수를 입력하세요");
				return;
			}
			var formObj = document.querySelector("form");
			formObj.submit();
		}
	</script>
</body>
</html>