<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<h2 align="center">수학문제</h2>
    <form>
    <table align="center" border>
    	<tr><th>번호</th><th>문제</th><th>정답</th></tr>
    	<tr><td>1</td>
    		<%
    			int num01=(int)(Math.random()*8+2);
    			int num02=(int)(Math.random()*9+1);
    		%>
    		<td>
    			<input type="text" name="num01" value="<%=num01%>" size="1"/>
    			<input type="text" name="cal" value=" + " size="1"/>
    			<input type="text" name="num02" value="<%=num02%>" size="1"/>
    		</td>
    		<td>
    			<input type="text" name="result" value="" size="1"/>
    		</td>
    	</tr>
    	<tr><td colspan="3"><input type="submit" value="점수확인"/></td></tr>
    	<%
    		String num01S = request.getParameter("num01");
    		String num02S = request.getParameter("num02");
    		String resultS = request.getParameter("result");
    		int point = 0;
    		int num01R = 0;
    		int num02R = 0;
    		int result = 0;
    		// if(num01S!=null) : 로딩한 초기화면에서는 요청값이 없기 떄문에 조건을 처리하지
    		// 			않으면 바로 에러가 발생한다.
    		// integer.parseInt(null); java.lang.NumberFormatExcept
    		// # 결국요청값이 있을 때만 형변환 처리를 한다.
    		if(num01S!=null) num01R = Integer.parseInt(num01S);
    		if(num02S!=null) num02R = Integer.parseInt(num02S);
    		if(resultS!=null) result = Integer.parseInt(resultS);
    		// 임의로 할당된 num01, num02의 정답을 변수로 할당
    		int corNum = num01R + num02R;
    		if(corNum==result){ // +연산결과가 정답일 때 처리될 내용
				point+=25;    			
    		}
    		if(resultS!=null){ // 입력을 했을 때, 결과 점수를 출력
    	%>
    	<tr><td colspan="3">결과점수:<%=point %></td></tr>
    		<%} %>
    </table>
    </form>
</body>
</html>