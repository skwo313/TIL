package javaexp.a00_exp;



public class A05_1104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
		// 1. 메소드는 객체간의 데이터 전달 수단으로 외부로부터 매개값을 받을 수 있다.
		//	생성자는 객체를 생성할 때 필드를 초기화하고 메소드와 달리 반환값이 없고 생성자의 이름은 
		//	반드시 클래스와 같아야 한다
		// 2.
			/*
			class classRoom{
				String pencil;
				String note;
				classRoom(String pencil, String note){
					this.pencil = pencil;
					this.note = note;
				}
				String good() {
					return "잘 써진다";
				}
			}
			
			main()
			classRoom c1 = new classRoom("몽땅연필", "파란노트");
			String sentence = c1.good();
			System.out.print(c1.note+"에 "+c1.pencil+"로 적으면 "+sentence);
			*/
		// 3.
			/*
			class ElProduct{
				String elName;
				int elPrice;
				ElProduct(String elName, int elPrice){
					this.elName = elName;
					this.elPrice = elPrice;
				}
				int buy1() {
					return elPrice;
				}
				int buy2(int cnt){
					System.out.print(cnt+"개 구매했을 시: ");
					return elPrice*cnt;
				}
				int buy3(int cnt, double dis) {
					int totPrice = elPrice*cnt;
					System.out.println("# 현재 전자제품 정보 #");
					System.out.println("물건명: "+elName);
					System.out.println("갯수: "+cnt+"개");
					System.out.println("총 금액: "+totPrice+"원");
					System.out.println("할인율: "+(int)(dis*100)+"%");
					int disPrice = (int)(totPrice-totPrice*dis);	
					return disPrice;
				}
			}
			
			main()
			ElProduct e1 = new ElProduct("핸드폰", 100000);
			int onePay = e1.buy1();
			System.out.println("1개 구매했을 시: "+onePay);
			int pay = e1.buy2(3);
			System.out.println(pay);
			int disPay = e1.buy3(5, 0.1);
			System.out.println("할인적용금액: "+ disPay);
			*/
			
		// 4. 
		/*
		 class Person {
		 	Person(){}
		 	Person(String name){}
		 	Person(int name){}
		 	Person(String name, int name){}  // 생성자는 오버로딩규칙에 의해서 하나의 클래스에서 여러개의 생성자를 선언할 수 있따
		 									// 생성자도 메서드도 이름은 같지만, 매개변수가 다르면 다른 생성자,메서드로 식별할 수 있기 떄문에 선언이 가능하다
		 }
		 */
		
		// 5
	/*
		class Couple {
			String name;
			String gender;
			int money;  
			static int remainPrice;	// 커플 계좌 잔액
			Couple(String name, String gender){
				this.name = name;
				this.gender = gender;
			}
			
		}
				
		main()
		Couple c1 = new Couple("홍길동", "남성");
		c1.money = 100000;					
		c1.remainPrice = 30000; 
		Couple c2 = new Couple("김미나", "여성");
		c2.money = 150000;
		c2.remainPrice += 30000;
		System.out.println("# c1의 정보 #");
		System.out.println("이름: "+c1.name);
		System.out.println("수중의 금액: "+c1.money);
		System.out.println("커플계좌의 금액: "+c1.remainPrice);	// 각 객체마다 다른 메모리 기능을 하는 일반변수와 달리 static 변수는 모든 객체에 공유한다
		System.out.println("# c2의 정보 #");
		System.out.println("이름: "+c2.name);
		System.out.println("수중의 금액: "+c2.money);
		System.out.println("커플계좌의 금액: "+c2.remainPrice);
	 */
	
		// 6.
	/*
		class Friend{
			static int vacationMoney;
			String name;	
			int money;
			Friend(String name, int money){
				this.name = name;
				this.money = money;
			}
		}
		
		main()
		Friend f1 = new Friend("홍길동",40000);
		f1.vacationMoney = f1.money;
		System.out.println(f1.name+"이 입급한 금액: "+f1.money);
		System.out.println("현재 총 금액: "+f1.vacationMoney);
		Friend f2 = new Friend("마길동",50000);
		f2.vacationMoney += f2.money;
		System.out.println(f2.name+"이 입급한 금액: "+f2.money);
		System.out.println("현재 총 금액: "+f2.vacationMoney);
		Friend f3 = new Friend("신길동",80000);
		f3.vacationMoney += f3.money;
		System.out.println(f3.name+"이 입급한 금액: "+f3.money);
		System.out.println("현재 총 금액: "+f3.vacationMoney);
		
	 */
	
}







