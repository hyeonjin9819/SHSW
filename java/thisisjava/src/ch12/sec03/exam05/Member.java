package ch12.sec03.exam05;

import lombok.Data;
import lombok.NonNull;

@Data
public class Member {
	@NonNull
	private String id;
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name.replace("바보", "xx");
	}
	
	/**
	 * 아이디와 비밀번호를 입력받아 로그인 여부 확인
	 * @param id 아이디
	 * @param pwd 비밀번호
	 * @return 로그인 여부 (true/false)
	 */
	public boolean login(String id, String pwd) {
		//디비연결, 조회, 결과 리턴
		return true;
	}
}
