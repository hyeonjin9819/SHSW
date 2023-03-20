package ch02.sec06;

public class TextBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "" +
		"{\n" +
		"\t\"id\":\"winter\",\n" +
		"\t\"name\"\"눈송이\"\n" +
		"}";
		
		System.out.println(str1);
		
		// 타입추론 -> jdk 11 이상부터 가능
		var a = 1;
		var b = "";
		
		int i = 1;
		long l = i; // 자동 형변환
		int i2 = (int)l; // 강제 형변환
		
		double d = 3.14;
		int d2 = (int) d; // 강제형변환 (소수점 유실)
		System.out.println(d2);
		
		// 정수와 정수의 연산은 결과값이 항상 정수
		int kor = 90;
		int eng = 80;
		int math = 87;
		int total = kor + eng + math;
		double avg = (double)total /3; // 우선순위가 total /3이 먼저임 그래서 이미 85가 만들어진 후 double로 바뀌어서 나머지가 없는 형태가 된 것
		System.out.println(avg);
		
		/*
		// 문자열 -> 기본타입
		int -> Integer (첫자가 대문자 -> Class)
		long -> Long (클래스 안에는 함수와 유사한 Method가 있다.)
		double -> Double
		
		.parseXXX
				*/
		
		//문자열 -> 정수
		String age = "30";
		int age2 = Integer.parseInt(age);
		long age3 = Long.parseLong(age);
		double age4 = Double.parseDouble(age);
		
		// 정수/실수 -> 문자열
		String age5 = String.valueOf(age3); 
		String age6 = age4+"";
		
		//문자열 비교
		String id = "admin";
		System.out.println(id);
		String id2 = new String("admin");
		System.out.println(id);
		System.out.println(id == "admin");
		System.out.println(); // ==는 기본자료형에서만 사용하자. 메무리 주소와 비교
		
		System.out.println(id.equals(id2)); // 이러한 형식으로 비교해야함
		
		// 아이디가 admin이면 관리자 출력
		if (id.equals("admin")) {
			System.out.println("관리자");
		}
		
		// 문자열을 앞에 써야함!! 아래 방식이 맞는 방식 왜냐하면 만약 앞이 null이라면 에러가 남. 따라서 문자열을 앞에 넣어야함
		if("admin".equals(id)) {
			System.out.println("관리자");
		}
		
		int x = 10;
		int y = 3;
		System.out.println(x/(double)y);
		System.out.println(x/y); // 몫
		System.out.println(x%y); // 나머지
		
		
		
		

	}

}
