package springweb.a02_mvc.a03_dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import springweb.vo.DeptEmp;
import springweb.vo.Emp;
import springweb.vo.SalGrade;

// springweb.a02_mvc.a03_dao.A01_EmpDao

@Repository
public interface A01_EmpDao {
	// public abstract 내부적으로 설정이 된다
	public ArrayList<Emp> getEmpList(Emp sch);
	public int getCount(int deptno);
	public int getJobCount(String job);
	public Emp getEmpDetail(int empno);
	public List<String> getEnames(int deptno);
	public List<Integer> getEmpno(String job);
	public List<DeptEmp> getDeptEmp();
	public List<SalGrade> getSalGrade();
	public ArrayList<Emp> getSchEmp(@Param("mgr") int mgr,  
									@Param("deptno") int deptno);
	
	public Emp getEmp(int empno);
}
