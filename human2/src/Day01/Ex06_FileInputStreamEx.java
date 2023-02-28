package Day01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex06_FileInputStreamEx {

	public static void main(String[] args) {
		byte[] data = new byte[10];	// 10 바이트씩
		
		try {
			FileInputStream fin = new FileInputStream("test.out");
			
			int i = 0, b;
			while ( (b = fin.read()) != -1 ) {
				data[i] = (byte) b;	// 읽어온 바이트 b를 바이트 배열에 형변환하여 대입
				i++;
			}
			for (byte a : data) {
				System.out.print((char)a);
			}
			System.out.println();
			fin.close();
		} catch (IOException e) {
			System.err.println("입출력 시, 예외가 발생하였습니다");
		}
		
		
		
	}
}
