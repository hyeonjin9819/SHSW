package ch20.oracle.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertExample {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			// 2. DB 접속
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "testuser", "test1234");
			// 3. statement 객체 생성 -> 얘는 prepareStatement니까 파라미터에 들어갈 sql이 미리 준비되어야함
			String sql = "INSERT INTO emp_ex (empno, ename, salary) VALUES (emp_ex_seq.nextval, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			// 4. sql 실행(처리)
			// select -> execute Query : ResultSet 리턴
			// insert/update/delete -> executeUpdate : int 리턴
			pstmt.setString(1, "서민구");
			pstmt.setInt(2, 1000);
			int r = pstmt.executeUpdate();

			// 5. 결과 처리 (커서 형태)
			if (r > 0)
				System.out.println("정상적으로 등록되었습니다.");

			// 6. 해제(close) -> finally 에서

			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
		} finally {
			// if(conn != null) {
			try {
				conn.close();
				System.out.println("연결 끊기");
			} catch (SQLException e) {
			}
			// }
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
				}
			;
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (Exception e) {
				}
			;
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			;
		}

	}

}
