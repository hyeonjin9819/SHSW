package ch18;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferEx {

	public static void main(String[] args) throws Exception{
		long start = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("C:/Users/User/Downloads/sqldeveloper-22.2.1.234.1810-x64.zip");
		
		while (fis.read() != -1) {}
		long end = System.currentTimeMillis();
		System.out.println("버퍼 안쓰고 소요시간: " + (end-start));
		
		long start2 = System.currentTimeMillis();
		BufferedInputStream bis = new BufferedInputStream(fis);
		while (fis.read() != -1) {}
		long end2 = System.currentTimeMillis();
		System.out.println("버퍼 쓰고 소요시간: " + (end2-start2));
		
	}

}
