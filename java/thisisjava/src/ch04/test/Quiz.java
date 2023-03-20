package ch04.test;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		num = (int)(Math.random()*100)+1; // 컴퓨터가 랜덤으로 지정한 수
		int count = 0; // 시도횟수
		Boolean flag= true;
		System.out.println("1~100 사이의 랜덤 숫자가 지정되었습니다. 숫자게임 시작!");
		
		
		while(flag) {
			System.out.print("수를 입력해주세요 >> ");
			String input = scanner.nextLine();
			int intInput = Integer.parseInt(input); // 정수형으로 변환
			count += 1;
			if (intInput == num) {
				System.out.println("맞았습니다! 시도횟수 " + count+ "회");
				flag = false;
			} else if (intInput > 100 || intInput < 0) {
				System.out.println("1부터 100 사이의 값을 입력해주세요. 랜덤숫자는 1부터 100 사이의 값입니다.");
			}
			else if(num < intInput) {
				System.out.println("더 작은 수를 입력하세요.");
			}else if(num > intInput) {
				System.out.println("더 큰 수를 입력하세요.");
			}
		}
		

	}

}
