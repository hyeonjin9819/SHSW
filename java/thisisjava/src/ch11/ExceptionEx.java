package ch11;

import java.io.FileInputStream;
import java.io.IOException;


public class ExceptionEx {

	public static void main(String[] args) {
		try (
				FileInputStream fis = new FileInputStream("");
				FileInputStream fis2 = new FileInputStream("");
				FileInputStream fis3 = new FileInputStream("");
		) {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		FileInputStream fis = null;
		try {
			Class.forName("java.lang.String"); // "java.lang.String"
			fis = new FileInputStream("");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {fis.close();} catch (IOException e) {}
		}
		
		System.out.println("-----------------");
		System.out.println("시작");
		try {
			System.out.println(3 / 0); // ArithmeticException 예외 발생 (0으로 나눌 수 없음) -> 바로 catch문 실행
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[4]);
			System.out.println("출력");
		} catch (Exception e) {
			System.out.println("예외발생");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			// 예외가 발생하던 안하던 무조건 실행
			// 리소스 자원을 해제할 때 거의 다 씀 (자원을 효율적으로 사용하기 위해)
			System.out.println("무조건 실행");
			//try {file.close(); } catch (Exception e) {}
		}

//		catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
		 // System.out.println(e.getMessage());
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 오류");
//		}

		System.out.println("끝");

	}

}
