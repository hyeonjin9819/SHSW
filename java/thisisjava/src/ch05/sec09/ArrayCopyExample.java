package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i =0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + " ");
		}
		System.out.println();
		System.out.println("<Arrays>");
		String[] arr = Arrays.copyOf(oldStrArray, 6);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 향상된 for문 (Index 필요 없을 때 사용) -> 성능의 향상은 아님
		for(String s: arr) {
			System.out.println(s);
		}
		
	}

}
