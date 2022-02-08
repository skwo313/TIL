package springweb.a02_mvc.a03_dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import springweb.vo.Dept;
import springweb.vo.Dept2;
import springweb.vo.DeptSal;
import springweb.vo.Salgrade2;

@Repository
public interface A02_DeptDao {
	/* select count(*) cnt from dept where deptno=?? */
	/* select * from dept where deptno=?? */
	
	public int getCount(int deptno);
	public Dept getDeptList(int deptno);
	public DeptSal getDeptSal(int deptno);
	public Dept2 getDept2(String dname);
	public List<Salgrade2> getGrade();
	public List<Dept> getDeptList(Dept sch);
	public void insertDept(Dept ins);
}
