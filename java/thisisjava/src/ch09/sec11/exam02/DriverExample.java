package ch09.sec11.exam02;

public class DriverExample {

	public static void main(String[] args) {
		//Driver driver = new Driver();
		
//		Bus bus = new Bus();
//		Taxi taxi = new Taxi();
//		
//		driver.drive(bus); // -> 자동타입변환 -> 오버라이딩 메소드 호출 -> 다형성
//		driver.drive(taxi); // -> 자동타입변환 -> 오버라이딩 메소드 호출 -> 다형성
//		
		Vehicle[] v = {new Bus(), new Taxi(), new Bus(), new Taxi()};
		
		for(Vehicle ve : v) {
			ve.run();
		}
		
//		Object[] v = {new Bus(), new Taxi(), new Bus(), new Taxi()};
//		
//		for(Object ve : v) {
//			Vehicle ve2 = (Vehicle) ve; // Object로 넣기 위해서는 강제 형변환 필요
//			ve2.run();
//		}

	}

}
