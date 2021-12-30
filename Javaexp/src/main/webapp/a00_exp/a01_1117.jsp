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
1.
1) 객체 
var 객체명 = {속성:속성값, 속성2:속성값, ..}
객체.속성1 = 속성값; // 속성값 추가 및 변경
객체명["속성"] = 속성값; // 속성값 추가 

2) 배열
var 배열명 = [데이터1, 데이터2, 데이터3]
배열명[3] = 4000; // 배열의 데이터를 추가하여 할당한다
	배열은 index를 기준으로 데이터를 접근 한다
	배열명[index 번호]

2. 
<script>
var movie = {mTitle:"괴물", time:"14:30~17:00", price:12000}
// prop나 idx는 사용자가 임의로 사용해도 되나 객체인지 배열인지
// 구분할 수 있는 변수를 사용하는 것이 가독성을 높일 수 있다
for(var prop in movie){
	console.log(prop+": "+movie[prop])
}
</script>

3.
<script>
	// cf) car arry = [300, "하이맨", function(){}, {name:홍길동}];
	// 	js는 동적 배열을 지원하고 그 개념 중, 데이터 유형도 여러유형이 할당 할 수 있다 
	var trainTicket = {startpoint:"서울", arrival:"대구", price: 20000,
					choice:funtion(startpoint,arrival,price){
						this.startpoint = startpoint;
						this.arrival = arrival;
						this.price = price;
					}, // 필드로 출발역과 도착역, 금액을 변경해서 처리할 때
					buy:function(cnt, price){
						console.log(this.startpoint+"에서 "+this.arrival+"로 가는 기차 티켓 "+ cnt+"장 총"+
								(this.price*cnt)+"원 입니다");
								// + 연산일 때는 앞 문자열에 의해 문자열로 자동형변환이
								// 일어나기에 ()괄호를 이용해서 형변환을 피하고 연산부터 처리되게 한다.
					}			
	};
	
	// trainTicket.buy(5);
	trainTicket.buy(5, 8000);
</script>

4.
 <table align="center" id="tab01" width="30%" border="1">
 	<tr><th>순위</th><th>팀명</th></tr>
 </table>
 
<script>
	var ranking = ["kt", "삼성","LG","두산","키움"];
	var addHtml = "";
	for(var idx in ranking){
		addHtml += "<tr><th>"+(Number(idx)+1)+"</th><td>+ranking[idx]+</td></tr>"
	}
	var table = document.querySelector("#tab01");
	table.innerHTML += addHtml;
</script>

5. 
<h1 align="center">오늘</h1>
<h2 align="center"></h2>

<script type="text/javascript">
var date = new Date();
var h2Arry = document.querySelectorAll("h2");
h2Arry[0].innerText = date.getFullYear()+"년 "+ (date.getMonth()+1)+"월 "+date.getDate()+"일";
</script>

6.
console.log("#구구단");
for(var i=1 ; i<=9; i++){
		console.log(i+"단!");
		for(var j=1;j<=9;j++){
			console.log(i+" X "+j+" = "+(i*j));
		}
}; 
 --%>




<script type="text/javascript">
	
</script>
</html>