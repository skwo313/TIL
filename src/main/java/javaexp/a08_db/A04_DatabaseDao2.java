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

public class A04_DatabaseDao2 {
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
	// 등록처리
	public void insertEmp(Emp ins) {
		String sql = "INSERT INTO emp02 VALUES ("+ins.getEmpno()+",'"+ins.getEname()
		+"','"+ins.getJob()+"',"+ins.getMgr()+",sysdate,"
		+ins.getComm()+","+ins.getDeptno()+")";
		try {
			setConn();
			// 자동커밋방지
			con.setAutoCommit(false);
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			con.commit();
			// 자원해제
			stmt.close(); con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// 예외시 rollback 처리
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
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
	
	public ArrayList<Emp> getEmpListSch(EmpSch sch){
		ArrayList<Emp> list = new ArrayList<Emp>();
		String sql = "SELECT *\r\n"
				+ "FROM emp02 \r\n"
				+ "WHERE ename LIKE '%'"+sch.getEname()+"'%'\r\n"
				+ "AND job LIKE '%'"+sch.getJob()+"'%'\r\n"
				+ "AND sal BETWEEN "+sch.getFr_sal()+" AND "+ sch.getTo_sal()+"\r\n"
				+ "AND deptno ="+sch.getDeptno();
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A04_DatabaseDao2 dao = new A04_DatabaseDao2();
		dao.deptList();
	}

}
