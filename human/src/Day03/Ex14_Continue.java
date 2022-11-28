package Day03;

import java.util.Scanner;

public class Ex14_Continue {
	
	// 5개의 정수를 입력받고,
	// 입력받은 수 중 양수만 합계를 구하여 출력하시오.
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int sum = 0;		// 합계
		
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if( n < 0 )
				continue;
				// 남은 실행문을 무시하고, 다음 반복으로 점프
			
			sum +=n;
			
			
		}
		System.out.println("양수의 합 : " + sum);
		sc.close();	
	}
	
	

}
