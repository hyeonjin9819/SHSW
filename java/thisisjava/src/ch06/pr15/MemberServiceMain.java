package ch06.pr15;

public class MemberServiceMain {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		memberService.login("hong", "12345");
		memberService.login("Park", "12345");
		
		memberService.logout("hong");
	}

}
