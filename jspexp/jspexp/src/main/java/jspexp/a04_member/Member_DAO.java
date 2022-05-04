package jspexp.a04_member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Member_DAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public void setConn() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(info,"scott","tiger");
		System.out.println("접속 성공");
	}
	
	void closeRsc() {
		if(rs!=null) { 
			try {
				rs.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		}
		if(pstmt!=null) { 
			try {
				pstmt.close();
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
	
	public int loginCheck(String id, String pass) {
		int x = -1;
		String sql = "select * from member_exp where user_id=? and user_pass=?";
		try {
			setConn();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				x = 1;
			} else {
				x = 0;
			}
			rs.close();pstmt.close();con.close();
		} catch (SQLException e) {
			System.out.println("DB관련 예외:" + e.getMessage());
			closeRsc();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO: handle exception
				e1.printStackTrace();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("일반 예외:" + e.getMessage());

		}
		return x;
	}
	
	public Member_VO login(String id, String pass) {
		Member_VO m = null;
		String sql = "select * from member_exp where user_id=? and user_pw=?";
		try {
			setConn();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				m = new Member_VO(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4),
						rs.getString(5));
			}
			rs.close();pstmt.close();con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("예외:"+e.getMessage());
			closeRsc();
		}
		return m;
	}
	
	public void insertMember(Member_VO ins) {
		String sql = "INSERT INTO member_exp values(?,?,?,?,?)";
		try {
			setConn();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ins.getUser_id());
			pstmt.setString(2, ins.getUser_pw());
			pstmt.setString(3, ins.getUser_name());
			pstmt.setString(4, ins.getUser_phone());
			pstmt.setString(5, ins.getUser_email());
			pstmt.executeUpdate();
			con.commit();
			pstmt.close();
			con.close();
			
;		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("예외:"+e.getMessage());
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			closeRsc();
		}finally {
			System.out.println("등록처리 완료");
		}
		
	}
	
	public Member_VO getMember(String id) {
		Member_VO m = null;
		String sql = "SELECT * FROM member_exp"
				+ "WHERE user_id = ?";
		try {
			setConn();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if( rs.next()) {
				m = new Member_VO(rs.getString(1),rs.getString(2),
						rs.getString(3),rs.getString(4),rs.getString(5));
			}
			rs.close();pstmt.close();con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			closeRsc();
		}
				
		return m;
	}
	
	public void updateMember(Member_VO upt) {
		String sql = "UPDATE member_exp SET"
				+ "user_id = ?"
				+ "user_pw = ?"
				+ "user_name = ?"
				+ "user_phone = ?"
				+ "user_email = ?"
				+ "WHERE user_id = ?";
		try {
			setConn();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, upt.getUser_id());
			pstmt.setString(2, upt.getUser_pw());
			pstmt.setString(3, upt.getUser_name());
			pstmt.setString(4, upt.getUser_phone());
			pstmt.setString(5, upt.getUser_email());
			pstmt.setString(6, upt.getUser_id());
			pstmt.executeUpdate();
			con.commit();
			pstmt.close();con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			closeRsc();
		}finally {
			System.out.println("업데이트 완료");
		}
		
	}
	
	public static void main(String[] args){
		Member_DAO dao = new Member_DAO();
		dao.updateMember(new Member_VO("himan88","8888","홍길동","01012345677","skwidji@naver.com"));
	}
}
