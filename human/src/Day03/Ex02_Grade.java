package Day03;

import java.util.Scanner;

public class Ex02_Grade {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		// A, B, C, D, E, F
		System.out.println("학점 : ");
		// sc.next() 		--> (String)
		// toUpperCase() 	--> 대문자로 변환
		// charAt(0)       	--> 문자열에서 문자를 해당 index에 추출 --> (char)
		// "ABC"			--> A(0), B(1), C(2)	
		char grade = sc.next().toUpperCase().charAt(0);
		
		switch (grade) {
			case 'A':
			System.out.println("90~100점입니다.");
				break;
			case 'B':
			System.out.println("80~89점입니다.");
				break;
			case 'C':
			System.out.println("70~79점입니다.");
				break;
			case 'D':
			System.out.println("60~69점입니다.");
				break;
			case 'F':
			System.out.println("60점 미만입니다.");
				break;

			default: 
			System.out.println("A~F 사이의 문자를 입력해주세요.");
				break;
		}
		sc.close();
		
		
		
		
	}

}
