package ch05.test;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		int studentNum = 0; // 학생 수 초기화
		int[] scoreArr = {}; // 학생 점수 배열 초기화
		int big = 0; // 최고점수 초기화
		int sum = 0; // 전체 합 초기화
		double avg = 0; // 평균값 초기화

		while (flag) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");

			String selectNum = scanner.nextLine(); // 선택한 숫자

			if ("1".equals(selectNum)) {
				// 학생 숫자
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scoreArr = new int[studentNum]; // 새로운 배열 객체 생성

			} else if ("2".equals(selectNum)) {
				// 배열 입력
				int score;
				if (scoreArr.length == 0) {
					System.out.println("학생 수가 입력되지 않았습니다. 학생 수를 먼저 입력해주세요.");
					continue;
				} else {
					for (int i = 0; i < studentNum; i++) {
						System.out.print("scores[" + i + "]> ");
						score = Integer.parseInt(scanner.nextLine());
						scoreArr[i] = score;
					}

				}
			} else if ("3".equals(selectNum)) {
				// 배열 출력
				if (scoreArr.length == 0) {
					System.out.println("출력할 점수 리스트가 없습니다.");
					continue;
				} else {
					for (int i = 0; i < scoreArr.length; i++) {
						System.out.println("scores[" + i + "] : " + scoreArr[i]);
					}
				}
			} else if ("4".equals(selectNum)) {
				if (scoreArr.length == 0) {
					System.out.println("분석할 점수 리스트가 없습니다.");
					continue;
				} else {
					for (int i = 0; i < scoreArr.length; i++) {
						sum += scoreArr[i]; // 전체 합계 구해놓기
						if (big < scoreArr[i]) {
							big = scoreArr[i];
						}
					}
					avg = (double) sum / studentNum;
					System.out.println("최고 점수 : " + big);
					System.out.println("평균 점수 : " + avg);
				}
			} else if ("5".equals(selectNum)) {
				flag = false;

			} else { // 사용자가 1~5중 어느 값도 입력하지 않은 경우
				System.out.println("잘못된 입력입니다. 1~5까지 중 하나를 선택해주세요.");
				continue;
			}
		}
		System.out.println("프로그램 종료");

	}

}

