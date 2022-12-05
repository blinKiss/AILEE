package Day04;

import java.util.Scanner;

/*
  하나의 정수N을 입력받아 다으과 같이 작성하시오.
  지그재그로 출력하시오.
  N이 5라면 다음과 같이 출력한다.
  
  01 02 03 04 05
  10 09 08 07 06
  11 12 13 14 15
  20 19 18 17 16
  21 22 23 24 25
*/

public class Ex09_Zigzag_Debug {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		// NxN 2차원 배열 선언
		int arr[][] = new int[N][N];
		
		int k = 1;		// 증가하는 수
		int sw = 1;		// 방향 전환 수
		for (int i = 0; i < N; i++) {
			
			// sw : 1 --> 좌에서 우로
				if(sw == 1) {
					for (int j = 0; j < N; j++) {
						System.out.println("i : " + i + ", j : " + j + ", k : " + k);
						arr[i][j] = k++;
						
					}
				}
				
				// sw : -1 --> 우에서 좌로
				if(sw == -1) {
					for (int j = N-1; j >= 0; j--) {
						System.out.println("i : " + i + ", j : " + j + ", k : " + k);
						arr[i][j] = k++;
					}
				}
				// 방향 전환
				sw *= -1;   //sw = sw * (-1);
			}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
