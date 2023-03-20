package ch06.sec09.exam04;

import ch06.sec09.exam03.*;

public class CalculatorExample {

	public static void main(String[] args) {
		System.out.println("main 메서드 시작");
		Calculator myCalcu = new Calculator();
		
		double result1 = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);
		
		System.out.println(Calculator.pi);
		System.out.println(myCalcu.pi);
		
		Calculator myCalcu2 = new Calculator();
		Calculator myCalcu3 = new Calculator();
		Calculator myCalcu4 = new Calculator();
		Calculator myCalcu5 = new Calculator();
		
		Calculator.pi = 4.14;
		System.out.println(Calculator.pi);
		System.out.println(myCalcu.pi); // 객체들끼리 공유한다
		System.out.println(myCalcu2.pi);
		System.out.println(myCalcu3.pi);
		System.out.println(myCalcu4.pi);
		
		//final 필드
		System.out.println(myCalcu4.a);
		//myCalcu4.a = 1;  a가 final이기 때문에 값을변경할 수 없음
		
		// final static 필드 -> 상수
		double d = Math.PI;
		//Math.PI = 4.14; // 파이는 상수이기 때문에 변경 불가 (거의 대문자)

		// 다른 패키지
		Car car = new Car();
		CarExample c2 = new CarExample();
		
		
		
		
		
	}

}
