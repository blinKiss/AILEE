package Day10.Ex01_TryCatch;

import java.util.Scanner;

public class DevideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a; // 제수
		int b; // 피제수

		System.out.println("a 입력 : ");
		a = sc.nextInt();

		System.out.println("b 입력 : ");
		b = sc.nextInt();

		// 예외 내용 = java.lang.ArithmeticException: / by zero
		try {
			// 예외 발생 가능성 있는 문장
			System.out.println("a / b = " + a / b);
		} catch (ArithmeticException e) {
			// 예외 발생 시, 예외 처리 문장
			System.out.println("0으로 나누는 것은 수학적으로 정의되지 않습니다");
		}
		// finally 블록은 생략 가능
		finally {
			// 예외 발생 여부와 관곙벗이 실행할 문장
			// 예외 처리와 관련한 문장을 작성(자원 해제 문장등을 작성)
			sc.close();

		}

	}
}
