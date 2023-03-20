package ch05.sec05;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "신한DS1회차.xlsx";
		int index = fileName.indexOf("."); // lastIndexOf: 끝에서부터 찾는 Index 함수
		
		// 현재 밀리초
		long t = System.currentTimeMillis();
		
		// 확장자
		String extention = fileName.substring(index);

		String newFile = t + extention;
		System.out.println(newFile);
	}

}
