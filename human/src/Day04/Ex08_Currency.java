package Day04;

import java.util.Scanner;

enum Currency {
	DOLLAR(1318), EURO(1361), YEN(9), YUAN(187);
	
	int value;
	private Currency(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
public class Ex08_Currency {

	public static void main(String[] args) {
		System.out.println("1. 달러환율");
		System.out.println("2. 유로환율");
		System.out.println("3. 엔환율");
		System.out.println("4. 위안환율");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		Currency curr;
		
		switch (choice) {
		case 1: curr = Currency.DOLLAR;
				break;
		case 2: curr = Currency.EURO;
				break;
		case 3: curr = Currency.YEN;
				break;
		case 4: curr = Currency.YUAN;
				break;
		default:curr = Currency.DOLLAR;
				break;
		}
		System.out.println("환율은 " + curr.getValue() + " 원 입니다.");
		sc.close();
	}
	
	
}
