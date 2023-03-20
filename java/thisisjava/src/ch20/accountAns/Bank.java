package ch20.accountAns;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bank {
	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
//		AccountVO vo = new AccountVO();
//		vo.setNumber("2222");
//		vo.setOwner("홍길동");
//		vo.setBalance(1000);
//		
		List<AccountVO> list = dao.selectAll();
		for(AccountVO vo:list) {
			System.out.println(vo.getNo() );
		}
		
	}
}
