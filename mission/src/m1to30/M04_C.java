package m1to30;

import java.util.Scanner;

public class M04_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int a[] = new int [n];
//		
//		for (int i = 0; i < args.length; i++) {
//			a[i] = sc.nextInt();
//		}
//		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i*2 +1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
