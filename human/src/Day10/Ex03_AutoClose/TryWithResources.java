package Day10.Ex03_AutoClose;

import java.io.FileInputStream;

public class TryWithResources {

	public static void main(String[] args) {
		
		// try-with-resources 문
		// : try (자동으로 자원해제할 객체 생성)
		// AutoCloseable 인터페이스를 구현한 클래스여야 자동 자원해제가 가능
		try (FileInputStream fis = new FileInputStream("test.txt")){
			
			int read;
			
			// test.txt 파일을 FileInputStream 으로 읽어와서
			// read() 메소드를 호출하여 한 글자씩 가져온다
			// 가져올 데이터가 없으면 -1을 반환하기 때문에, 반복을 멈춘다
			while( (read = fis.read() ) != -1) {
				System.out.print( (char) read );
			}
			
		} catch (Exception e) {
			System.out.println("예외 발생...");
		
		}
	}
}
