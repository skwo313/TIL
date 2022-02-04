package springweb.a02_mvc.a02_service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a02_mvc.a03_dao.A01_EmpDao;
import springweb.a02_mvc.a03_dao.A02_DeptDao;
import springweb.vo.Emp;

@Service
public class A01_EmpService {
	// A01_EmpDao인터페이스로 선언한 내용을 상속한 실제 객체가 컨테이너에서
	// 생성되어 있을 때, 사용
	@Autowired
	private A01_EmpDao dao;
	@Autowired
	private A02_DeptDao dao2;
	
	public ArrayList<Emp> getEmpList(Emp sch){
		// 요청값으로 초기화면일 때, null을 ""으로 처리
		if(sch.getEname()==null) sch.setEname("");
		if(sch.getJob()==null) sch.setJob("");
		
		dao.getCount(10);
		dao.getJobCount("A");
		dao.getEmpDetail(7369);
		dao2.getDeptSal(30);
		System.out.println(dao.getEnames(10).size());
		System.out.println(dao.getEmpno("SALESMAN").size());
		System.out.println(dao.getDeptEmp().size());
		System.out.println(dao.getSalGrade().size());
		
		return dao.getEmpList(sch);
	}
}
