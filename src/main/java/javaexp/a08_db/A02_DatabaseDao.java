package javaexp.a08_db;

import java.sql.*;

public class A02_DatabaseDao {
	//  ex) 연결 처리 객체 만들기.
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	public void setConn() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러: "+e.getMessage());
		}
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(info, "scott", "tiger");
		System.out.println("접속성공");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A02_DatabaseDao db = new A02_DatabaseDao();
		try {
			db.setConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("예외:"+e.getMessage());
		}
	}

}
