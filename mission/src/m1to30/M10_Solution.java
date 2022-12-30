package m1to30;

import java.util.Scanner;

public class M10_Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[100]; 			// 이름
		int[] inputs = new int[100];				// 입력값
		int[][] cnt = new int[100][10];				// 화폐매수
		int [] sum = new int[100];					// 전체 화페매수
		int money = 50000;
		int sw = 0;

		// 입력
		int k = 0;								// 입력횟수 
		do {
			String name = sc.next();
			if( name.equals("QUIT") ) break;
			int input = sc.nextInt();
			
			names[k] = name;
			inputs[k] = input;
			
			k++;
		} while (true);
		
		// 화폐매수 계산
		for (int i = 0; i < k; i++) {
			money = 50000;

			int temp = inputs[i];
			for (int j = 0; j < 10; j++) {
				cnt[i][j] = inputs[i] / money;
				sum[j] += cnt[i][j];
				
				inputs[i] = inputs[i] % money;
				
				if( sw == 0 ) {
					money = money / 5;
					sw = 1;
				} else {
					money = money / 2;
					sw = 0;
				}
			}
			inputs[i] = temp;
		}
		
		
		// 출력
		System.out.println("성명\t출장비\t오만원\t만원\t오천원\t천원\t오백원\t백원\t오십원\t십원\t오원\t일원\t");
		for (int i = 0; i < k; i++) {
			System.out.print(names[i] + "\t");
			System.out.print(inputs[i] + "\t");
			for (int j = 0; j < 10; j++) {
				System.out.print(cnt[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.print("전체 화페매수 : \t");
		for (int i = 0; i < 10; i++) {
			System.out.print(sum[i] + "\t");
		}
		
	}
	
}