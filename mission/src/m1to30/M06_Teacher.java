package m1to30;

import java.util.Arrays;
import java.util.Scanner;

public class M06_Teacher {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 게임?");
//		Random random = new Random();
//		random.nextInt();
		int lotto[] = new int[6];
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			System.out.print("[" + (i+1) + " 게임] : ");
			
			for (int j = 0; j < 6; j++) {
				// (int) (Math.random() * [개수] + 시작숫자)
				int random = (int)(Math.random() * 45 + 1);
				lotto[j] = random;
							
			// 중복제거
			for (int k = 0; k < lotto.length; k++) {
				if( j == k ) continue;
				if(random == lotto[k]) {
					j--;
					break;
				}
				
			}
		}
		// 오름차순 정렬
		Arrays.sort(lotto);
		
		for (int j = 0; j < lotto.length; j++) {
			System.out.print(lotto[j] + " ");
		}
			System.out.println();
		}
		sc.close();
	}
	
}
		
		
