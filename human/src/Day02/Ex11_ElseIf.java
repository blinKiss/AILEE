package Day02;

import java.util.Scanner;

public class Ex11_ElseIf {
	
	public static void main(String[] args) {
		// 도전
		// 정수를 하나 입력받아서,
		// 90이상이면 A
		// 80이상이면 B
		// 70이상이면 C
		// 60이상이면 D
		// 60미만이면 F
		// 학점
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수는? ");
		int input = sc.nextInt();
		String result = "";
		
		if(input >= 90) 
			result = "A";
		else if(input >= 80) 
			result = "B";		
		else if(input >= 70) 
			result = "C";		
		else if(input >= 60) 
			result = "D";		
		else 
			result = "F";
		System.out.println("학점은 " + result + " 입니다.");
		
		sc.close();

		
	}
}
