package Day04;

import java.util.Scanner;

public class Ex03_Arrays {
	
	public static void main(String[] args) {
		// [][]
		// [][][][]
		// [][][]
		// 2차원 배열 선언 및 생성
		// 비정방 행렬 배열
		int[][] a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[4];
		a[2] = new int[3];

		// 입력
		Scanner sc = new Scanner(System.in);
		// 중첩 반복문(이중 반복문)
		// 바깥 반복문 - 행(i)
		for (int i = 0; i < a.length; i++) {
			// 안 반복문 - 열(j)
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
