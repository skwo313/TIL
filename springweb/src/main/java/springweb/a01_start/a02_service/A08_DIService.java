package springweb.a01_start.a02_service;

import org.springframework.stereotype.Service;

@Service
public class A08_DIService {
	
	public String show() {
		System.out.println("서비스 객체 호출");
		return "안녕하세요!!";
	}
}
