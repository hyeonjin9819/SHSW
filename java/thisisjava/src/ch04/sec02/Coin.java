package ch04.sec02;

public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*2);

		// equals는 문자열
		if (num == 0) {
			System.out.println("앞이 나왔습니다");
		} else {
			System.out.println("뒤가 나왔습니다");
		}
		
		

	}

}
