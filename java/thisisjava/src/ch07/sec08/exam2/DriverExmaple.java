package ch07.sec08.exam2;

public class DriverExmaple {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
		driver.drive(new Bus());
		System.out.println("----------------------");
		driver.setVehicle(new Bus()); // 객체 주입
		// (Dependency Injection)
		driver.run1();
		driver.openDoor();
		driver.back();
		driver.trunkOpen();
		
		System.out.println(new Bus() instanceof Vehicle);
		System.out.println(new Vehicle() instanceof Vehicle);
		

	}

}
