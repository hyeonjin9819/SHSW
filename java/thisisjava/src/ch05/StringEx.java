package ch05;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		// 시작시간
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			str += i;
		}
		
		//종료시간
		long end = System.currentTimeMillis();
		//종료시간-시작시간 = 소요시간
		System.out.println("소요시간: " + (end-start));

	}

}
