package ch06.ans20;

import java.util.Scanner;

import ch06.ans20.Account;

// main()
// account 배열 생성
//계좌 생성 - 입력(계좌번호, 계좌주, 초기입금액) -> Account 객체 생성 ->값 대입 -> 배열에 저장
//계좌 목록 출력 for(0~ 생성객체까지) 
//예금 계좌번호 입력 -> 해당 계좌번호의 Account객체의 잔액 +
//출금
//종료
public class BankApplication {
	static int size = 0;
	static Account[] account = new Account[100];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");

			String strNum = scanner.nextLine();

			if ("1".equals(strNum)) {
				System.out.println("----------");
				System.out.println("계좌생성");
				System.out.println("----------");
				System.out.print("계좌번호: ");
				String accountNum = scanner.nextLine();

				System.out.print("계좌주: ");
				String name = scanner.nextLine();

				System.out.print("초기입금금액: ");
				int price = Integer.parseInt(scanner.nextLine());
				Account acc = searchAccount(accountNum);
				if(acc == null) {
					account[size] = new Account(accountNum ,name, price);
					++size;
					System.out.println("결과: 계좌가 생성되었습니다.");

				}else {
					System.out.println("이미 존재하는 계좌입니다.");
				}


			} else if ("2".equals(strNum)) {
				System.out.println("----------");
				System.out.println("계좌목록");
				System.out.println("----------");
				for (int i = 0; i < size; i++) {
					System.out.println(account[i].getAccountNum() + "\t" + account[i].getName() + "\t"
							+ account[i].getFirstDeposit());
				}

			} else if ("3".equals(strNum)) {
				System.out.println("----------");
				System.out.println("예금");
				System.out.println("----------");
				System.out.print("계좌번호: ");
				String accountNum = scanner.nextLine();
				System.out.print("예금액: ");
				int addMoney = Integer.parseInt(scanner.nextLine());
				Account acc = searchAccount(accountNum);
				if (acc == null) {
					System.out.println("존재하지 않는 계좌번호입니다.");
				} else {
					acc.setFirstDeposit(acc.getFirstDeposit() + addMoney);
				}
//				for (int i = 0; i < size; i++) {
//					if (accountNum.equals(account[i].getAccountNum())) {
//						int a = account[i].getFirstDeposit();
//						account[i].setFirstDeposit(a + addMoney);
//					}
//				}

			} else if ("4".equals(strNum)) {
				System.out.println("----------");
				System.out.println("출금");
				System.out.println("----------");
				System.out.print("계좌번호: ");
				String accountNum = scanner.nextLine();
				System.out.print("출금액: ");
				int minusMoney = Integer.parseInt(scanner.nextLine());
				Account acc = searchAccount(accountNum);
				if (acc == null) {
					System.out.println("존재하지 않는 계좌번호입니다.");
				} else {
					acc.setFirstDeposit(acc.getFirstDeposit() - minusMoney);
				}
//				for (int i = 0; i < size; i++) {
//					if (accountNum.equals(account[i].getAccountNum())) {
//						int a = account[i].getFirstDeposit();
//						if (a - minusMoney < 0) {
//							System.out.println("잔액이 부족합니다.");
//						} else {
//							account[i].setFirstDeposit(a - minusMoney);
//						}
//						break;
//					}
//				}

			} else if ("5".equals(strNum)) {
				run = false;

			}
		}

		System.out.println("프로그램 종료");
	}
	
	static Account searchAccount(String number) {
		for (int i= 0; i<size; i++) {
			if (number.equals(account[i].getAccountNum())) {
				return account[i];	
			}
		}
		return null;
		
	}

}
