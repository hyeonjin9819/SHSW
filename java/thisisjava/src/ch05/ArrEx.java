package ch05;

public class ArrEx {

	public static void main(String[] args) {
		// 다차원 배열 (2차원 이상)
		// 배열 안에 배열..
		int[][] number = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		// 길이
		System.out.println(number.length);
		// number의 0번 인덱스 {1,2,3}
		for (int i = 0; i<number[0].length; i++) {
			System.out.println(number[0][i]);
		}
		int[] arr = number[0]; // {1,2,3}
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 전체 출력
		System.out.println("전체출력");
		for (int i = 0; i<number.length; i++) {
			for(int j = 0; j<number[i].length; j++) {
				System.out.println(number[i][j]);
			}
		}
		System.out.println(number[1][1]);

	}

}
