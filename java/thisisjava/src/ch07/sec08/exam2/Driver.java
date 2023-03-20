package ch07.sec08.exam2;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
	
	private Vehicle v;
	public void setVehicle(Vehicle v) {
		this.v = v;
	}
	
	public void run1() {
		v.run();
	}
	public void back() {
		v.run();
	}
	public void trunkOpen() {
		v.run();
	}
	public void openDoor() {
		v.run();
	}

}
