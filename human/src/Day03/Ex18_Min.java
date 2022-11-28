package Day03;

import java.util.Scanner;

public class Ex18_Min {
	
	public static void main(String[] args) {
		// 첫째 줄에 입력할 갯수 n을 입력받고,
		// 둘째 줄에는 n개의 정수를 공백을두고 입력받으시오.
		// N개의 정수 중, 최대값을 구하여 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];			// n개의 배열요소 생성
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if( min > arr[i] ) {
				min = arr[i];
			}
		    	
		}
		System.out.println("최소값 : " + min);
		sc.close();
	}

}
