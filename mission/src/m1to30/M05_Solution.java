package m1to30;

import java.util.Scanner;

public class M05_Solution {

	public static void showMenu() {
		System.out.println("********** 치킨 메뉴판 **********");
		System.out.println("1.황금올리브 반반한 치킨");
		System.out.println("2.뿌잉클 치킨");
		System.out.println("3.처갓집에서 호식이가 만든 치킨");
		System.out.println("0.    종료");
		System.out.print("********** 번호 : ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String menu = "";
		int menuNo = 0;
		int cnt = 0;

		while (true) {
			showMenu();
			menuNo = sc.nextInt();
			if (menuNo == 0)
				break;
			switch (menuNo) {
			case 1:
				menu = "황금올리브 반반한 치킨";
				break;
			case 2:
				menu = "뿌잉클 치킨";
				break;
			case 3:
				menu = "3.처갓집에서 호식이가 만든 치킨";
				break;
			default:
				break;
			}
			if (menuNo >= 1 && menuNo <= 3) {
				System.out.println("'" + menu + "'" + "이(/가) 주문되었습니다.\n");
				cnt++;
			} else
				System.out.println("(0~3) 사이의 번호를 입력해주세요.\n");
		}

		System.out.println("\n총 " + cnt + "개의 상품이 주문되었습니다.");
		sc.close();
	}
}
