package Day01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex08_FileCopy {

	/**
	 * 바이트 단위로 파일 복사
	 * 
	 * @param originFile
	 * @param copyFile
	 */
	public static void fileByteCopy(File originFile, File copyFile) {
		// originFile : 원본 파일
		// copyFile : 사본 파일
		try {
			FileInputStream fis = new FileInputStream(originFile); // 입력 스트림
			FileOutputStream fos = new FileOutputStream(copyFile); // 출력 스트림

			int data;

			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			fis.close();
			fos.close();
			System.out.println("파일 복사를 완료하였습니다");
			System.out.println(originFile.getName() + " → " + copyFile.getName());
		} catch (Exception e) {
			System.err.println("파일 복사 중, 예외가 발생하였습니다");
			e.printStackTrace();
		}

	}
	
	/**
	 * 파일 복사
	 * @param originFile
	 * @param copyFile
	 */
	public static void fileCopy(File originFile, File copyFile) {
		// originFile : 원본 파일
		// copyFile : 사본 파일
		try {
			FileInputStream fis = new FileInputStream(originFile); // 입력 스트림
			FileOutputStream fos = new FileOutputStream(copyFile); // 출력 스트림

			// 버퍼
			byte[] buffer = new byte[1024]; // 1kb 단위 버퍼
			
			int data;
			
			while ((data = fis.read(buffer)) != -1) { // 1kb씩 파일 입력
				
				fos.write(buffer, 0, data); // 1kb씩 파일 출력
			}
			fis.close();
			fos.close();
			System.out.println("파일 복사를 완료하였습니다");
			System.out.println(originFile.getName() + " → " + copyFile.getName());
		} catch (Exception e) {
			System.err.println("파일 복사 중, 예외가 발생하였습니다");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("원본 파일 경로 : ");
		String origin = sc.nextLine();

		System.out.print("사본 파일 경로 : ");
		String copy = sc.nextLine();

		File originFile = new File(origin);
		File copyFile = new File(copy);

//		fileByteCopy(originFile, copyFile);
		fileCopy(originFile, copyFile);
		sc.close();
	}
}
