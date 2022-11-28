package codeup;

import java.util.Scanner;

public class _1443_Insert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n]; // 5 - 7 4 9 1 6

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 1; i < a.length; i++) {
			int min = a[i];
			int j = i-1;
			while (j >= 0 && a[j] > min) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = min;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}
}
