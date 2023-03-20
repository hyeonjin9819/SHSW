package ch18.sec02.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample2 {

	public static void main(String[] args) {
		try {
			Writer os = new FileWriter("D:/test2.txt");
			
			for (int i= 65; i<91; i++) {
				os.write(i);
			}
			os.write("\n");
			os.write("안녕하세요");
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
