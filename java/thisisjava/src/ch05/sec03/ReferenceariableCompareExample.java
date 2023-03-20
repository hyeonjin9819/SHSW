package ch05.sec03;

public class ReferenceariableCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);

		// 기본 자료형
		int a = 1;
		int b = a;
		b = 2;
		System.out.println(a);

		//참조 자료형
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		arr2[0] =4;
		System.out.println(arr3[0]); // arr2와 arr3이 같은 주소를 저장하고 있기 때문에 arr2를 바꾸면 arr3도 바뀐다.
		
	}

}
