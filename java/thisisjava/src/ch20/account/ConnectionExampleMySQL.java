package ch20.account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionExampleMySQL {
	// - 등록, 목록, 예금, 출금 기능 구현

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		BankWork bankwork = new BankWork();
		boolean flag = true;

		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;

		// 1. 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2. DB 접속
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "testuser",
				"test1234");
		System.out.println("연결성공");

		while (flag) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");
			String chooseNum = scanner.nextLine();

			if ("1".equals(chooseNum)) {
				bankwork.insertAccount(conn);

			} else if ("2".equals(chooseNum)) {
				bankwork.getAccount(conn);
				
			} else if ("3".equals(chooseNum)) {
				bankwork.addMoney(conn);
				
			} else if ("4".equals(chooseNum)) {
				bankwork.minusMoney(conn);
				
			} else if ("5".equals(chooseNum)) {
				flag = false;
				System.out.println("프로그램 종료");
			}
		}
		
		try {
			conn.close();
			System.out.println("연결 끊기");
		}catch (SQLException e) {}
		finally {
			if(conn != null) try {conn.close();} catch(Exception e) {};
		}


	}

}
