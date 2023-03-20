package ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int charCode = 'A';
		//int charCode = 'a';
		int charCode = '5';
		
		if((65<=charCode) & (charCode <=90)) {
			System.out.println("대문자이군요.");
		}
		
		if((97<=charCode) & (charCode <=122)) {
			System.out.println("소문자이군요.");
		}
		
		if((48<=charCode) & (charCode <=57)) {
			System.out.println("0~9 숫자이군요.");
		}
		
		// -------------------------------------------------
		
		//int value = 6;
		int value = 7;
		
		if((value%2 ==0) | (value %3 ==0)) {
			System.out.println("2또는 3의 배수이군요.");
		}
		
		boolean result = (value%2 ==0) || (value%3==0);
		if(!result) {
			System.out.println("2또는 3의 배수가 아니군요.");
		}
		
		// &&와 &의 차이 (||와 |) -> shortcut
		//두개 짜리 -> 앞 뒤 다 확인하지 않고 이미 확실히 결과가 나오면 그 이후는 확인하지 않음 (약간 백트래킹..?)
		String a = null;
		if (3 == 1 && a.equals("admin")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (3 == 1 & a.equals("admin")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
