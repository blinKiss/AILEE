package codeup;

import java.util.Scanner;

public class _1409 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		// 1. 10개의 숫자 입력
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}

		// 2. 출력할 숫자의 순서 k를 입력
		int k = sc.nextInt();

		// 3. k번째 숫자를 출력
		System.out.println(arr[k - 1]);

		sc.close();
	}
}
