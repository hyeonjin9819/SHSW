/**
 * @author User
 * 2023.03.14
 * 기획팀 누가 시켜서
 */
package ch12.sec03.exam05;

import java.util.Random;

public class MemberEx {

	public static void main(String[] args) {
		Member m = new Member();
		m.setId("hong");
		m.setName("홍길동");
		m.setName("바보");
		System.out.println(m.getId());
		System.out.println(m.getName());
		
		System.out.println(m);
		System.out.println(m.toString());
		System.out.println(System.getProperty("java.specification.version"));
	
		// 배열에다가 숫자, 문자, 문자열, Member객체 담아야함
		Object[] obj = {1, 3.14, 'A', "ABC", new Member()};
		// Auto boxing
		Object[] obj2 = {new Integer(1), 3.14, 'A', "ABC", new Member()}; // 실로는 1이 Integer wrapper Class 타입에 앞에 들어가는 것 => 자동으로 바뀜
		
		Integer i = 1; //boxing
		int i2 = i;
		
//		test(1);
//		test("aa");
//		test(new Member());
//		
		double d = Math.round(3.123456*1000) /1000.0;
		System.out.println(d);
		
		Random r1 = new Random();
		System.out.println(r1.nextInt(10));
		Random r2 = new Random();
		System.out.println(r2.nextInt(10));
		
		m.login(null, null);
	
	}
	

}
