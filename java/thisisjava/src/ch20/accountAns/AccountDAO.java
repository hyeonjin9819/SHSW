package ch20.accountAns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public AccountDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "testuser",
				"test1234");
		} catch (Exception e) {
			
		}
	}
	
	public void close() {
		if(rs != null) try {rs.close();} catch(Exception e) {};
		if(stmt != null) try {rs.close();} catch(Exception e) {};
		if(pstmt != null) try {rs.close();} catch(Exception e) {};
		if(conn != null) try {rs.close();} catch(Exception e) {};
	}
	
	public int insert(AccountVO acc) {
		String sql = "INSERT INTO ACCOUNT";
		int r=  0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, acc.getNumber());
			pstmt.setString(2, acc.getOwner());
			pstmt.setString(3, acc.getNumber());
			
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return r;
	}
	
	// 계좌조회
	public int findAccount(String number) {
		int r= 0;
		try {
			stmt = conn.createStatement();		
			rs = stmt.executeQuery("SELECT * FROM account WHERE number = '"+number+"'");
			if (rs.next()) r = rs.getInt("pk");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return r;
	}
	
	// 전체 계좌 조회
	public List<AccountVO> selectAll() {
		List<AccountVO> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM account ORDER BY no DESC");
			AccountVO vo = new AccountVO();
			while(rs.next()) {
				vo.setNo(rs.getInt("id"));
				vo.setNumber(rs.getString("account"));
				vo.setOwner(rs.getString("owner"));
				vo.setBalance(rs.getInt("price"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
		
	}

}
