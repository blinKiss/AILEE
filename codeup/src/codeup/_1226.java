package codeup;

import java.util.Scanner;

public class _1226 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 당첨번호 선택번호 배열 선언
		int lotto[] = new int[7];
		int pick[] = new int[6];
		// 변수 선언 : 개수, 등수
		int match = 0;
		int grade = 0;

		// 당첨번호 7개 입력
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = sc.nextInt();
		}

		// 선택번호 6개 입력
		for (int i = 0; i < pick.length; i++) {
			pick[i] = sc.nextInt();
		}

		// 번호 비교
		for (int i = 0; i < pick.length; i++) {
			for (int j = 0; j < pick.length; j++) {
				// 당첨 번호와 선택 번호가 일치하면 수치(match) 증가
				if (pick[i] == lotto[j]) {
					match++;
					break;
				}
			}
		}

		// 개수 확인
		switch (match) {
		case 6:
			grade = 1;
			break;
		case 5:
			grade = 3;
			// 보너스 번호 확인
			for (int i = 0; i < pick.length; i++) {
				// lotto[6] : 보너스 번호
				if (pick[i] == lotto[6]) {
					grade = 2;

				}

			}
			break;
		case 4:
			grade = 4;
			break;
		case 3:
			grade = 5;
			break;
		default:
			grade = 0;
			break;

		}

		System.out.println(grade);
		sc.close();
	}

}
