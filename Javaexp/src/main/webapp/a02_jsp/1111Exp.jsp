<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javaexp.a04_vo.Season"
    import="java.util.ArrayList"
    %>
<!DOCTYPE html>
<html>
<head>
<style>
	td {text-align:center;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// api : 많이 활용하는 객체는 java 쪽에서 만들어서 제공한다. 이것을 사용할 때,
	//		지정된 패키지와 클래스를 선언해주면 된다..
	// 동적 배열 중에 객체가 들어가 동적배열 처리
	//   ArrayList<객체유형>
	ArrayList<Season> slist = new ArrayList<Season>();
	// slist.add(new 객체());
	// Season(String season, String weather, String priod)
	slist.add(new Season("봄", "꽃샘추위","3월~5월"));
	slist.add(new Season("여름", "무더위","6월~9월"));
	slist.add(new Season("가을", "서늘함","10월~11월"));
	slist.add(new Season("겨울", "눈/추위","12월~2월"));
	// [new Season(), new Season(),new Season(), new Season()]
	// slist.get(0) : 첫번째 Season() 객체를 지정
	// slist.get(0).getWeather() : 해당 객체에 소속된 메서드를 호출
	%>
	<h1 align="center">날씨 정보</h1>
	<table align="center" border="2" width="75%">
		<col width="33%">
		<col width="33%">
		<col width="33%">
		<thead>
			<tr><th>계절</th><th>날씨</th><th>기간 속성</th></tr>
		</thead>
		<tbody>
			<tr>
				<td><%=slist.get(0).getSeoson()%></td>
				<td><%=slist.get(0).getWeather()%></td>
				<td><%=slist.get(0).getProperty()%></td>
			</tr>
			<tr>
				<td><%=slist.get(1).getSeoson()%></td>
				<td><%=slist.get(1).getWeather()%></td>
				<td><%=slist.get(1).getProperty()%></td>
			</tr>
			<tr>
				<td><%=slist.get(2).getSeoson()%></td>
				<td><%=slist.get(2).getWeather()%></td>
				<td><%=slist.get(2).getProperty()%></td>
			</tr>
		</tbody>
	</table>
	
</body>
</html>