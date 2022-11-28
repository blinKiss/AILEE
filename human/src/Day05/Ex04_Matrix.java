package Day05;

import java.util.Scanner;

public class Ex04_Matrix {

	public static void main(String[] args) {
		// 양의 정수 M과 N을 입력받아 저장하고,
		// M행 N열의 2차원 배열을 생성한다.
		// 각 요소의 값을 입력받고, 그대로 출력하시오.
		// (입력예시)
		// M : 2
		// N : 3
		// 1 2 3 
		// 4 5 6
		// (출력예시)
		// 1 2 3
		// 4 5 6
		// 같은 과정을 한 번 더, X행 Y열로 입력받고 출력하시오.
		// (단, X행Y열의 2차원배열은 foreach 문을 이용하여 출력하시오.)
		Scanner sc = new Scanner(System.in);
		int M, N, X, Y;
		System.out.print("M : ");
		M = sc.nextInt();
		System.out.print("N : ");
		N = sc.nextInt();
		
		// M행 N열의 2차원 배열 선언 및 생성
		int arr[][] = new int[M][N];
		
		// 2차원배열은 이중반복문으로 접근한다
		// 바깥 반복문 변수 i 	: 행 접근
		// 안 반복문 변수 j 	: 열 접근
		// arr.length	 : 행의 크기 : 첫번째 차원
		// arr[i].length : 열의 크기 : 두번째 차원
		// 입력
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
			
				
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		} 
		
		System.out.print("X : ");
		X = sc.nextInt();
		System.out.print("Y : ");
		Y = sc.nextInt();
		
		int arr2[][] = new int[X][Y];
		
		for (int i= 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		// arr2 는 2차원 배열로, 2차원배열의 요소는 1차원 배열
		// row 는 1차원 배열로, 1차원배열의 요소는 int타입의 값
		// for(요소타입 요소명 : 배열) { }
		for (int[] row : arr2) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		sc.close();
		}
	
}

