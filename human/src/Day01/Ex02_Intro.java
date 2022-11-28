package Day01;

import java.util.Scanner;

public class Ex02_Intro {

	public static void main(String[] args) {

		// sysout : ctrl + space
		System.out.println("이름, 주소, 자기소개를 공백을 두고 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String na = sc.next();
		System.out.println("이름 : " + na);
		
		String ad = sc.next();
		System.out.println("주소 : " + ad);

		String ir = sc.next();
		System.out.println("자기소개 : " + ir);
		
		System.out.println("나이, 키를 공백을 두고 입력하세요.");
		int ag = sc.nextInt();
		System.out.println("나이 : " + ag);
		
		double ht = sc.nextDouble();
		System.out.println("키 : " + ht);
			
		sc.close();
		
	}

}
