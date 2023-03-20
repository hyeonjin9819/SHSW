package ch06.practice.omok;

public class Board {
	int num;
	int asciNum;
	int cnt;
	
	int size;
	String[][] map;

	Board(int size) {
		this.size = size;
		map = new String[size+2][size+2];
		for (int row = 0; row < size+1; row++) {
			for (int col = 1; col < size+1; col++) {
				map[row][0] = String.valueOf(row);
				map[row][col] = ".";
				char asciCh = (char)(64+col);
				map[size-1][col] = String.valueOf(asciCh);
			}
		}
	}
	
	public void change(int num, int asciNum, int cnt) {
		// cnt가 2의 배수면 사람
		if (cnt %2 ==0) {
			map[num][asciNum-64] = "O";
		}else { // 아니면 컴퓨터
			map[num][asciNum-64] = "X";
		}
		
	}
	

	public void print() {
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
			
				System.out.print(" " + map[row][col]);
			}
			System.out.println();
		}
	}

}
