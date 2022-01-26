package a01_diexp;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.vo.FruitShop;
import a01_diexp.vo.Sensor;

public class DIExp_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DI(의존성 주입)을 위한 연습 환경 만들기..
		String path = "a01_diexp\\di05.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// 컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		Sensor sensor01 = ctx.getBean("sensor01", Sensor.class);
		System.out.println("객체생성:"+sensor01);
		
		FruitShop fs = ctx.getBean("fruitShop", FruitShop.class);
		System.out.println("객체생성:"+fs);
		ctx.close();
	}

}
