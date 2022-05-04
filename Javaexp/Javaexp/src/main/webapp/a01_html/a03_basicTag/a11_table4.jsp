<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="javaexp.a04_vo.Product"
	import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	/*
	# VO객체를 활용하여 ArrayList에 담고, 해당 내용을 반복문을 통해서 출력 처리하기
	1. VO객체 만들기 물건명, 가격, 갯수
	2. jsp : import하기.. VO 및 ArrayList
	3. ArrayList<Product> 선언 및 객체 담기..
		list.add(new product("오렌지",3000,5))
	4. for(int idx=0;idx<list.size();idx++){
		Product prod = list.get(idx);
		prod.getName()
		prod.getPrice()
		prod.getCnt()
		}
	*/
	// 사용하게 될 ArrayList 선언.. ArrayList<객체>
	ArrayList<Product> plist = new ArrayList<Product>();
	plist.add(new Product("오렌지", 3000, 5)); //객체가 하나씩 추가 처리..
	plist.add(new Product("사과", 2000, 3)); //객체가 하나씩 추가 처리..
	plist.add(new Product("딸기", 12000, 2)); //객체가 하나씩 추가 처리..
	// plist.get(0)   plist.get(1)   pist.get(2)
	%>
	<table width="50%" border>
		<tr>
			<th>번호</th>
			<th>물건명</th>
			<th>가격</th>
			<th>갯수</th>
		</tr>
		<%
		for (int idx = 0; idx < plist.size(); idx++) {
			Product prod = plist.get(idx);
		%>
		<tr>
			<td><%=(idx + 1)%></td>
			<td><%=prod.getProduct()%></td>
			<td><%=prod.getPrice()%></td>
			<td><%=prod.getCnt()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>