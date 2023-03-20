package ch06.ch20;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account[] account = new Account[100]; // 100개의 계좌 자리 생성
		boolean flag = true;
		int idx = 0;

		while (flag) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");
			String chooseNum = scanner.nextLine();

			if ("1".equals(chooseNum)) {
				System.out.println("---------");
				System.out.println("계좌생성");
				System.out.println("---------");

				System.out.print("계좌번호: ");
				String accountNum = scanner.nextLine();

				System.out.print("계좌주: ");
				String name = scanner.nextLine();

				System.out.print("초기입금금액: ");
				int price = Integer.parseInt(scanner.nextLine());

				Account acc = new Account(accountNum, name, price);
				account[idx] = acc;
				idx += 1;
			} else if ("2".equals(chooseNum)) {
				System.out.println("---------");
				System.out.println("계좌목록");
				System.out.println("---------");
				for (int i = 0; i < idx; i++) {
					System.out.println(
							account[i].getAccountNum() + "\t" + account[i].getOwner() + "\t" + account[i].getPrice());
				}
			} else if ("3".equals(chooseNum)) {
				System.out.println("---------");
				System.out.println("예금");
				System.out.println("---------");
				System.out.print("계좌번호: ");
				String accountNum = scanner.nextLine();
				System.out.print("예금액: ");
				int price = Integer.parseInt(scanner.nextLine());
				for (int i = 0; i < idx; i++) {
					if (account[i].getAccountNum().equals(accountNum)) {
						account[i].setPrice(account[i].getPrice() + price);
					}
				}

			} else if ("4".equals(chooseNum)) {
				System.out.println("---------");
				System.out.println("출금");
				System.out.println("---------");
				System.out.print("계좌번호: ");
				String accountNum = scanner.nextLine();
				System.out.print("예금액: ");
				int price = Integer.parseInt(scanner.nextLine());
				for (int i = 0; i < idx; i++) {
					if (account[i].getAccountNum().equals(accountNum)) {
						if (account[i].getPrice() - price <0) {
							System.out.println("잔고가 부족합니다.");
						}else {
							account[i].setPrice(account[i].getPrice() - price);
						}
						
					}
				}
			} else if ("5".equals(chooseNum)) {
				flag = false;
			}
		}
	}
}
