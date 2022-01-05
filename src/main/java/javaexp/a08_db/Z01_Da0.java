package javaexp.a08_db;

import java.sql.*;

public class Z01_Da0 {
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	public void setConn() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러:"+e.getMessage());
		}
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(info, "scott", "tiger");
		System.out.println("연결 성공");
	}
	public void empDeptList() {
		try {
			setConn();
			stmt = con.createStatement();
			String sql = "SELECT * FROM EMP e, DEPT d WHERE e.deptno = d.deptno";
			rs = stmt.executeQuery(sql);
			int num = 1;
			while(rs.next()) {
				System.out.print(num+++"행\t");
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getInt(4)+"\t");
				System.out.print(rs.getDate(5)+"\t");
				System.out.print(rs.getInt(6)+"\t");
				System.out.print(rs.getInt(7)+"\t");
				System.out.print(rs.getInt(8)+"\t");
				System.out.print(rs.getInt(9)+"\t");
				System.out.print(rs.getString(10)+"\t");
				System.out.print(rs.getString(11)+"\n");
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
				try {
					if(rs!=null) rs = null;
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
				try {
					if(stmt!=null) stmt = null;
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
				try {
					if(con!=null) con = null;
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z01_Da0 dao = new Z01_Da0();
		dao.empDeptList();
			
	}
	

}
