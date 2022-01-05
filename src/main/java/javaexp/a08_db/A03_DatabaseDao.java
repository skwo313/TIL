package javaexp.a08_db;

import java.sql.*;

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A03_DatabaseDao dao = new A03_DatabaseDao();
		dao.deptList();
	}

}
