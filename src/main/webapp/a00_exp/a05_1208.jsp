
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function sum(kors, eng, math){
		document.Write("kors+eng+math);
		
	} 
</script>
</head>
<body>
	<form>
		<table>
			<tr>
				<th>물건명</th><th>가격</th><th>갯수</th>
			</tr>
			<tr>
				<th>사과</th>
				<td><input type="text" name="price1" size="1" required></td>
				<td><input type="text" name="cnt1" size="1" required></td>
			</tr>
			<tr>
				<th>바나나</th>
				<td><input type="text" name="price2" size="1" required></td>
				<td><input type="text" name="cnt2" size="1" required></td>
			</tr>
			<tr>
				<th>딸기</th>
				<td><input type="text" name="price3" size="1" required></td>
				<td><input type="text" name="cnt3" size="1" required></td>
			</tr>
		</table>
		<input type="submit" value="총합확인">
	</form>
	<%
		String price1S = request.getParameter("price1");
		String price2S = request.getParameter("price2");
		String price3S = request.getParameter("price3");
		String cnt1S = request.getParameter("cnt1");
		String cnt2S = request.getParameter("cnt2");
		String cnt3S = request.getParameter("cnt3");

		if(price1S!=null && cnt1S!=null &&
                price2S!=null && cnt2S!=null &&
                price3S!=null && cnt3S!=null){
            int price1 = Integer.parseInt(price1S);
            int cnt1 = Integer.parseInt(cnt1S);
            int price2 = Integer.parseInt(price2S);
            int cnt2 = Integer.parseInt(cnt2S);
            int price3 = Integer.parseInt(price3S);
            int cnt3 = Integer.parseInt(cnt3S);
    %>
        <h3>총합<%=( (price1*cnt1)+(price2*cnt2)+(price3*cnt3) )%></h3>
    <%}%>
    <h3>국어점수: ${kors}</h3>
    <h3>영어점수: ${eng}</h3>
    <h3>수학점수: ${math}</h3>
    
    <%
    int korI = Integer.parseInt(request.getParameter("kors"));
    int engI = Integer.parseInt(request.getParameter("eng"));
    int mathI = Integer.parseInt(request.getParameter("math"));
    %>
    <h3>총합: <%=(korI+engI+mathI)%></h3>
</body>
</html>
<%-- 
2021-12-08
[1단계:개념] 1. 페이지호출과 요청값에 대한 처리 방식을 서버와 클라이언트 관점에서 구분하여 설명하세요.
[1단계:개념] 2. url 호출 요청값 처리와 form요소 하위객체의 요청값 처리를 비교하여 기술하세요.
[1단계:확인] 3. 로그인화면을 구성하고, form id/pass가 himan/7777일때, 인증 그외는 미인증으로 처리하세요. 
[2단계:확인] 4. 아래와 같은 여러 개의 물품 구매를 처리하여 총계를 처리하는 결과를 요청값에 의해 나타내세요.
            물건명   가격   갯수
            사과    [  ] [  ]
            바나나   [  ] [  ]
            딸기    [  ] [  ]
                  [총계]
[3단계:확인] 5. 임의의 수학문제 10개(연산자도 임의 숫자도 임의)를 내고 총점을 계산하여 100점만점 기준으로 출력처리하세요
            번호    문제       정답
            1   [ ][X][  ] [  ]
            2   [ ][+][  ] [  ]
            3   [ ][-][  ] [  ]
            4   [ ][X][  ] [  ]
            ..
                  [점수확인]
[1단계:확인] 6. jsp의 MVC 개발 패턴에 대하여 기술하세요
[3단계:확인] 7. MVC패턴으로 controller/view을 만들어서 호출하되 모델 데이터로 국어,영어,수학점수 설정하고, view단에서
            해단 점수와 합산/평균을 처리하세요
--%>