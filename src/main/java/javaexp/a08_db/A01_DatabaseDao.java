package javaexp.a08_db;

// 해당 패키지에 있는 클래스 사용..
import java.sql.*;

public class A01_DatabaseDao {
	/*
	# Database 처리
	1. 처리 순서
		1) jdbc드라이버를 메모리에 로딩
			C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
			복사해서 webapp\WEB-INF\lib에 위치
	2. Dao 클래스 선언
		1) 전역 필드 선언 : 연결객체, 대화객체, 결과객체 선언..
		2) 연결처리 기능메서드 구현
			- jdbc 메모리 로딩
			- ip/port/계정/비밀번호 통해서 연결..
			
		3) 조회기능메서드 처리
			- 공통 연결 메서드 호출
			- 대화객체 호출
			- 결과객체 호출
			- vo객체 담기
	3. 웹프로그램에서 DB서버 처리 방법
		1) 프로그램 처리 구성도
			브라우저		웹server			DBSever
			요청처리		요청페이지호출된	DB데이터
						DB수행이 필요한페이지
						DAO
						
	# DAO 처리 순서
	1. 공통 필드 선언.
		공통적으로 사용될 객체 선언..
		연결, 대화, 결과
	2. 공통적으로 사용할 연결 처리 기능 메서드 선언..
		
	 */
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	// 연결 공통 메서드
	public void setConn() {
		// 1. 공통 소스 드라이버 패키지 설정.
		// 	  컴파일 예외 처리..
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러: "+e.getMessage());
		}
		// 2. 특정 서버에 연결
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			// 메모리에 OracleDriver가 로딩된 상황에서
			con = DriverManager.getConnection(info, "scott", "tiger");
			System.out.println("접속 성공");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("에러: "+e.getMessage());
		}
		
	}
	// 조회 처리 메서드 구현1단계(출력)
	public void empList() {
		// 1. 연결공통메서드 호출
		try {
			setConn();
			// 2. Statement 객체 생성
			stmt = con.createStatement();
			String sql = "SELECT * FROM EMP";
			// 3. ResultSet 객체 생성. sql의 결과(Statement ==> ResultSet)
			rs = stmt.executeQuery(sql);
			// 4. while()을 통해 결과 내용 처리 sql의 결과는 처리
			//	   rs.next() 행단위로 이동하게 처리
			int rowNum = 1;
			while(rs.next()) {
				System.out.print(rowNum+++"행\t");
				// rs.get데이터유형("컬럼명/alias명")
				System.out.print(rs.getInt("empno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getInt("mgr")+"\t");
				System.out.print(rs.getDate("hiredate")+"\t");
				System.out.print(rs.getDouble("sal")+"\t");
				System.out.print(rs.getDouble("comm")+"\t");
				System.out.print(rs.getInt("deptno")+"\n");
			}
			// 5. 자원해제
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			// 6. 예외 처리..
			System.out.println(e.getMessage());
			if(rs!=null) rs = null;	// 강제로 자원해제
			if(stmt!=null) stmt = null;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A01_DatabaseDao dao = new A01_DatabaseDao();
		dao.empList();
		
	}

}
