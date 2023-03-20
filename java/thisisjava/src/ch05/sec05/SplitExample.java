package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		
		String[] tockens = board.split(",");
		
		System.out.println("번호: "+ tockens[0]);
		System.out.println("제목: "+ tockens[1]);
		System.out.println("내용: "+ tockens[2]);
		System.out.println("성명: "+ tockens[3]);
		System.out.println();
		
		for (int i=0; i<tockens.length; i++) {
			System.out.println(tockens[i]);
		}

	}

}
