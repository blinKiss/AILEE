package m1to30;

import java.util.Scanner;

public class M02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int h = 0; // 홀수
		int j = 0; // 짝수
		int y = 0; // 약수
		while (a <= N) {
			if (a % 2 == 1) {
				h += a;
			} else {
				j += a;
			}
			a++;
		}
		
		// 약수
		{
	        if(N <= 100)
	        for(int i = 1; i <= N; i++)
	        {
	            if(num % i == 0)
	                result += i+" ";
	        }
	        return result;
	    }

		System.out.println(h);
		System.out.println(j);
		System.out.println(y);

		sc.close();
	}
}
