package ch05;

public class RefType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 기본 / 참조 자료형
		 * 참조자료형: 변수에는 메모리 주소값 저장 (저장된 위치값)
		 * - 배열, 클래스, 인터페이스 등
		 * - 동등비교 (== , !=)를 하는 경우에는 메모리 주소값으로 비교한다. (저장된 값으로 비교하는게 아님!)
		 * - null(참조하는 주소가 없는 경우)이 가능하다.
		 * 
		 */
		// 객체 비교
		RefType rt = new RefType(); // 객체 생성
		RefType rt2 = new RefType(); // 객체 생성
		System.out.println(rt == rt2); // 결과값: false => rt와 rt2의 Type은 같다. 하지만 다른 객체이기 때문에 false. 객체는 모두 참고자료형
		RefType rt3 = rt2; // 객체 생성
		System.out.println(rt3 == rt2); // 결과값: true => 같은 번지이기 때문에 두 변수는 heap영역에 같은 위치를 가리키는 참조하는 상태가 된다. 따라서 비교시 true 출력
		
		/*
		 * String
		 * - 동등비교 시 반드시 equals() 메서드 사용하기
		 * - 불변(immutable) -> 만약 바꾸고 싶다면 문자열이 바뀌는게 아니라 새로운 메모리 공간을 차지하는 문자열이 새로 생기는 것이다. (느려짐)
		 * - 기능(메서드) : split, replace, indexOf, substring, valueOf(다른 타입을 String으로 바꿔주는 것)
		 */
		String text = "안녕하세요, 저는 홍길동입니다.";
		String text2 = text.replace(",", "");
		String text3 = text2.replace(" ", "");
		System.out.println(text3);
		
		// 메서드 체이닝
		String text4 = text.replace(",", "").replace(" ", ""); // text.replace(",", "")가 새로운 문자열을 리턴하고 그 리턴한 값에 replace를 진행하는 것
		
		/*
		 * 배열
		 * - 하나의 타입만 가능
		 * - 길이가 정해지면 변경 불가
		 * - 인덱스(순번), 0부터 시작
		 * - for문과 같이 사용: for(int i=0; i<배열변수.length; i++)
		 */
		double[] arr = new double[] {1.2, 1.5, 1};
		//System.out.println(arr[2]);
		
		
		// arr2(길이가 4)
		double[] arr2 = new double[4];
		for (int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		
		
		
		
		
		

	}

}
