package m1to30;

import java.util.Scanner;

public class M07_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5]; // 90 35 75 100 65 
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		sc.close();
	}
}
