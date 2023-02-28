package Day01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04_FileReadAndWrite {

	public static void main(String[] args) {
		// 직접 입력한 문자를 텍스트 파일로 출력하는 프로그램
		InputStreamReader isr = new InputStreamReader(System.in);
		
		FileWriter fw = null;
		
		int data = 0;
		
		try {
			fw = new FileWriter("test3.txt");
			
			while( (data = isr.read() ) != -1 ) {
				fw.write(data);
			}
			isr.close();
			fw.close();
			
		} catch (IOException e) {
			System.err.println("입출력 시, 예외가 발생하였습니다");
			e.printStackTrace();
		}
		
		
		
	}
}
