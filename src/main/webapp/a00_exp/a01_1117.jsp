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
객체.속성1 = 속성값; // 속성값 변경

2) 배열
var 배열명 = [데이터1, 데이터2, 데이터3]
	배열은 index를 기준으로 데이터를 접근 한다
	배열명[index 번호]

2. 
<script>
var movie = {mTitle:"괴물", time:"14:30~17:00", price:12000}
for(var prop in movie){
	console.log(prop+": "+movie[prop])
}
</script>

3.
<script>
	var trainTicket = {startpoint:"서울", arrival:"대구",
					buy:function(cnt, price){
						// var price = 20000;
						console.log(this.startpoint+"에서 "+this.arrival+"로 가는 기차 티켓 "+ cnt+"장 총"+
								(price*cnt)+"원 입니다");
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
	var ranking = [1, "kt"];
	var addHtml = "";
	addHtml += "<tr>"
	for(var idx in ranking){
		addHtml += "<th>"+ranking[idx]+"</th>"
	}
	addHtml += "</tr>"
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