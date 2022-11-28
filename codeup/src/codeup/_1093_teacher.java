package codeup;

import java.util.Scanner;

public class _1093_teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 출석 번호 부를 횟수 n 입력
		int n = sc.nextInt();
		
		int arr[] = new int[23];
		
		// 2. n개의 무작위로 부른 출석번호 입력
		for (int i = 0; i < n; i++) {
			int index = sc.nextInt();
			// 3. 출석 번호가 불릴 때마다,
			//    출석번호와 매핑된 배열요소의 값을 1 증가
			arr[index]++;
		}
		
		// 4. 23개의 호명 횟수 배열 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		sc.close();
	}
}
