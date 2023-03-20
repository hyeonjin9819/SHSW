package ch04.test;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum = 0;
		
		for (i=1; i<101; i++) {
			if (i%3 ==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
