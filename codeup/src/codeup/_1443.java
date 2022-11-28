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
		
		for (int i = 0; i < a.length; i++) {
			a[i]=min;
		}
		System.out.println(a[i]);
		sc.close();
	}
}
