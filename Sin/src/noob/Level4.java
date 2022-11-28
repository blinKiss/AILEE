package noob;

import java.util.Scanner;

public class Level4 {
	
	public static void main(String[] args) {
		
		int count = 0;
		int pickmenu = 0;
		String menuName = "";
		Scanner candp = new Scanner(System.in);
		do {
			System.out.println("####### 메 뉴 판 #######");
			System.out.println("1. 교촌 - 허니콤보치킨");
			System.out.println("2. BBQ - 황금올리브치킨");
			System.out.println("3. 도미노피자");
			System.out.println("4. 시장통닭");
			System.out.println("0. 종료");
			System.out.print("메뉴번호 : ");
			
			pickmenu=candp.nextInt();
			
			switch (pickmenu) {
				case 1: menuName = "교촌 - 허니콤보치킨";
						break;
				case 2: menuName = "BBQ - 황금올리브반반치킨";
						break;
				case 3: menuName = "도미노피자";
						break;
				case 4: menuName = "시장통닭";
						break;
				default:menuName="종료";
						break;
			}
			if(pickmenu != 0) {
				System.out.println(menuName + "(이)가 주문 되었습니다");
			}
		} while (pickmenu != 0);
		System.out.println(count + "개의 주문을 완료하였습니다.");
		
		candp.close();
	}


}