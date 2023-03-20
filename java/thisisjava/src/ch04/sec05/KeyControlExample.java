package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1. 증속 | 2. 감소 | 3. 중지");
			System.out.println("--------------------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine();
			
		
			if("1".equals(strNum)) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			}else if("2".equals(strNum)) {
				speed--;
				System.out.println("현재속도 = " + speed);
			}else if("3".equals(strNum)) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

}
