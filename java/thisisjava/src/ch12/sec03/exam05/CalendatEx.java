package ch12.sec03.exam05;

import java.util.Calendar;

public class CalendatEx {

	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal1.set(2023, 1, 21); // 월은 1 빼기 -> 0부터 시작
		cal2.set(2023, 2, 15); 

		long diff = cal2.getTimeInMillis()- cal1.getTimeInMillis();
		System.out.println(diff);
	}

}
