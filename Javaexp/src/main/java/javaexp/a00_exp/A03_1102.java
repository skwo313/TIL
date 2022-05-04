package javaexp.a00_exp;

public class A03_1102 {
	//1. 
//	메서드의 작업수행 결과인 리턴값이 없을 경우, 반환타입으로 void 로 작성
//	1) 콘솔창에 출력만 하고자 할 때 System.out.println();
//		void greeting() {
//			System.out.println("안녕하세요!");
//		}
//	2) 매개변수를 통해서 객체에 데이터를 저장하고자 할 때
//		ex) 사람의 귀는 음성정보를 받아서 뇌에 전달한다
//			객체도 외부의 데이터를 받아서 필드에 전달할 때, 주로 리턴값이 필요없다
//			void setName(String name) {
//				this.name = name;
//			}
//	3) 기능 프로세스만 처리할 떄, 리턴값이 없는 경우가 있다
//		ex) 사람이 어떤 계획을 하거나 생각을 할 때는 외부에 입력도, 리턴도 하지 않지만
//			추후에 행동에 영향을 미칠 판단을 하게 된다
//			void setCalculator() {
//				필드에 있는 데이터를 연산처리하여 필드에 데이터를 할당 처리
//				sum =	num01+num02;
//			}
	static void method(String name) {
		System.out.println("이름: "+name);
	}
	/*
	2. 메서드의 매개변수에 따른 데이터를 처리를 한다. 매개변수를 처리하는 3가지 유형을 기술하세요
		1) 데이터가 외부에서 입력되는 형태를 말하고, 외부에서도 이에 맞게 입력하여야 한다
		2) 메서드를 통해서 데이터의 입력이 없을 때.
			void call(){}
		3) 데이터의 입력이 하나만 있을 떄, 해당 타입에 따라서 호출이 가능하다
			void setName(String name){}		setName("홍길동");
			void setAge(int age){}			setAge(25);
		4) 데이터가 여러개인 경우 해당 유형과 갯수와 타입이 순서에 맞게 선언하여야 한다
			void setPerson(String name, int age, String loc)
				setPerson("홍길동",25,"서울강남");
	 */
	// 2-1. 문자형 
	static void callString(String name01) {
		System.out.println("이름: "+name01);
	}
	// 2-2. 정수형
	static void callInt(int num01) {
		System.out.println("입력한 숫자: "+num01);
	} 
	// 2-3.	실수형 
	static void callDouble(double weight) {
		System.out.println("몸무게: "+ weight);
	}
	
	// 3.
	static void center(String enroll, String id, String password, String name02, int point) {
		System.out.println("# 회원등록 내역 #");
		System.out.println("회원등록여부: "+ enroll);
		System.out.println("아이디: "+ id);
		System.out.println("비밀번호: "+ password);
		System.out.println("이름: "+ name02);
		System.out.println("포인트: "+ point);
	}
	
	// 4. 
	static void score(String name03, int kors, int eng, int math) {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name03+"\t"+kors+"\t"+eng+"\t"+math+"\t"+(kors+eng+math)+"\t"+((kors+eng+math)/3));
	}
	
	// 5.
	static double score2(String name03, int kors, int eng, int math) {
		System.out.print(name03+"\t");
		System.out.print(kors+"\t");
		System.out.print(eng+"\t");
		System.out.print(math+"\t");
		System.out.print((kors+eng+math)+"\t");
		System.out.print(((kors+eng+math)/3)+"\n");
		return kors+eng+math;
		
	}
	
	// 6. 
	static void gugu(int grade) {
		for(int i=1;i<10;i++){
		System.out.println(grade+ " X " + i + " = " + (grade*i));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		method("홍길동");
		
		// 2-1. 문자형
		callString("홍길동");
		// 2-2. 정수형
		callInt(777);
		// 2-3.	실수형 
		callDouble(77.8);
		
		// 3.
		center("등록","skwo313","frhau231","홍길동",1000);
		
		
		// 4.
		score("김미나",90,80,70);
		
		// 5.
		System.out.println("============================================");
		double tot = 0;
		tot += score2("신영희",90,90,70);
		tot += score2("오윤석",90,85,70);
		tot += score2("김민석",80,60,60);
		double avg = 0;
		avg += tot/3;
		System.out.println("전체총점: "+tot+"\n전체평균: "+ (int)avg);
		
		// 6. 
		gugu(3);
		
		// 7-1. 
		
		int r1 = (int)(Math.random()*8+1);
		System.out.print("1) "+r1);
		// 7-2.
		int r2 = (int)(Math.random()*6+5);
		System.out.print("\t 2) "+r2);
		// 7-3.
		int r3 = (int)(Math.random()*101);
		System.out.print("\t 3) "+r3);
		// 7-4.
		int r4 = (int)(Math.random()*12+1);
		System.out.println("\t 4) "+r4);
		
		// 8.
		int student1 = (int)(Math.random()*100);
		int student2 = (int)(Math.random()*100);
		int student3 = (int)(Math.random()*100);
		System.out.println("학생1: "+student1+", 학생2: "+student2+", 학생3: "+student3);
		
		// 9. 
		int team1 = (int)(Math.random()*6+1) + (int)(Math.random()*6+1);
		int team2 = (int)(Math.random()*6+1) + (int)(Math.random()*6+1);
		if(team1>team2) {
			System.out.println("1팀 승리!");
		} else if(team1<team2) {
			System.out.println("2팀 승리!");
		} else {
			System.out.println("무승부");
		}
		
		// 10.
		int[] winner = new int[10];
	
		
		for(int i=0;i<10;i++) {
			int team01 = (int)(Math.random()*6) + (int)(Math.random()*6);
			int team02 = (int)(Math.random()*6) + (int)(Math.random()*6);
			if(team01>team02) {
				winner[i] = 1;				
			} else if(team01<team02) {
				winner[i] = 2;				
			} else {
				winner[i] = 0;				
			}
		}
		
		int count1 = 0;
		for (int i = 0; i < winner.length; i++) {
            if(winner[i]==1){
                count1++; 
            }
        }
		
		int count2 = 0;
		for (int i = 0; i < winner.length; i++) {
            if(winner[i]==2){
            	count2++; 
            }
        }
		
		if(count1>count2) {
			System.out.println("1팀 우승!");
		} else if(count1<count2){
			System.out.println("2팀 우승!");
		} else {
			System.out.println("무승부");
		}
		
	}

}
