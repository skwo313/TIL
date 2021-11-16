<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
# 웹 프로그램의 프로세스..
1. 웹 프로그램은 client와 server단으로 구분되어 network상 원격으로 웹 서비스를
	제공하는 서버와의 관계 속에서 처리되는 프로그램이다.
	client =========> server
		   <=========
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
			
	2) 각 언어들의 처리 시점과 처리방법
		html/css : 클라이언트에서 브라우저를 통해서 랜더링
		javascript : 클라이언트의 브라우저를 통해서 컴파일되고, 실행처리
		java(jsp) : 서버단에서 서버 컨테이너 안에서 컴파일되고, 실행된다.
			요청값을 받은 처리, DB 서버에 접속해서 DB 데이터를 객체로 변환해서
			메모리에 올렸다가 jsp를 통해서 중간중간에 데이터를 html 태그와 함꼐
			표현해서, 최종적으로 html 페이지를 만들어 클라이언트에서 전달한다.
 --%>
	<form action="a05_show.jsp">
		아이디: <input type="text" name="id" value=""><br>
		패스워드: <input type="password" name="pass"><br>
		<input type="button" value="로그인" onclick="login()"><br>
	</form>
	<script>
		// javascript로 id와 pass값을 입력했을 떄, 서버를 호출하고,
		// 그렇지 않을 떄는 전송이 안되게 처리..
		// 1. DOM : document object model : 화면에 있는 태그를 객체로 인식하여 처리하는 object
		//	  DOM  객체는 순서별로 실행이 되기에 위에 html코드 이후, 코딩하여야 한다
		function login() {
		// 2. DOM 객체의 인식 방법 [속성 = 속성값]
		// 3, 해당객체가 가지고 있는 속성.value를 통해서 입력한 값을 확인 할수 있다
		// f12으로 해당 변수명이나 타이핑에 문제가 있는지 확인
			// input의 id로 되어 있는 요소객체를 지칭, 메모리에 로딩
			// var : variable의 약자로 자바스크립트는 초기에 데이터유형을 선언하지 않고,
			//   모든 유형의 데이터 타입을 받을 수 있게 선언할 떄, 사용하는 keyword
			// DOM은 화면에 있는 태그를 객체화하여 속성이나 메서드를 사용할 수 있게 한다.
			var idObj = document.querySelector("[name=id]");
			// var idObjValue = document.querySelector("[name=id]").value;
			var passObj = document.querySelector("[name=pass]");
			// name이 아이디인 곳에 입력한 데이터를 속성으로 가져온다.
			console.log("입력한 아이디: " + idObj.value);
			if(idObj.value==""){
				alert("아이디를 입력하세요");
				return; // 더 이상 아래 프로세스 진행하지 못하게 처리..
			}
			// console.log("입력한 아이디"+ idObjValue);
			console.log("입력한 패스워드: " + passObj.value);
			if(passObj.value==""){
				alert("패스워드를 입력하세요");
				return; // 더 이상 아래 프로세스 진행하지 못하게 처리..
			}
			// 모든 입력 요소 객체를 계층구조로 포함하고 있는 form 요소객체를 선언
			var formObj = document.querySelector("form");
			// 해당 요소 객체의 기능 메서드를 통해서 지정한 서버의 자원(a05_show.jsp)를 호출
			// 요소 객체를 다 포함하고 있는 form 객체를 선택해서
			// 기능메서드 submit()를 통해서 요소의 값을 서버에 전달한다.
			formObj.submit();
		}
	</script>
	<%--
		전송하기 전에 입력데이터를 확인해서 전송
		1) 바로 넘어가게 하지 않으려면 type="button"
		2) 이벤트 핸들러 함수 선언
			<input type="button" value="로그인" onclick="login()">
			
			function login(){
			
			}
		---------------
		3) 해당 요소객체의 데이터 확인 
			// 화면에 있는 <input name="id" value="himan">를 객체화하여
			// 처리
				
	 --%>
</body>
</html>