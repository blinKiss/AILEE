package m1to30;

import java.util.Scanner;

public class M1_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int java = sc.nextInt();
		int sum = eng + math + java;
		int avg = (eng + math + java) / 3;
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("자바 점수 : " + java);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);

		sc.close();
	}
}
