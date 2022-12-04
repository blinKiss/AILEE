package m1to30.M30;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		Scanner sc = new Scanner(System.in);
		
		calc.run(sc.nextLine());
		sc.close();

	}

}