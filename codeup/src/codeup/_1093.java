package codeup;

import java.util.Scanner;

/*
 * 첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. (1 ~ 10000)
두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력된다.
 */
public class _1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 선생님이 출석 확인할 횟수
		int std[] = new int[23];
		int check = 0; // 출쳌은 0회부터 시작
		for (int i = 0; i < n; i++) {
			check = sc.nextInt(); // 무작위로 부른 출석번호
			std[check - 1] += 1;
		}
		sc.close();

		// 출력
		for (int i = 0; i < std.length; i++) {
			System.out.print(std[i] + " ");
		}

	}

}
