package javaexp.a02_middle;

public class A09_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle();
		System.out.println("탈것의 속도:"+v1.speed);
		Bus01 b1 = new Bus01();
		Truck t1 = new Truck();
		System.out.println("버스 승객수: "+b1.passengerCnt+"\t"+"속도:"+b1.speed);
		System.out.println("트럭의 중량: "+t1.weight+"\t"+"속도:"+t1.speed);
	}

}
class Vehicle {
	int speed = 80;
}
class Bus01 extends Vehicle {
	int passengerCnt = 15;
}
class Truck extends Vehicle {
	int weight = 1000; 
}