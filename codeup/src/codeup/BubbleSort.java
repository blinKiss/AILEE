package Sorts;

import java.util.Scanner;

// 인접한 두 원소를 검사하여 자리를 바꿔가며 정렬하는 방식
// 배열을 하나 만든다
// [1][3][2][5][4]
// 맨 앞 하나의 숫자를 계속 뒤에 숫자와 대소 비교를 하여 만약 크다면 뒤에 숫자와 위치를 바꾼다
// 앞 숫자가 뒤 숫자보다 작다면 그 뒤에 숫자부터 다시 대소비교를 한다
// 이 방식을 계속 로테이션을 돌린다
// 결과
// [1][2][3][4][5]
// [0][1][2][3][4][][]
public class BubbleSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr [] = new int [N];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// 교환
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp; 
				}
			}
		}	

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
			
	sc.close();	
	}
}
