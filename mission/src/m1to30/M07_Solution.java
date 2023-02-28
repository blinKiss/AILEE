package m1to30;

import java.util.Scanner;

public class M07_Solution {
	
	public static void printArr(int[] arr) {
		for (int no : arr) {
			System.out.print(no + " ");
		}
		System.out.println();
	}
	
	/**
	 * 선택정렬 - 오름차순
	 * @param arr
	 */
	public static void sortAsc(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		}
	}
	
	/**
	 * 선택정렬 - 내림차순
	 * @param arr
	 */
	public static void sortDesc(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sortAsc( arr );
		printArr( arr );
		sortDesc( arr );
		printArr( arr );
		
		sc.close();
	}
}