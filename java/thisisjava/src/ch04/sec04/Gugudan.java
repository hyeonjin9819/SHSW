package ch04.sec04;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("구구단 스타트!");
		for (int i= 2; i<10; i++) {
			System.out.println("   <" + i + "단>");
			for (int j = 1; j<10; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
				
			}
			
		}

	}

}
