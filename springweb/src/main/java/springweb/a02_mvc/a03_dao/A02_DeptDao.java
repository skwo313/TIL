package springweb.a02_mvc.a03_dao;

import org.springframework.stereotype.Repository;

import springweb.vo.Dept;

@Repository
public interface A02_DeptDao {
	/* select count(*) cnt from dept where deptno=?? */
	/* select * from dept where deptno=?? */
	
	public int getCount(int deptno);
	public Dept getDeptList(int deptno);
}
