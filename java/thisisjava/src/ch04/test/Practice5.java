package ch04.test;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y; // 10이하의 자연수
		for (x=1; x<=10; x++) {
			for(y = 1; y<=10; y++) {
				if(4*x + 5*y == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}

	}

}
