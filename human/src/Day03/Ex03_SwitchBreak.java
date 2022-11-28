package Day03;

import java.util.Scanner;

public class Ex03_SwitchBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		// 입력받은 정수를 5로 나눈 나머지가
		// 2보다 작으면 "*"
		// 그렇지 않으면 "**" 를 출력하시오
		// (switch case) 문을 사용하시오
		switch (num % 5) {
			case 0:
			case 1:
					System.out.println("*");
					break;
			case 2:
			case 3:
			case 4:
					System.out.println("**");
					break;
					
				

			default:
					System.out.println("나머지가 4보다 큽니다.");
					break;
		}
			sc.close();
	}
}
