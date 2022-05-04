package javaexp.a02_middle;

public class A16_ClassExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("볼보",0,1);
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.loadPerson(2);
		c1.loadPerson(1);
		c1.loadPerson(1);
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.breakCar();
	}	

}
// ex)
class Car{
	String carType;
	int speed;
	int peopleCnt;
	Car(String carType, int speed, int peopleCnt){
		this.carType = carType;
		this.speed = speed;
		this.peopleCnt = peopleCnt;
	}
	void currentSpeed() {
		System.out.println(carType+"의 현재 속도는 "+ speed+"km/h");
	}
	void speedUp() {
		this.speed += 10;
		System.out.println("# 속도 감소 #");
		currentSpeed();
	}
	void loadPerson(int cnt) {
		peopleCnt +=cnt; // 기존에 있는 인원에서 누적하여 할당 처리
		System.out.println("방금 탑승한 인원:" +cnt);
		System.out.println("총 탑습 인원: "+ peopleCnt);
	}
	void speedDown() {
		this.speed -= 5;
		currentSpeed();
	}
	void breakCar()	{
		this.speed = 0;
		System.out.println("@@ 사고 @@");		
		currentSpeed();
	}
	
	
}

