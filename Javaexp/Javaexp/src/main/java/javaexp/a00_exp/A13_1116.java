package javaexp.a00_exp;

public class A13_1116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		
		/*
		1. 
		var str1 = "문자열";
		var str2 = '문자열';
		var str3 = `문자열`;
		var str4 = ` 좋은 날!!
			${str2}
		`; // 줄바꿈을 그대로 적용하며, ${변수명} 형태의 데이터로 처리된다
		ex)
		function call(msg, num){
			alert(msg);
			alert(num+5);
		}
		<input type="button" onclick="call('안녕', 5)"/> (o)
		<input type="button" onclick="call("안녕", 5)"/> (x)
		<input type="button" onclick="call(\"안녕\", 5)"/> (o)
		함수 호출 시 매개값의 유형에 따라서 문자열은 홑따움표로 숫자는 숫자자체로만으로 명시하여야 한다
		
		
		2. 
		<table align="center" width="50%" border>
			<col width="33%">
			<col width="33%">
			<col width="33%">
			<tr><th>팀명</th><th>이름</th><th>기록</th></tr>
			<tr><td></td><td></td><td></td></tr>
			<tr><td></td><td></td><td></td></tr>
			<tr><td></td><td></td><td></td></tr>
		</table>
		<script type="text/javascript">
			var player1 = {team:"kt" , name:"강백호", win:"2승"};
			var player2 = {team:"두산" , name:"페르난데스", win:"2승"};
			var player3 = {team:"두산" , name:"강승호", win:"2승"};
			var baseball = document.querySelectorAll("td");
			baseball[0].innerText = player1.team; 
			baseball[1].innerText = player1.name;
			baseball[2].innerText = player1.win;
			baseball[3].innerText = player2.team; 
			baseball[4].innerText = player2.name;
			baseball[5].innerText = player2.win;
			baseball[6].innerText = player3.team; 
			baseball[7].innerText = player3.name;
			baseball[8].innerText = player3.win; 
		</script>
		
		3.
			1) 익명함수 : 선언하기 전에 호출 하면 에러 발생 
				var a = function(){
				
				}
				a = 변수;
				a = function(){}
				같은 이름으로 여러가지 다른 기능의 함수를 재할당하거나 type까지 변경할 때, 활용할 수 있다
			2) 선언적함수 : 선언 전에 호출해도 작동
				b();
				function b(){
				
				}
				선언적함수는 선언되기 전에도 호출이 가능하다
		4. 
			function tot(price, cnt){
				return price*cnt;
			}
			alert("총 금액: "+tot(3000, 4));
		
		5. 
			<script type="text/javascript>
				function color(obj){
					// onclick="color(this)"로 선언했으므로 클릭한 모든 정보를 객체로 전달된다.
					// obj에서는 해당 객체를 메모리로 오기에
					console.log("클릭한 h3의 색상: "+obj.innerText); // 클릭한 객체가 가지고 있는 문자열 정보를 가져올 수 있다 
					obj.style.background = obj.innerText; // 그 문자열 색상 정보를 배경 색상으로 할당하여 처리한다
					obj.align = "center";
				}	
			</script>
				<h3 onclick="color(this)">red</h3>
				<h3 onclick="color(this)">orange</h3>
				<h3 onclick="color(this)">yellow</h3>
				<h3 onclick="color(this)">green</h3>
				<h3 onclick="color(this)">blue</h3>
				<h3 onclick="color(this)">navy</h3>
				<h3 onclick="color(this)">purple</h3>
			</body>
		
		6. 
		+ 연산자 외 다른 연산자는 기본적으로 자동형변환이 되고
		+ 연산자는 형변환 함수(parseInt(), parseDouble(),Number() 등)으로 연결처리 하여야 한다. 
		
		7. 
		JSON(JavaScript Object Notation)은 Javascript 객체 문법으로 구조화된 데이터를 
			표현하기 위한 문자 기반의 표준 포맷이다. 일반적으로 웹어플리케이션에서 데이터를 전송할 때 사용한다 
		<table align="center" width="50%" border>
			<tr><th>차이름</th><td></td></tr>
			<tr><th>제조사</th><td></td></tr>
			<tr><th>가격</th><td></td></tr>
		</table>
		<script type="text/javascript">
			var carObj = {cname:"타이칸", company:"포르쉐", price:"3억"};
			var tableArry = document.querySelectorAll("td");
			tableArry[0].innerText = carObj.cname;
			tableArry[1].innerText = carObj.company;
			tableArry[2].innerText = carObj.price;
		</script>	
		
		8. 
		System.out.println("# 5의 배수");
		for(int i=1;i<=100;i++) {
			if (i%5==0) {
				System.out.print(i+", ");
			}
		}
		
		System.out.println("\n# 1~100의 합");
		int sum1 = 0;
		for(int j=1;j<=100;j++) {
			sum1 += j;
		}
		System.out.println(sum1);
		
		System.out.println("# 2의 배수의 합");
		int sum2 = 0;
		for(int x=1;x<=100;x++) {
			if (x%2==0) {
				sum2 += x;
			}
		}
		System.out.println(sum2);
		
		 */
	}

}
