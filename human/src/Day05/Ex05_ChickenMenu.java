package Day05;

import java.util.Scanner;

/*
  ####### 치킨 메뉴판 #######
  1. 교촌 - 허니콤보치킨
  2. BBQ - 황금올리브반반
  3. 도미노피자
  4. 시장통닭
  0. 종료
  ####### 입력 : 
  
  메뉴번호에 따라 메뉴 변수에 해당메뉴를 저장해주고,
  "(해당메뉴) 가 주문되었습니다" 라고 출력하시오.
  0 을 입력하기 전까지 반복하고,
  0 을 입력하면 반복을 종료합니다.
  종료 시, "?개의 주문을 완료하였습니다." 라고 출력하시오.
*/
public class Ex05_ChickenMenu {
	
	// 메소드 : 코드의 모음
	// -메소드 정의
	// [접근지정자] (static) [반환타입] [메소드명]( 매개변수1, 매개변수2 ) {  }
	// -메소드 호출
	// 메소드명( 인자1, 인자2 );
	public static void showMenu() {
	// 메뉴판 출력
	// 들여쓰기 : tab
	// 내어쓰기 : shift + tab
	// 코드정리 : ctrl + shift + F
	System.out.println("####### 메 뉴 판 #######");
	System.out.println("1. 교촌 - 허니콤보치킨");
	System.out.println("2. BBQ - 황금올리브치킨");
	System.out.println("3. 도미노피자");
	System.out.println("4. 시장통닭");
	System.out.println("0. 종료");
	System.out.print("#######입력 : ");
}
	public static void main(String[] args) {
		// 변수 선언
		int count = 0;
		int menuNo = 0;			// 메뉴번호
		String menuName = "";	// 메뉴이름
		
		Scanner sc = new Scanner(System.in);
		
		do {
			// 메소드 호출
			showMenu();
			menuNo = sc.nextInt();
			// 종료
			if(menuNo == 0) break;
			
			// if, switch ?
			switch( menuNo ) {
				case 1: menuName = "허니콤보치킨";
					break;
				case 2: menuName = "황금올리브반반치킨";
					break;
				case 3: menuName = "도미노피자";
					break;
				case 4: menuName = "시장통닭";
					break;
				default:menuName = "(선택안함)";
					break;
			}
						
			// 유효성 검사
			// - 메뉴번호는 0번~4번까지만 가능
			if ( menuNo >= 0 && menuNo <= 4) {
				count++;
				System.out.println(menuName + "이 주문되었습니다.");
				
				
			} else { 
				System.out.println("0~4번 사이의 숫자를 입력해주세요.");
			}
			
				
		} while(true);{
			
		
		
		}
		
		System.out.println(count + "개의 주문을 완료하였습니다.");
		sc.close();
		
		}
	}

		
			
	


	


		
		
		
	

