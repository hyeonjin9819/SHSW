package ch06.pr15;

public class MemberService {
	private String name;
	private String pwd;
	
	public boolean login(String name, String pwd) {
		if ("hong".equals(name) && "12345".equals(pwd)) {
			System.out.println("로그인 되었습니다.");
			return true;
		} else {
			System.out.println("id 또는 비밀번호가 올바르지 않습니다.");
			return false;
		}
	}
	
	public void logout(String name) {
		System.out.println(name + "님이 로그아웃 하셨습니다.");
	}

}
 