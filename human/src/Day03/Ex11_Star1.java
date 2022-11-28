package Day03;

import java.util.Scanner;

public class Ex11_Star1 {
	
	public static void main(String[] args) {
		// 자연수 n을 입력받아, 삼각형 모얌의 "*"을 출력하시오.
		// 입력 : 5
		// 출력 :
		// *
		// **
		// ***
		// ****
		// *****
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			
			}
			System.out.println();
			
		}
		
		sc.close();
	}

}
