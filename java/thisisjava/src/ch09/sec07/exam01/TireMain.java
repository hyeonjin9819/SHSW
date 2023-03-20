package ch09.sec07.exam01;

public class TireMain {

	public static void main(String[] args) {
		Tire tire1 = new Tire() {
			@Override
			public void roll() {
				System.out.println("타이어1이 굴러갑니다.");
			}
		};
		tire1.roll();
		
		Tire tire2 = ()-> {
			System.out.println("타이어2 굴러갑니다.");
		};
		tire2.roll();
	}

}
