package javaexp.a00_exp;

public class A01_1029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1)
		String name = "홍길동";
		int age = 25;
		String hobby = "soccer";
		System.out.println("이름: "+name+" 나이: "+age+" 취미: "+hobby);
		// 2-1) 
		int breadCnt = 5;
		int bearCnt = 3;
		int tot = breadCnt*bearCnt;
		System.out.println("총갯수: "+tot);
		// 2-2)
		int breadTot = 20;
		int bearCnt1 = 3;
		int eatCnt = breadTot*bearCnt1;
		int remain = breadTot%bearCnt1;
		System.out.println("먹은 갯수: "+eatCnt+","+"나머지: "+remain);
		// 2-3) 
		int tot2 = 100000;
		int trainPay = 3000;
		int trainTotPay = trainPay*2;
		int foodPay = 7000;
		int snackPay = 3000;
		int payTot = trainTotPay+foodPay+snackPay;
		int remainTot = tot2-payTot;
		System.out.println("총잔액 나머지: "+ remainTot);
		// 3)
		int computerPrice = 900000;
		if(computerPrice>=1000000) {
			System.out.println("고가입니다");
		}else {
			System.out.println("저가입니다");
		}
		// 4)
		for(int cnt=15;cnt<=45;cnt++){
			System.out.print("카운트: "+cnt+"\t");
		}
		for(int cnt=10;cnt>=0;cnt--) {
			System.out.print("카운트: "+cnt+"\t");
		}
		// 5)
		Product p1 = new Product("apple"); // Product 객체는 heap영역에 저장,
		System.out.println("p1객체의 heap영역 주소: " + p1);
										// stack영역에서는 객체의 주소만 저장
	}

}
class Product {
	String name; // field 영역
	Product(String name){  // 생성자 영역
		this.name = name;
	}
}
