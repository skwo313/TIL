package javaexp.a00_exp;

import java.util.ArrayList;

public class A09_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ranList = new ArrayList<Integer>();
		for(int cnt = 1; cnt<=10 ; cnt++) {
			int ran = (int)(Math.random()*100+1);
			ranList.add(ran);
			System.out.println(ran+"\t");
		}
		int max = 0;	// 나올 수 있는 경우의 최소값 설정(default)
		int min = 100; 	// 나올 수 있는 경우의 최대값 설정(default)
		for(int idx=0;idx<ranList.size();idx++) {
			int data = ranList.get(idx);
			if(data > max) {
				max = data;
			}
			if(data < min) {
				min = data;
			}
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
	
		/*
		1. 
		p 태그 : paragraph, 즉 문단의 약자로, 하나의 문단을 만들 때 쓴다
		hr 태그 : 수평선을 그려주는 태그, 의미적인 요소로 규정하여, 주제를 분리하기 위한 용도로 사용
		br 태그 : 줄 바꿈을 하려면 직접 줄 바꿈을 한다는 명령을 적어 주어야 하며,
				HTML에서는 <br>를 통하여 줄바꿈을 한다.
		a 태그 : 하이퍼링크를 걸어주는 태그, href: 클릭시 이동 할 링크 target: 링크를 여는 방법
		
		2. 
		<head>
			<style>
			h1,h2 {
				text-align: center;
			}
			</style>
		</head>
		<body>
			<h1>프로그래밍</h1>
			<hr>
			<h2>Java</h2>
			<P>
			썬 마이크로시스템즈에서 1995년에 개발한 객체 지향 프로그래밍 언어. 창시자는 제임스 고슬링이다. 2010년에 오라클이 썬 마이크로시스템즈를 인수하면서 Java의 저작권을 소유하였다. <br>
			현재는 OpenJDK는 GPL2이나 오라클이 배포하는 Oracle JDK는 상업라이선스로 2019년 1월부터 유료화정책을 강화하고 있다. Java EE는 이클립스 재단의 소유이다.
			 <br>Java 언어는 J2SE 1.4부터는 Java Community Process (JCP)에서 개발을 주도하고 있다.
			</p>
			<h2>Jsp</h2>
			<p>
			자바 서버 페이지(영어: JavaServer Pages[1], JSP)는 HTML내에 자바 코드를 삽입하여 웹 서버에서 동적으로 웹 페이지를 생성하여 웹 브라우저에 돌려주는 서버 사이드 스크립트 언어이다. Java EE 스펙 중 일부로 웹 애플리케이션 서버에서 동작한다.
			<br>자바 서버 페이지는 실행시에는 자바 서블릿으로 변환된 후 실행되므로 서블릿과 거의 유사하다고 볼 수 있다. 하지만, 서블릿과는 달리 HTML 표준에 따라 작성되므로 웹 디자인하기에 편리하다. 1999년 썬 마이크로시스템즈에 의해 배포되었으며 
			이와 비슷한 구조로 PHP, ASP, ASP.NET 등이 있다.
			</p>
			<h2>Spring</h2>
			<p>
			스프링 프레임워크(영어: Spring Framework)는 자바 플랫폼을 위한 오픈 소스 애플리케이션 프레임워크로서 간단히 스프링(Spring)이라고도 한다.
			동적인 웹 사이트를 개발하기 위한 여러 가지 서비스를 제공하고 있다. 대한민국 공공기관의 웹 서비스 개발 시 사용을 권장하고 있는 전자정부 표준프레임워크의 기반 기술로서 쓰이고 있다.
			</p>
		</body>
		
		3. 
		a 태그는 하이퍼링크를 걸어주는 태그이다
		속성) href: 클릭시 이동 할 링크
			 target: 링크를 여는 방법
			 
		4. 
		하이퍼링크란 이동 또는 열고자 하는 웹 사이트의 주소(URL)를 
		주소창에 일일이 직접 입력하지 않고도 웹 문서 안에서 특정 부분을 클릭하면 
		다른 사이트로 넘어가거나 현재 페이지에서 그 사이트 페이지가 열리도록 해 주는 것을 말합니다.
		상대적주소: 현재 파일에서 불러올 파일의 상대적인 경로 
				../(상위폴더), ../../(상위에 상위 폴더), ./(같은폴더에 있는 폴더 내 파일)
		절대적주소: 서버의 특정 위치를 경로의 기준으로 설정하는 것을 말한다.
				웹 서버의 경우 root 경로 즉, 프로젝트 기준으로 javaexp\src\main\webapp
				를 말하는데, 이는 서버가 기동되었을 때, http://localhost:7080/javaexp/
				의 경로를 말한다.
						http://localhost:7080는 생략이 가능하다
				ex)
					/javaexp/ : 서버의 절대경로 설정 - workspace\javaexp\src\main\webapp
					webapp경로의 하위 페이지 호출..
						/a01_html/a03_basicTag/a05_poem.html
		
		5. 
		javaexp/src/main/webapp/a01_html/a02_htmlStart
		=> /javaexp/a01_html/a02_htmlStart
		<a href="/javaexp/a01_html/z01_test/a01_show.html"></a>
		<a href="/javaexp/a02_htmlStart/a01_start.html"></a>
		<a href="/javaexp/index.html"></a>
		
		
		6.
		<a href="a09_relativeExp.html">같은 폴더 파일 경로(a09_relativeExp.html)</a>
	 	<a href="../start.html">상위 폴더 하위 파일 경로(start.html)</a>
	 	<a href="../a02_htmlStart/a01_start.html">상위 폴더의하위 파일 경로(a01_start.html)</a>
	 	<a href="../../index.html">상위 폴더 상위 폴더 하위 파일(index.html)</a>
	 	<a href="./a01_com/a01_com.html">같은 폴더 하위 파일 경로(a01_com.html)</a>
		
		7. 
		<html>
		<head><head>
		<body>
			<h2>front end 과목</h2>
			<ul>
				<li>html</li>
				<li>css</li>
				<li>javascript</li>
			</ul>
			<h2>back end 과목</h2>
			<ul>
				<li>java</li>
				<li>jsp</li>
				<li>Spring</li>
				<li>DB</li>
			</ul>
		</body>
		</html>
		
		8.
		int[] num01 = new int[10];
		for(int idx=0;idx<num01.length;idx++) {
			num01[idx] = (int)(Math.random()*100+1);
		}
		int max =  num01[0];
		for (int i=1;i<num01.length;i++) {
			if (num01[i] > max) {
				max = num01[i];
			}
		}
		System.out.println("이 배열에서 가장 큰 수: "+max);
		
		 */
	}

}
