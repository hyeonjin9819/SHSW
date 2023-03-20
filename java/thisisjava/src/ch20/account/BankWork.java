package ch20.account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BankWork {
	Scanner scanner = new Scanner(System.in);
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// 계좌 추가 
	void insertAccount(Connection conn) throws Exception {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");

		System.out.print("계좌번호: ");
		String accountNum = scanner.nextLine();

		System.out.print("계좌주: ");
		String name = scanner.nextLine();

		System.out.print("초기입금금액: ");
		int price = Integer.parseInt(scanner.nextLine());
		
		String sql = "INSERT INTO account (account, owner, price) VALUES (?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, accountNum);
		pstmt.setString(2, name);
		pstmt.setInt(3, price);
		
		int r = pstmt.executeUpdate();
		
		if (r>0) System.out.println("계좌가 정상적으로 등록되었습니다");
		closeAll();
		
	}
	
	// 모든 계좌 가져오기 
	void getAccount(Connection conn) throws Exception {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		String sql = "SELECT * FROM account";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("계좌번호: " + rs.getString("account")+ "\n" + "계좌주: "+ rs.getString("owner")+ "\n" + "잔고: " + rs.getInt("price"));
			System.out.println("-------------------------------");
		}
		closeAll();
	}
	
	// 입금하기
	void addMoney(Connection conn) throws Exception {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String accountNum = scanner.nextLine();
		System.out.print("예금액: ");
		int addMoney = Integer.parseInt(scanner.nextLine());
		int nowMoney = findNowMoney(conn, accountNum);
		int resMoney = addMoney + nowMoney;
		int pk = findIdByAcocunt(conn, accountNum);
		String sql = "UPDATE account SET price = ? WHERE id = ?";
		pstmt = conn.prepareStatement(sql);
		System.out.println(accountNum);
		pstmt.setInt(1, resMoney);
		pstmt.setInt(2, pk);
		int r = pstmt.executeUpdate();
		
		if (r>0) System.out.println("입금이 완료되었습니다.");
		closeAll();
		
	}
	
	// 출금하기
	void minusMoney(Connection conn) throws Exception {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String accountNum = scanner.nextLine();
		System.out.print("출금액: ");
		int minusMoney = Integer.parseInt(scanner.nextLine());
		// 먼저 해당 계좌에 있는 잔고를 구한다.
		int nowMoney = findNowMoney(conn, accountNum);
		// 출금이 가능한 잔고인 경우
		if (nowMoney - minusMoney >0) {
			int resMoney =  nowMoney- minusMoney;
			int pk = findIdByAcocunt(conn, accountNum);
			String sql = "UPDATE account SET price = ? WHERE id = ?";
			pstmt = conn.prepareStatement(sql);
			System.out.println(accountNum);
			pstmt.setInt(1, resMoney);
			pstmt.setInt(2, pk);
			int r = pstmt.executeUpdate();
			
			if (r>0) System.out.println("출금이 완료되었습니다.");
		
		} else {
			System.out.println("잔고가 부족합니다."); // 출금이 불가능한 잔고 상태인 경우
		}
		closeAll();

	}
	
	// 해당 계좌에 해당하는 유저의 현재 돈을 찾는다
	int findNowMoney(Connection conn, String account) throws Exception {
		String sql = "SELECT price FROM account WHERE account = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, account);
		ResultSet rs = null;
		rs = pstmt.executeQuery();
		int mon = 0;
		// 커서의 시작은 맨 앞이다! rs.next()를 해줘야 뒤로 넘어갈 수 있음
		if (rs.next()) mon = rs.getInt("price");
		return mon;
		
	}
	
	// 해당 계좌에 해당하는 pk를 찾는다
	int findIdByAcocunt(Connection conn, String account) throws Exception {
		String sql = "SELECT id FROM account WHERE account = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, account);
		ResultSet rs = null;
		rs = pstmt.executeQuery();
		int r = 0;
		// 커서의 시작은 맨 앞이다! rs.next()를 해줘야 뒤로 넘어갈 수 있음
		if (rs.next()) r = rs.getInt("id");
		return r;
	}
	
	void closeAll() {
		try {
			pstmt.close();
			rs.close();
			System.out.println("연결 끊기");
		}catch (Exception e) {}
		finally {
			if(pstmt != null) try {pstmt.close();} catch(Exception e) {};
			if(rs != null) try {rs.close();} catch(Exception e) {};
		}
	}
	
	

}

