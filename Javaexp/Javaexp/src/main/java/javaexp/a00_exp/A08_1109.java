package javaexp.a00_exp;

public class A08_1109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomA = (int)(Math.random()*10);
		int randomB = (int)(Math.random()*10);
		int randomC = (int)(Math.random()*10);
		System.out.println("1번 : " + randomA);
		System.out.println("2번 : " + randomB);
		System.out.println("3번 : " + randomC);
		int max = randomA;	// 최고값을 기본데이터로 첫번째 값을 설정
		if(max < randomB){
			max = randomB;
		}
		if(max < randomC){
			max = randomC; 
		}
		System.out.println("셋 중에 최고값: "+ max);
		// 알고리즘 : 프로그램이나 문제가 발생할 때, 효과적인 해결과제를 순차적으로 나열하고
		//		해당내용을 처리하는 것을 말하는데, 프로그래밍에서 길러야할 중요한 내용이다
		//		프로그램에서는 수행되는 속도와 메모리를 계산하여 최적의 방법을 마련하는 것을 
		//		말하고 있다.
		
		/*
		1. 태그의 구성요소: 요소(Element), 태그(Tag), 속성(Attribute), 변수(Arguments)
						<h1></h1> // <img src="~~">
		
		2. 주석처리방법: <!-- 내용 --> 
			css: /* */ 
			// script :  /* */ 
			// jsp: <%-- --%>
		
		/*	
		3. 
			<!DOCTYPE html>	// DOCTYPE html 이란 웹문서가 어떤 버전의 HTML 언어로 작성되었는지 결정하는 기능
			<html>	// 모든 HTML 페이지의 루트(기본) 요소
			<head>	// head 태그에 스타일 시트와 자바스크립트를 제공
			</head>
			<body>	// 사용자에게 실제로 보이는 부분
			</body>
			</html>
		
		4.	
		<style> 
 			태그,.클래스,#id {
 			
 			}
 		</style>
 		
 		5. 
 		외부 스타일 선언
 		<head>
 			<link rel="stylesheet" href="파일명 등"> 
 		</head>
 		
 		a01_styleOuter.html
 		<!DOCTYPE html>
		<html>
    		<head>
        		<link rel="stylesheet" href="z01_style.css">
        		<title>CSS3</title>
    		</head>
    		<body>
        		<h2>안녕하세요!</h2>
    		</body>
		</html>
		
		z01_style.css
		h2 {
    		color: brown;
    		background-color: beige;
		}
		
		6. 
		<!DOCTYPE html>
		<html>
		<head>
        	<script>
                alert("안녕하세요");
        	</script>
    	</head>
		</html>
		
		7. 
		a02_scriptOuter.html
		<!DOCTYPE html>
		<html>
		    <head>
		        <meta charset = "UTF-8">
		        <script src="z02_script.js"></script>
		    </head>
		</html>
		
		z02_script.js
		alert("안녕하세요");
 	
		
		8. 
		웹서버: css, html, javascript, 이미지 등 frontend 프로그램을 처리할 수 있는
			서버를 말한다. network을 통하여 웹 서비스를 지원할 수 있다
		웹어플리케이션서버 : frontend단 프로그램에 덧붙여 java를 컴파일하고, 컴파일된 자바 
			코드와 위 내용을 혼합하여 웹 서비스를 지원할 수 있다
			주로 db처리나 java를 통한 backend단 프로그램을 처리해야 하는 경우에 활용된다
		웹서버에 DB나 java와 같은 프로그램을 컴파일 시켜서 처리해주는 것을
		웹어플리케이션서버(WAS)라고 한다
		웹 서버는 정적 데이터를 처리하고, 웹어플리케이션 서버는 동적 데이터를 처리한다
		cf) Vue

		11. 
		
		
		
		if(randomA>randomB && randomA>randomC) {
			System.out.println("A가 가장 큰 수");
		} else if(randomA<randomB && randomA>randomC) {
			System.out.println("B가 가장 큰 수");
		} else {
			System.out.println("C가 가장 큰 수");
		}
		
		
		
		
		 */
	}

}
