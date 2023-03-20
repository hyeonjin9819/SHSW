package ch06;

public class ClassEx {
	
	// 필드
	int number;
	
//	// 생성자
//	ClassEx(int a) {
//		
//	}
	
	void test () {
		number = 0;
	}
	
	// 실행문은 클래스에 있으면 안됨! 메서드 안에 있어야함
//	if (number == 0) {
//		System.out.println("");
//	} 
	
	// 메서드
	void gugu() {
		for (int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}
	
	void test(int a) {
		
	}

}
