package javaexp.a00_exp;

import java.util.ArrayList;
import java.util.Scanner;

public class A11_1112 {
	// 랜덤으로 구구단 만든 후 scanner 값으로 받고 맞으면 정답 틀리면 오답 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList cnt = new ArrayList();
		for(int i=1;i<=10;i++) {
			int num1 = (int)(Math.random()*9+1);
			int num2 = (int)(Math.random()*9+1);
			int gugu = num1*num2;
			Scanner sc = new Scanner(System.in);
			System.out.print(i+"번 문제: "+num1+" X "+num2+" = ");
			int answer = sc.nextInt();
			if(gugu == answer) {
				cnt.add(1);
			}
		}
		int score = cnt.size()*10;
		System.out.println(score+"점 입니다!");
		
		
		
		
		
		
		/*
		1. 
		action : 전송 위치 : 서버에 전송할 자원의 위치, 일반적으로 
				jsp파일이나, 서버단에서 application으로 처리하는 프로그램 
				호출
		method : (default 값 = get)
				get : 주소에 데이터를 직접 입력해 전달
				post : 별도의 방법을 사용해 데이터를 해당 주소로 전달
		name : 전송될 데이터의 이름 
		value : input 박스에 표시될 값
		
		"a08_FormExp.html"
		<form action="a08_rev.jsp">
			검색내용:<input type="text" name="research"><br>
			<input type="submit" value="검색">
		</form>
		"a08_rev.jsp"
		<h2>검색내용${param.research}</h2>
		
		2. 
		text: 기본 text형식 입력, 줄바꿈이 없는 텍스트
		password: 패스워드 형식 입력
		radio : 라디오버튼, 한 name에 여러개의 라디오버튼이 생성된 경우
				그 중 한 개만 선택 가능하다
				서버에 전달되는 값도 단일 데이터
		file: file 업로드 형식
		checkbox: checkbox 형식 (다중선택)
				서버에 전달 되는 값은 check된 값, 동일한 이름으로 요청key를 넘긴다
				ck=사과&ck=바나나&ck=딸기
		radio: radio 형식 (같은이름(name)으로 단일선택)
		
		<textarea name="adrr" cols="5" rows="10">   // 열과행의 크기에 대한 옵션으로 같은 비율이 아니므로 화면을 확인하면서 처리필요
		textarea : 줄바꿈이 있는 긴 문장을 입력할 수 있다
		</textarea>
		
		4. 
		 // javascript시작 경고창으로 출력
         alert("javascript시작");
         // f12 콘솔창에서 출력
         console.log("javascript시작!!")
         // 화면에 javascript 명령어로 html코드를 처리	
   		 document.write("<h2>화면에 출력</h2>")
   		 ex)
   		 <head>
   		 <script>
	      	alert("안녕하세요");
			console.log("안녕하세요"); 
      	 </script>
   		 </head>
   		 <body>
   
   		 </body>
 		 <script type="text/javascript">
 			 document.write("<h2>안녕하세요</h2>");
 		 </script>
 		 
 		 5. 
 		 <script>
 		 	function call(){
 		 		alert("호출되었습니다.");
 		 	}
 		 </script>
 		 
 		 <h3 onclick="call()">안녕하세요</h3>
		
		6. 
		css:
		head 부분에
		<link rel="stylesheet" href="style.css">
		
		javascript:
		head 부분에
		<script src="script.js"></script>
		
		7. 
		절대경로: 서버의 특정 위치를 경로의 기준으로 설정하는 것을 말한다.
				웹 서버의 경우 root 경로 즉, 프로젝트 기준으로 javaexp\src\main\webapp
				를 말하는데, 이는 서버가 기동되었을 때, http://localhost:7080/javaexp/
				의 경로를 말한다.
						http://localhost:7080는 생략이 가능하다
				ex)
					/javaexp/ : 서버의 절대경로 설정 - workspace\javaexp\src\main\webapp
					webapp경로의 하위 페이지 호출..
						/a01_html/a03_basicTag/a05_poem.html
		상대경로: 현재 파일에서 불러올 파일의 상대적인 경로 
				../(상위폴더), ../../(상위에 상위 폴더), ./(같은폴더에 있는 폴더 내 파일)
		
		8. 
		<%
		ComputerPart c1 = new ComputerPart("i7-7200", 16, 32);
	
		%>
		<h2 align="center">컴퓨터 부품목록</h2>
		<table align="center" width="50%" border>	
			<tr><th>Cpu</th><td><%=c1.getCpu() %></td></tr>
			<tr><th>Ram</th><td><%=c1.getRam() %></td></tr>
			<tr><th>Hdd</th><td><%=c1.getHdd() %></td></tr>
		</table>
		
		9. 
		int num1 = (int)(Math.random()*9+1);
		int num2 = (int)(Math.random()*9+1);
		int gugu = num1*num2;
		Scanner sc = new Scanner(System.in);
		System.out.print(num1+" X "+num2+" = ");
		int answer = sc.nextInt();
		if(gugu == answer) {
			System.out.println("정답입니다!");
		}else {
			System.out.println("오답입니다!");
		}
		 */
	}

}
