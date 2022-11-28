package Day01;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		// [클래스타입] 객체명 = new [클래스명]
		// Scanner 객체 생성
		Scanner	sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		System.out.println( sc.nextInt() );
		
		sc.close();
	}
}
