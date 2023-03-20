package ch06.sec09.exam03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		// 캡슐화로 인해 오류가 남
		//myCar.gas = 5;
		myCar.setGas(5);
		// Java는 원래 타입이 일치해야함. 그러나 setGas에 오버로딩을 해놨기 때문에 String 형태도 가능한 것이다. 예시) println
		myCar.setGas("5");
		
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			
			myCar.run();
		}
		System.out.println("gas를 주입하세요.");

	}

}
