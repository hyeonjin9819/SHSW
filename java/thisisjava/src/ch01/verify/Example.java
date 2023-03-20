package ch01.verify;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("개발자가 되기 위한 필수 개발 언어 Java");
		
		int age;
		int 나이;
		// 카멜표기법
		int shinhanStudentMathScore;
		// 스네이크표기법
		int shinhan_student_math_score;
		//System.out.println(age); // 초기화 하지 않으면 사용 불가
		age = 10; // 초기화
		System.out.println(age); // 초기화 했기 때문에 사용 가능
		
		int age2 = 10; // 선언과 초기화를 동시에
		System.out.println(age2);
		
		age2 = age;
		
	}

}
