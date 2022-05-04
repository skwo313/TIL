package jspexp.a02_mvc.a01_controller.ajax;

import java.util.ArrayList;

import com.google.gson.Gson;

import jspexp.a03_database.A01_Dao;
import jspexp.z01_vo.Cart;
import jspexp.z01_vo.Dept;
import jspexp.z01_vo.Emp;
import jspexp.z01_vo.Person;

public class Z01_Gson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p01 = new Person("홍길동", 25, "서울신림동");
		// 1. Gson 객체 생성.
		Gson gson = new Gson();
		// 2. 기능메서드를 통해서 json문자열 가져오기
		String personJson = gson.toJson(p01);
		// 3. 확인
		System.out.println(personJson);
		
		// ex)
		Cart c01 = new Cart("사과", 30000, 2);
		String productJson = gson.toJson(c01);
		System.out.println(productJson);
		ArrayList<Cart> plist = new ArrayList<Cart>();
		plist.add(new Cart("사과",3000,2));
		plist.add(new Cart("바나나",5000,4));
		plist.add(new Cart("딸기",10000,2));
		String listJson = gson.toJson(plist);
		System.out.println(listJson);
		// ex) 사원정보를 emplist
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		// int empno, String ename, String job, int mgr, String hiredateS, double sal, double comm, int deptno
		emplist.add(new Emp(1,"홍길동","사원",30023,"2022-01-01",3000,0,30));
		emplist.add(new Emp(1,"홍길동","사원",30023,"2022-01-01",3000,0,30));
		emplist.add(new Emp(1,"홍길동","사원",30023,"2022-01-01",3000,0,30));
		String listJson2 = gson.toJson(emplist.get(1));
		System.out.println(listJson2);
		/*
		# dao를 통한 데이터 가져와서 json데이터 처리하기
		 */
		A01_Dao dao = new A01_Dao();
		ArrayList<Emp> dbEmplist = dao.empListPre("","");
		String dbEmpJson = gson.toJson(dbEmplist);
		System.out.println(dbEmpJson);
		
		ArrayList<Dept> dbDeptlist = dao.deptList("");
		String dbDeptjson = gson.toJson(dbDeptlist);
		System.out.println(dbDeptjson);
	}

}
