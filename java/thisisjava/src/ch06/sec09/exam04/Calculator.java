package ch06.sec09.exam04;

public class Calculator {
	static double pi = 3.141592;
	final int a = 0;
	double areaRectangle(double width) {
		
		return width * width;
	}
	
	// 매번 올러감
	Calculator() {
		System.out.println("생성자 호출");
	}
	
	// 처음 로더가 메모리에 올리는데 그때 딱 한번만 메모리에 올라가고 끝남
	static {
		System.out.println("static 블록");
	}
	// 인스턴스 블록은 매번 올라감. static 실행 후 실행, 인스턴스 블록은 생성자보다 먼저 실행됨
	{
		System.out.println("인스턴스 블록");
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}

}
