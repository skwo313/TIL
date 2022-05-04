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
	# form 요소를 통한 요청값 처리
	1. url로 처리되는 형식을 form으로 처리하면, 화면형식에 데이터르 입력하고,
	요청값을 서버에 전달할 수 있다.
		페이지?요청키=요청값
	2. 기본 형식
		1) form의 속성
		- action="호출할페이지"
		- method="get/post"
			get방식이 default로 url 주소로 페이지와 함께 요청값을 전송
			post방식은 요청값을 url주소에 나타나지 않고, 내부에 숨겨서 요청값을 처리한 것을
				말한다. 보안측면과 요청값의 용량제한이 없어 활용하는 경우가 많다.
		<form action="전달할페이지">
			<input name="요청키" value="요청값"/>
			<select name="요청키"
				<option>선택한요청값
				<option>선택한요청값
				<option>선택한요청값
			<textarea name="요청키">입력한요청값..
			<input type = "submit"> ==> 이 버튼을 클릭시.. action에 선언한
				페이지로 각 요소에 요청키에 해당하는 내용을 입력한 요청값으로 서버에
				전달된다.
	 --%>
	 <form> <!-- action를 선언하지 않으면 현재 페이지에 요청값이 전달된다. -->
	 	<%for(int cnt=1;cnt<=3;cnt++){ %>
	 	등록할 아이디1:<input type="text" name="id" value="himan"/><br>
	 	<%} %>
	 	<input type="submit" value="등록"/>
	 </form>
	 <%
	 // 여러 개를 같은 이름으로 보내면..
	 // id=himan&id=higirl&id=goodMan
	 // request.getParameter()는 첫번째 값만 받을 수 있다.
	 //	String id = request.getParameter("id");
	 	String[] id = request.getParameterValues("id");
	 %>
	 <%
	 if(id!=null){
		 for(int idx=0;idx<id.length;idx++){
			 
	
	 %>
	 <h2>등록할 아이디<%=(idx+1) %>:<%=id[idx] %></h2>
	 <%	 }
		 
	 } %>
</body>
</html>