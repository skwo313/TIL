package javaexp.a00_exp;

public class A12_1113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. 
			웹 프로그램은 client와 server단으로 구분되어 network상 원격으로 웹 서비스를
			제공하는 서버와의 관계 속에서 처리되는 프로그램이다.
				1)  기본 처리 프로세스
				- url에 서버가 있는 주소에 특정한 페이지를 호출
					http://www.google.com/show
					==> http://192.268.23.0:7080/show.jsp
					http://localhost:7080/show.jsp : 고정아이피로 웹서버를
						통해 클라이언트에 전달되기 전에, 개발자가 확인하기 위해
						현재 pc에서 처리결과를 확인할 때, 사용한다
				- 해당 페이지에서 전달 되는 html 문자열을 브라우저로 가져와서
					html 문자열에 있는 태그들을 랜더링(cf h1경우 크기가 큰 문자) 하여
					화면에 출력한다.
		
		2. 
			html/css: 페이지 내의 레이아웃 및 요소를 정의하고 그 요소들을 꾸며주는 역할
			javascript : 웹 페이지의 동적인 처리를 담당
			jsp/java : java코드와 html코드를 혼합하여 최종 html코드를 만들어서
					client(브라우저를 가지고 요청한 사용자)에 WAS를 통해서 전달 처리하는 역할
					
		3. 
			html/css : 클라이언트에서 브라우저를 통해서 랜더링
			javascript : 클라이언트의 브라우저를 통해서 컴파일되고, 실행처리
			java(jsp) : 서버단에서 서버 컨테이너 안에서 컴파일되고, 실행된다.
				요청값을 받은 처리, DB 서버에 접속해서 DB 데이터를 객체로 변환해서
				메모리에 올렸다가 jsp를 통해서 중간중간에 데이터를 html 태그와 함꼐
				표현해서, 최종적으로 html 페이지를 만들어 클라이언트에서 전달한다.
			
		4. 5.
			
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
		----------------------
		<body>
		<%
		String pname = request.getParameter("pname");
		String price = request.getParameter("price");
		String cnt = request.getParameter("cnt");
		%>
		<h2>입력한 물건명: <%=pname %></h2>	
		<h2>입력한 가격: <%=price %></h2>	
		<h2>입력한 갯수: <%=cnt %></h2>
		</body>
		
		6. 
		<script>
			var age = prompt("나이를 입력하세요", "ex) 18");
			if(age>=18){
				console.log("성인입니다");
			}else{
				console.log("미성년입니다");
			}
		</script>
		
		 */
	}

}
