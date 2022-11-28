package noob;

import java.util.Scanner;

public class Level1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n ; i++) {
			// i : 1
			// i : 2
			// i : 3
			// i : 4
			// i : 5
			
			for (int j = 1; j < i; j++) {
				// 공백
				// i : 1, j : x
				// i : 2, j : 1
				// i : 3, j : 1 2
				// i : 4, j : 1 2 3
				// i : 5, j : 1 2 3 4 5
				System.out.print("&");
			}
			
			for (int k = 1; k <= (n+1)-i; k++) {
				// "*"
				// i : 1, k : 1 2 3 4 5
				// ~
				// i : 5, k : 1
				System.out.print("*");
			}
			
			System.out.println();
		}
		sc.close();
	}
}
