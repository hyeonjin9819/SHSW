package ch03;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);
		
		System.out.println("---------------------------------------");
		
		int value= 356;
		System.out.println(value - (value%100));
		System.out.println(value/100*100);
		
		System.out.println("---------------------------------------");
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area1= (lengthTop + lengthBottom) * height /2.0; // 가능
		double area2= (lengthTop + lengthBottom) * height *1.0 /2; // 가능
		double area3= (double)(lengthTop + lengthBottom) * height /2; // 가능
		double area4= (double)((lengthTop + lengthBottom) * height /2); // 불가능
		System.out.println(area1);

	}

}
