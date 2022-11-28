package Day04;

public class Ex01_Foreach {

	public static void main(String[] args) {
		String week[] = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		
		for (int i = 0; i < week.length; i+=2) {
			System.out.print(week[i] + " ");
		}
			System.out.println();
			
			// foreach 문
			// - 배열 또는 컬렉션등의 모든 요소를 순회하는 반복
			// for( 요소타입 요소명 : [배열/컬렉션] ) { }
			for (String day : week) {
				System.out.print(day + " ");
			}
			System.out.println();
		}
		
	}

