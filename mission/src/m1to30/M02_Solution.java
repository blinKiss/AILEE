package m1to30;

import java.util.Scanner;

public class M02_Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int oddSum = 0;
		int evenSum = 0;
		
		for (int i = 1; i <= N; i+=2) {
			oddSum += i;
			System.out.print(i);
			if( i >= N-1 ) 	System.out.print("=");
			else			System.out.print("+");
		}
		
		System.out.println(oddSum);
		for (int i = 2; i <= N; i+=2) {
			evenSum += i;
			System.out.print(i);
			if( i >= N-1 ) 	System.out.print("=");
			else			System.out.print("+");
		}
		System.out.println(evenSum);

		for (int i = 1; i <= N; i++) {
			if( N % i == 0 )	
				System.out.print(i);
		if(i!=N)
			System.out.print(" ");
		}
		
		
		
		sc.close();
	}
}