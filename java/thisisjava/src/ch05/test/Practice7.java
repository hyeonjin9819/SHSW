package ch05.test;

public class Practice7 {

	public static void main(String[] args) {
		int[] array = {1,5,3,8,2};
		
		int big = 0;
		
		for (int arrays: array) {
			if (arrays > big) {
				big = arrays;
			}
		}
		System.out.println(big);

	}

}
