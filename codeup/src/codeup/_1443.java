package codeup;

import java.util.Scanner;

public class _1443 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n]; // 7 - 3 9 5 6 2 7 1
		int min;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 1; i < a.length; i++) {
			min = a[i];
			for (int j = i-1; j >= 0; j--) {
				int temp = 0;
				if (a[j]>min) {
					temp = a[j+1];
					a[j+1] = a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);	
		}
		sc.close();
	}
}
