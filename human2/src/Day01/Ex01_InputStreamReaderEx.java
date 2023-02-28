package Day01;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01_InputStreamReaderEx {

	public static void main(String[] args) {
		
		// 문자 스트림 클래스 - 키보드로부터 문자 입력
		InputStreamReader isr = new InputStreamReader(System.in);
		
		while(true) {
			char ch = 0;
			try {
				ch = (char) isr.read(); // 입력 스트림으로부터 하나의 문자를 읽음
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(ch == -1) {
				break;
			}
			System.out.println(ch);
		}
		
	}
}
