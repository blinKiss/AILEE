package Day01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02_FileReaderEx {

	public static void main(String[] args) {
		// FileReader ("파일경로");
		FileReader fr = null;
		File file = new File("test.txt");
		try {
//			fr = new FileReader("test.txt"); // 문자열 파일경로로 생성 
			fr = new FileReader (file); // 파일객체를 인자로 생성
			int data = 0;
			
			// read() : 한 문자씩 읽어와서 int 타입으로 반환,
			//          더 이상 읽어올 문자가 없으면 -1 반환
			while( (data = fr.read() ) != -1 ) {
				System.out.print( (char) data);
			}
			System.out.println();
			System.out.println("인코딩 타입 : " + fr.getEncoding() );
			fr.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.err.println("문자 입력 시 예외가 발생하였습니다.");
			e.printStackTrace();
		}
		
	}
}
