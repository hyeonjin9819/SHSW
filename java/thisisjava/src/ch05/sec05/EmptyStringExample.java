package ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hobby = ""; // ""도 값이 안들어가있을 뿐이지 문자열임 (빈 문자열이 들어있는 것)
		if("".equals(hobby)) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
		}

	}

}
