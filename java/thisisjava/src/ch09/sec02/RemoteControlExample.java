package ch09.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		// rc = new RemoteControl(); // 오류남 -> 인터페이스는 객체 생성 불가능 
		rc.turnOn();
		
		rc = new Audio();
		rc.turnOn();
	}

}
