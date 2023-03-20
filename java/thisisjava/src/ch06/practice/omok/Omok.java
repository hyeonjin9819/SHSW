package ch06.practice.omok;

import java.util.Scanner;

public class Omok {
	static Scanner scanner = new Scanner(System.in);
	static int size = 19;
	static int chkPeo = 0;
	static int chkCom = 0;

	public static void main(String[] args) {
		
		Player user = new Player("사용자", "O");
		Player computer = new Player("컴퓨터", "X");
		Board board = new Board(19);
		boolean flag = true;
		int cnt = 2;
		while(flag) {
			play(board,user,computer);
			System.out.print("사용자> ");
			char asci = scanner.next().charAt(0);
			int num = Integer.parseInt(scanner.next());
			int asciNum = (int) asci;
			board.change(num, asciNum, cnt);
			cnt += 1;

			play(board,user,computer);
			System.out.print("컴퓨터> ");
			char asci2 = scanner.next().charAt(0);
			int num2 = Integer.parseInt(scanner.next());
			int asciNum2 = (int) asci2;
			board.change(num2, asciNum2, cnt);
			cnt += 1;
			
			victory(board);
			if(chkPeo >=6 || chkCom >= 6) { // 수정 필요
				System.out.println("축하합니다! 승리하셨습니다. 프로그램 종료");
				flag = false;
			}
			
		}
			
		
		
	}
	
	private static void play(Board board, Player user, Player computer) {
		board.print();
		
	}
	
	private static void victory(Board board) {

		for (int i = 0; i<=size; i++) {
			for (int j =0; j<=size; j++ ) {
				if("O".equals(board.map[i][j]) && "O".equals(board.map[i][j+1])) {
					chkPeo += 1;
				}else if("X".equals(board.map[i][j]) && "X".equals(board.map[i][j+1])) {
					chkCom += 1;
				}else if("O".equals(board.map[i][j]) && "O".equals(board.map[i+1][j])) {
					chkPeo += 1;
				}else if("X".equals(board.map[i][j]) && "X".equals(board.map[i+1][j])) {
					chkCom += 1;
				}
			}

		}
		return;
	}

}
