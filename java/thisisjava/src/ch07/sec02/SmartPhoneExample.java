package ch07.sec02;

public class SmartPhoneExample extends Object {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		// java.lang 패키지에 있는 것들은 import하지 않아도 됨 -> ex) System, Object...
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		
		System.out.println("와이파이 상태: " + myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요.");
		myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		myPhone.sendVoice("아~ 네, 반갑습니다.");
		
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();
		
		int a = 0;
		double b = a; // 자동 형변환
		Phone p = myPhone; // 자동형변환
		// 자식에서 추가된 메서드 실행안됨
		// p.internet(); -> Phone에는 internet이 없으니까 사용 불가
		
		// 자식에서 재정의된 메서드는 됨
		p.sendVoice("안녕"); // 나: 로 나옴  
		
		
		Phone p2 = new Phone();
		//SmartPhone c2 = (SmartPhone)p2; // 강제 형변환 -> 오류
		SmartPhone c3 = (SmartPhone)p; // 강제형변환 -> 오류 안남
		// 강제형변환의 조건: 자식 -> 부모 형변환된 객체만 가능!
		
		Object obj = new Phone();
		Object obj2 = new SmartPhone("갤럭시", "은색");
		Object obj3 = new SmartPhoneExample();
		
		// 다형성 (타입이 달라져 -> 실행코드는 하나지만 결과가 달라지는)
		Phone[] objArr = {myPhone, p, p2, c3};
		for (int i=0; i<objArr.length; i++) {
			objArr[i].sendVoice("안녕");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
