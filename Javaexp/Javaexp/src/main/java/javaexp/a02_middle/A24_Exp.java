package javaexp.a02_middle;

public class A24_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c1 = new Car1("볼보", 2000, 50);
		Driver d1 = new Driver("홍길동", 25,"서울");
		c1.setDriver(d1);
		c1.driving(); 
		c1.speed();
		c1.speedUP();
		c1.speedDown();
	}

}
class Car1{
	String carKind;
	Driver driver;
	int displacement;
	int speed;
	Car1(String carKind, int displacement, int speed){
		this.carKind = carKind;
		this.displacement = displacement;
		this.speed = speed;
	}
	void setDriver(Driver driver) {
		this.driver = driver;
	}
	void driving() {
		System.out.print(carKind+" 차를 타다, ");
		if (driver!=null) {
			driver.show();
		} else {
			System.out.println("기사는 없다");
		}
	}
	void speed() {
		System.out.println("현재 속도: "+ speed);
	}
	void speedUP() {
		this.speed += 10;
		System.out.println("액셀 밟은 후 속도: "+ speed);
	}
	void speedDown() {
		this.speed -= 10;
		System.out.println("브레이크 밟은 후 속도: "+ speed);
	}
}
class Driver{
	String dName;
	int age;
	String loc;
	Driver(String dName, int age, String loc){
		this.dName = dName;
		this.age = age;
		this.loc = loc;
	}
	void show() {
		System.out.println("기사는 "+dName+"이다.");
		System.out.println("나이는 "+age+"이다.");
		System.out.println("사는 곳은 "+loc+"이다.");
	}
}