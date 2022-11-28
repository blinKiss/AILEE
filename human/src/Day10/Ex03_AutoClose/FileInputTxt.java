package Day10.Ex03_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTxt {

	public static void main(String[] args) {

		// 스트림
		// : 실제 입력이나 출력이 표현된 데이터의 흚

		// 입력 받을 수 있는 데이터
		// : 키보드로부터 입력한 키, 파일

		// [프로그램] <- [스트림] <- (키보드), (파일)

		// 입력 스트림 클래스 : InputStream
		// 파일 입력 스트림 클래스 : FileInputStream

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.txt");

			int read = 0;

			// fis.read() : .txt파일의 한글자씩 데이터 읽어오는 메소드
			//               더이상 읽어올 데이터가 없으면 -1을 반환
			while ( (read = fis.read()) != -1) {
				System.out.print( (char) read);
			}
			
		} 
		catch (FileNotFoundException e) {
			// 예외 발생 원인을 찾아 단계별로 예외 메세지를 출력
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다");
		} 
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("입출력 관련 예외 발생");
		} finally {

			if (fis != null) {
				try {
					fis.close(); // FileInputStream 객체 자원 해제
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
