package ch04.sec05;

public class PrintFrom1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		
		while (i <=10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + "합: " + sum);
	}

}
