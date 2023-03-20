package ch04.test;
import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int account = 0;

		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			
			String strNum = scanner.nextLine();
			
			
			if("1".equals(strNum)) {
				System.out.print("예금액> ");
				String put = scanner.nextLine();
				account += Integer.parseInt(put);
				System.out.println(account + "원 예금이 완료되었습니다.");

			}else if("2".equals(strNum)) {
				System.out.print("출금액> ");
				String out = scanner.nextLine();
				// 잔고가 0 이하일때는 출금이 불가능해야함
				if (account < Integer.parseInt(out)) {
					System.out.println("출금가능한 잔고가 부족합니다. 다시 처음으로 돌아갑니다.");
					continue;
				}
				account -= Integer.parseInt(out);
				System.out.println(out + "원 출금이 완료되었습니다.");
				
			}else if("3".equals(strNum)) {
				System.out.print("잔고> ");
				System.out.println(account);
				
			}else if("4".equals(strNum)) {
				run = false;
				
			}else { // 사용자가 1~4중 어느 값도 입력하지 않은 경우
				System.out.println("잘못된 입력입니다. 1~4까지 중 하나를 선택해주세요.");
				continue;
			}
		}
		System.out.println("프로그램 종료");


	}

}
