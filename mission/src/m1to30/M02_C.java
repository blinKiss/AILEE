package m1to30;

import java.util.Scanner;

public class M02_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

			int N = sc.nextInt();
			int h = 0; // 홀수
			int j = 0; // 짝수

			if (1 <= N && N <= 100) {

				for (int i = 1; i <= N; i++) {
					if (i % 2 == 1) {
						System.out.print(i);
						h += i;
						if (i < N - 1) {
							System.out.print("+");
						}
					}

				}
				System.out.println("=" + h);

				for (int i = 1; i <= N; i++) {
					if (i % 2 == 0) {
						System.out.print(i);
						j += i;
						if (i < N - 1) {
							System.out.print("+");
						}
					}

				}
				System.out.println("=" + j);
				/*
				 * while (a <= N) { if (a % 2 == 1) { System.out.print(h + "+"); h += N; } else
				 * { System.out.print(j + "+");
				 * 
				 * j += N; } a++; }
				 */
				// 약수
				{

					for (int i = 1; i <= N; i++) {
						if (N % i == 0)
							System.out.print(i + " ");
					}

				}
			}
			sc.close();
		
	}
}
