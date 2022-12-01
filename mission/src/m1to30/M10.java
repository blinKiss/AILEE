package m1to30;

import java.util.Scanner;

public class M10 {
		
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		// (입력금액 - input), (화폐매수 - count), (화폐단위 - money)
		int input;
		int count;
		int money = 50000; // 큰 화폐단위부터 시작
		boolean sw = true; // 화폐단위 변환 스위치 변수
		
		// 2. 
		System.out.print("금액 : ");
		input = sc.nextInt();
		
		while(money >= 1) {
		
			// 3-1. 화폐매수 계산
			//     (화폐매수) = (입력금액) / (화폐단위)
			count = input / money;

			// 3-2. 잔액 계산
			// (잔  액) = (입력금액) - (화폐단위x화폐매수)
			// (잔  액) = (입력금액) % (화폐단위)
			// input = input - (money*count);
			input = input % money;	
			
			// 3-3. 화폐단위 변환
			// (화폐단위) = (화폐단위 /5)
			// (화폐단위) = (화폐단위 /2)
			if( sw ) {
				money = money / 5;
				sw = false;
			} else {
				money = money / 2;
				sw = true;
			}

			System.out.println(money + "\t : " + count + "개");

		}
		
		
		sc.close();
		}
		
		

}
