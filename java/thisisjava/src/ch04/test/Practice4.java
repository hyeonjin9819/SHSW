package ch04.test;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice1 =0;
		int dice2 = 0;
		boolean run = true;
		
		while(run) {
			dice1 = (int)(Math.random()*6)+1;
			dice2 = (int)(Math.random()*6)+1;
			System.out.println("("+dice1 + "," + dice2 + ")");
			if (dice1 + dice2 == 5) {
				run = false;
			}
			
		}

	}

}
