package ch05;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String();
		String b =a;
		System.out.println(a == b); // 출력값: true
		a = "안녕"; // String만 예외를 줘서 가능하게 만듬, 메모리의 새로운 저장소에 새롭게 저장시킴 
		System.out.println(a == b); // 출력값: false
		System.out.println(a); // 출력값: 안녕
		System.out.println(b); // 출력값: 
		
		System.out.println("-------------------------");
		
		Str a2 = new Str();
		Str b2 = a2;
		System.out.println(a2 == b2); // 출력값: true
		a2.name = "안녕";
		System.out.println(a2 == b2); // 출력값: true
		System.out.println(b2.name); // 출력값: 안녕

	}

}

class Str {
	String name;
}