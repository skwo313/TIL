package javaexp.a08_db;
// javaexp.a04_vo.Dept
// javaexp.a08_db

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javaexp.a04_vo.Dept;
import javaexp.a04_vo.Emp;
import javaexp.a04_vo.Emp2;
import javaexp.a04_vo.EmpDept;
import javaexp.a04_vo.EmpSch;

public class A03_DatabaseDao {
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	public void setConn() throws SQLException{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(info,"scott","tiger");
		System.out.println("접속 성공!");
	}
	
	public void deptList() {
		try {
			setConn();
			stmt = con.createStatement();
			String sql = "SELECT * FROM DEPT";
			rs = stmt.executeQuery(sql);
			int rowNum = 1;
			while(rs.next()) {
				System.out.print(rowNum+++"행\t");
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString("loc")+"\n");
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql예외: "+e.getMessage());
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
	// 3. deptlist 기능 메서드
	/*
	1. Dept(deptno, danme, loc) vo 생성
	2. 리턴할 기능 메서드 선언
	3. select
	 */
	
	public ArrayList<Dept> deptList(String loc) {
		ArrayList<Dept> dlist = new ArrayList<Dept>();
		try {
			setConn();
			stmt = con.createStatement();
			String sql = "SELECT * \r\n"
					+ "FROM dept\r\n"
					+ "WHERE loc LIKE '%'||'"+loc+"'||'%'";
			rs = stmt.executeQuery(sql);
			int rowNum = 1;
			while(rs.next()) {
				dlist.add(new Dept(rs.getInt("deptno"),rs.getString(2), rs.getString("loc") ));
				System.out.print(rowNum+++"행\t");
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString("loc")+"\n");
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql예외: "+e.getMessage());
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return dlist;
	}
	
	public ArrayList<Emp2> getEmpList2(int deptno){
		ArrayList<Emp2> list = new ArrayList<Emp2>();
		String sql = "SELECT empno no, ename name, job, deptno\r\n"
				+ "FROM emp \r\n"
				+ "WHERE deptno="+deptno;
		return list;		
	}
	
	public ArrayList<EmpDept> getEmpDeptList(String job){
		ArrayList<EmpDept> EDlist = new ArrayList<EmpDept>();
		String sql = "SELECT dname, ename, job, sal\r\n"
				+ "FROM EMP e , DEPT d\r\n"
				+ "WHERE e.deptno = d.deptno\r\n"
				+ "AND job LIKE '%'||'"+job+"'||'%'";
		try {
			setConn();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				EDlist.add(new EmpDept(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4) ));
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("예외:"+e.getMessage());
			if(rs!=null) rs = null;
			if(stmt!=null) stmt = null;
			if(con!=null) con = null;
		}
		return EDlist;
	}
	public ArrayList<Emp> getEmpListSch(EmpSch sch){
		ArrayList<Emp> list = new ArrayList<Emp>();
		String sql = "SELECT *\r\n"
				+ "FROM emp \r\n"
				+ "WHERE ename LIKE '%'"+sch.getEname()+"'%'\r\n"
				+ "AND job LIKE '%'"+sch.getJob()+"'%'\r\n"
				+ "AND sal BETWEEN "+sch.getFr_sal()+" AND "+ sch.getTo_sal()+"\r\n"
				+ "AND deptno ="+sch.getDeptno();
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A03_DatabaseDao dao = new A03_DatabaseDao();
//		dao.deptList();
//		ArrayList<Dept> dlist = dao.deptList("A");
//		for(Dept d:dlist) {
//			System.out.println(d.getDeptno()+"\t"+d.getDname());
//		}
		System.out.println("#salesman#");
		ArrayList<EmpDept> EDlist = dao.getEmpDeptList("SALES");
		for(EmpDept ed : EDlist) {
			System.out.println(ed.getDname()+"\t"+ed.getEname()
			+"\t"+ed.getJob()+"\t"+ed.getSal());
		}
	}

}
