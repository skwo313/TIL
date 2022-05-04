package javaexp.a06_object;

import javaexp.a06_object.vo.Music;
import javaexp.a06_object.vo.Product;

public class A02_ObjectConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex)
		Product p1 = new Product("사과");
		p1.buy();
		p1.buy2();
		//
		Music m1 = new Music("문득", "비오");
		m1.play();
	}

}
