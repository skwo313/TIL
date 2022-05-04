package javaexp.a02_middle;

public class A23_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Com01 c1 = new Com01("삼성");
		Mouse m1 = new Mouse("white");
		c1.setMouse(m1);
		c1.showInfo();
		
	}

}
class Com01{
	String name;
	Mouse mo;
	Com01(String name){
		this.name = name;
	}
	void setMouse(Mouse mo) {
		this.mo = mo;
	}
	void showInfo() {
		System.out.println("컴퓨터 제조사: "+name);
		System.out.println("Mouse 객체의 할당여부: "+(mo!=null));
		if (mo!=null) {
			mo.show();
		} else {
			System.out.println("구매x ");
		}
	}
}
class Mouse{
	String color;
	Mouse(String color){
		this.color = color;
	}
	void show(){
		System.out.println("마우스의 색상은: "+color);
	}
}