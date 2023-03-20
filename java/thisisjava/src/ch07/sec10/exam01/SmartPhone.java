package ch07.sec10.exam01;

public class SmartPhone extends Phone{
	SmartPhone(String owner){
		super(owner);
	}
	
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

	@Override
	void turnOn() {
		System.out.println("스마트폰 전원 켜기");
		
	}

	@Override
	void turnOff() {
		System.out.println("스마트폰 전원 끄기");
		
	}

}
