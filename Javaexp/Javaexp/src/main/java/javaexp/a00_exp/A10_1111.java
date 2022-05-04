package javaexp.a00_exp;

public class A10_1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[3];
		// 1번쨰 방법
		// 최대값/최소값 지정하고, 그 외 중간값을 처리하는 방법
		int max = 1;
		int min = 100;
		for(int idx=0;idx<3;idx++) {
			nums[idx] = (int)(Math.random()*100+1);
			if(max<nums[idx]) {
				max = nums[idx];
			}
			if(min>nums[idx]) {
				min = nums[idx];
			}
			System.out.println(nums[idx]+",");
		}
		var mid = 0; // 중간값 : 한계 - 최대/최소값이 중간값이 동일한 때, 중간값을 0으로 처리
		for(int idx=0;idx<3;idx++) {
			if (min<nums[idx]&&max>nums[idx]) {
				mid = nums[idx];
			}
		}
		
		System.out.println("최대: "+max);
		System.out.println("중간: "+mid);
		System.out.println("최소: "+min);
		// 특정 배열에 할당
		// [25,4,27]
		// 
		
		
		
		/*
		 1. table 태그의 속성
			border : 굵기 지정.
			align : 포함하고 있는 요소 객체 대비 정렬 위치 지정
			width : 넓이 지정 %, px/pt 단위로 지정할 수 있다, %는 전체 화면대비 크기를 %로 지정한다
			height : 높이 지정
		1) 최상위 : table
			일반표를 삽입하기 위한 태그이다
		2) 차상위 : 
			thead : 표의 머리를 생성하는 부분이다.
			tbody : 표의 본문을 생성하는 부분이다.
			tfoot : 표의 꼬리를 생성하는 부분이다.
		3) 행단위 태그
			tr : table row로 행단위로 row를 생성한다.
		4) 열단위 태그
			th : table header로 상단에 테이블의 head로 타이틀 컬럼을 처리할 때 사용된다
			td : table data로 테이블의 실제 데이터를 처리할 때, 사용된다.
		
		2. 
		<h2>1X2</h2>
		<table align="center" border="1" width="50%" height="250px">
		 	<tr><td>1</td></tr>
		 	<tr><td>2</td></tr>
		</table>
		 
		<h2>2x3</h2>
		<table align="center" border="1" width="50%" height="250px">
		 	<tr><td>1</td><td>2</td></tr>
		 	<tr><td>3</td><td>4</td></tr>
		 	<tr><td>5</td><td>6</td></tr>
		</table>
		<h2>2x4</h2>
		<table align="center" border="1" width="50%" height="250px">
		 	<tr><td colspan="2">1</td></tr>
		 	<tr><td>2</td><td>3</td></tr>
		 	<tr><td>4</td><td>5</td></tr>
		 	<tr><td>6</td><td>7</td></tr>
		</table>
		<h2>2x5</h2>
		<table align="center" border="1" width="50%" height="250px">
		 	<tr><td colspan="2">1</td></tr>
		 	<tr><td>2</td><td>3</td></tr>
		 	<tr><td>4</td><td>5</td></tr>
		 	<tr><td>6</td><td rowspan="2">6</td></tr>
		 	<tr><td>7</td></tr>
		</table>
		<h2>4x3</h2>
		<table align="center" border="1" width="50%" height="250px">
		 	<tr><td colspan="4">1</td></tr>
		 	<tr><td rowspan="2">2</td><td>3</td><td>4</td><td>5</td></tr>
		 	<tr><td>6</td><td>7</td><td>8</td></tr>
		</table>
		
		3. jsp 처리과정
			1. [서버] 서버단에서 jsp를 작성시, 작성 후, 저장하는 순간
				@@@.jsp ==> @@@.java ==> @@@.class
			2. [서버]tomcat을 실행하는 순간 @@@.class가 컨테이너 메모리에 로딩되어 객체가 생성이 된다
				2번,3번 항목은 프레임워크를 쓸때와 쓰지 않을 떄와 차이가 있다.
				호출시, 실제 객체가 생성되는 경우가 많다.
			3. [클라이언트(브라우저) ==> 서버 요청] 사용자가 url주소로 해당 jsp를 호출하는 순간
				@@@.class의 내용이 실행되어, java+html 코드의 최종 결과 html을 만들어서
				스트림방식(Stream이라는 자바의 객체)으로 html코드를 client에 전달한다.
				cf) Stream 자바 또는 어플리케이션의 api객체로 network/파일로 데이터를 전송해주는 역할을 하는 객체
			4. [클라이언트(브라우저)]
				받은 html을 문자(태그와 문자, javascript 등)을 받아 태그와 css는 해당 내용을 랜더링하고,
				javascript는 브라우저 내의 컴파일러에 의해 해석해서 메모리에 로딩 시켜 실행을 한다.
				cf) node 계열 프로그램에서는 javascript를 서버에서 컴파일 시켜 보낸다
			5. [클라이언트(브라우저)]
				원하는 웹화면과 javascript 실행 결과를 볼 수 있다
		jsp ==> @@@.java ==> @@@.class ==> 결과 html 파일 만들기 ==>
		 client에게 html 파일 전달 ==> 브라우저를 통해서 html 받기	
		 
		4. 
		<%@ page language="java" contentType="text/html; charset=UTF-8"
    	pageEncoding="UTF-8"
    	import="javaexp.a04_vo.Seoson"
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
			Seoson s1 = new Seoson("여름", "비", "덥다");
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
						<td><%=s1.getSeoson()%></td>
						<td><%=s1.getWeather()%></td>
						<td><%=s1.getProperty()%></td>
					</tr>
				</tbody>
			</table>
		</body>
		</html>
		
		6. 이미지 태그 속성
		1) src : 이미지가 있는 경로를 절대경로, 상대경로로 지정하여 해당 이미지를 불러올 수 
			있다.
		2) alt : src에 해당 이미지가 없을 때, 대체되어 나오는 문자열을 지정할 수 있다.
		3) width : 이미지의 너비를 지정
		4) height : 이미지의 높이를 지정 
		
		<img src="짱재3.jpeg" width="100px" heiht="100px">
		
		7. 
		<table align="center" width="70%" border="1">
			<col width="40%">
			<col width="30%">
			<col width="30%">
			<tr>
				<td><img src="/javaexp/z01_img/짱재3.jpeg" width="100px" height="100px"></td>
				<td>아름다운 이미지 1</td>
				<td>판매가격:</td>
			</tr>
			<tr>
				<td><img src="짱재2.jpeg" width="100px" height="100px"></td>
				<td>아름다운 이미지 2</td>
				<td>판매가격:</td>
			</tr>
			<tr>
				<td><img src="" alt="없는 이미지" width="100px" height="100px"></td>
				<td>아름다운 이미지 13</td>
				<td>판매가격:</td>
			</tr>
		</table>
		
		8.
		<%
		int ranList[] = new int[3];
		for(int idx=0;idx<3;idx++){
			ranList[idx] = (int)(Math.random()*10+1);
		}
		
		int low[] = new int[1];
		int middle[] = new int[1];
		int high[] = new int[1];
		for(int idx=0;idx<ranList.length;idx++){
			for (int idx2=idx+1;idx2<ranList.length;idx2++){
				if (ranList[idx]>ranList[idx2]){
					int max = ranList[idx];
					ranList[idx] = ranList[idx2];
					ranList[idx2] = max;
				}
			}
		}
		low[0] = ranList[0];
		middle[0] = ranList[1];
		high[0] = ranList[2];
		%>
	
		<h2><%=low[0]%></h2>
		<h2><%=middle[0]%></h2>
		<h2><%=high[0]%></h2>
		</body>
		</html>
		 */
	}

}
