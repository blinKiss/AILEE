package codeup;

import java.util.Scanner;

//문제 설명
// 이번에는 데이터의 개수가 n개가 들어오고, n개의 데이터를 거꾸로 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 데이터의 개수 n이 입력된다. ( n <= 1,000 )
// 둘째 줄에 공백을 기준으로 n개 데이터가 입력된다.

// 출력
// n개의 데이터를 입력의 역순으로 출력한다.

// 입력 예시   
// 5
// 1 3 5 6 8

// 출력 예시
// 8 6 5 3 1
public class _1402 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		// 입력
		// 시작 : 0
		// 종료 : N-1
		// 증가
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 출력
		// 시작 : N-1
		// 종료 : 0
		// 감소
		for (int i = N-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}

