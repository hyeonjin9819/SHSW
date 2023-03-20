package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		for (int i =0; i<ssn.length(); i++) {
//			String one = ssn.substring(i, i+1);
//			System.out.println(one);
			System.out.println(ssn.charAt(i));
		}

	}

}
