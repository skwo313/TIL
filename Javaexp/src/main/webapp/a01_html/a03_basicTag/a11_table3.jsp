<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
#product table {
	text-align: center;
	border: 1px solid black;
	border-collapse: collapse;
}

#product th {
	background-color: yellow;
}
</style>
<body>
	<%--
	# jsp의 반복문과 테이블 처리
	1. col단위 반복문 수행으로 테이블 출력 처리..
		jsp
		<%
		for(초기값;반복조건;증감연산자){
		%>
		처리한 태그(반복출력할 내용)
		<%
		}
		%>
	2. 배열값
		for(단위 데이터:배열){
			단위데이터..
		}
	 --%>
	<table border="1">
		<tr>
			<%
			for (int cnt = 1; cnt <= 5; cnt++) {
			%>
			<td><%=cnt%> 번 열</td>
			<%
			}
			%>
		</tr>
	</table>
	<%
	String fruits[] = { "사과", "바나나", "딸기" };
	%>
	<table border>
		<tr>
			<%
			for (String fruit : fruits) {
			%>
			<td><%=fruit%></td>
			<%
			}
			%>
		</tr>
	</table>
	<%
	int numbers[] = { 1000, 2000, 3000 };
	%>
	<%--
	배열의 반복문 index 처리
	
	for(int idx=0;idx<numbers.length;idx++){
		idx : 0부터 시작해서 .length보다 1작을 때까지 반복수행..
		prices[idx] : 배열의 값을 가져올 수 있다.
	}
	 --%>
	<table border>

		<%
		for (int number:numbers) {
		%>
		<tr>
			<td><%=number%></td>
		</tr>
		<%
		}
		%>
	</table>
	<%
	String product[] = { "컴퓨터", "냉장고", "세탁기" };
	%>
	<table border>
		<tr>
			<th>번호</th>
			<th>전자제품</th>
		</tr>
		<%
		for (int idx = 0; idx < product.length; idx++) {
		%>
		<tr>
			<td><%=(idx + 1)%></td>
			<td><%=product[idx]%></td>
		</tr>
		<%
		}
		%>
	</table>
	<%
	String bookTitle[] = { "데이터베이스개론", "웹프로그래밍입문", "UML기초" };
	%>
	<table border>
		<tr>
			<th>번호</th>
			<th>도서명</th>
		</tr>
		<%
		for (int idx = 0; idx < bookTitle.length; idx++) {
		%>
		<tr>
			<td><%=(idx + 1)%></td>
			<td><%=bookTitle[idx]%></td>
		</tr>
		<%
		}
		%>
	</table>
	<%
	
	String product01[] = { "사과", "바나나", "토마토" };
	int price[] = { 3000, 2000, 5000 };
	int pCnt[] = { 3, 4, 2 };
	%>
	<table id="product" border>
		<tr>
			<th>물건명</th>
			<th>가격</th>
			<th>갯수</th>
		</tr>
		<%
		for (int idx = 0; idx < product01.length; idx++) {
		%>
		<tr>
			<td><%=product01[idx]%></td>
			<td><%=price[idx]%></td>
			<td><%=pCnt[idx]%></td>
		</tr>
		<%
		}
		%>
	</table>
<%--
# 배열에서 객체 list로 변경..
	1) 배열데이터
		String []names = {"오렌지","수박","키위"};
		int []prices = {3000, 12000, 4000};
		int []cnts = {5, 3, 2};
		index로 단위데이터를 가져온다.
			names[0], prices[0]. cnts[0]
	2) 객체list 데이터
		ArrayList<product> plist = new ArrayList<product>();
		plist.add(new Product("오렌지", 3000, 5) );
		plist.add(new Product("수박", 12000, 3) );
		plist.add(new Product("키위", 4000, 2) );
			plist.get(0) ==> Product("오렌지",3000,5);
			plist.get(1) ==> Product("수박", 12000, 3);
			plist.get(2) ==> Product("키위", 4000, 2);
		
		<%for(Product p : plist){%>
			<tr>
				<td><%=p.getName()%></td>
				<td><%=p.getPrice()%></td>
				<td><%=p.getCnt()%></td></tr>
	
		class Product{
			private String name;
			private int price;
			private int cnt;
			// 생성자로 데이터 할당
			Product(String name, int price, int cnt){
				this.name = name;
				this.price = price;
				this.cnt = cnt;
			}
			// 기능 메서드 get/set을 통해 메서드를 통해서만 데이터 접근 가능
			public void setName(String name){
				this.name = name;
			}
			public void getName(String name){
				return name;
			}
 --%>
</body>
</html>