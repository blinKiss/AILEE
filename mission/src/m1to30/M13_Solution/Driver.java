package m1to30.M13_Solution;

import java.util.Scanner;

public class Driver {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("================ 배달수단 ================");
		System.out.println("1. 도보");
		System.out.println("2. 자전거");
		System.out.println("3. 킥보드");
		System.out.println("4. 오토바이");
		System.out.println("========================================");
		System.out.print("입력>>");
		int deliveryNo = sc.nextInt();
		
		
		System.out.println("================ 드링크 ================");
		System.out.println("1. 비타민음료");
		System.out.println("2. 커피");
		System.out.println("3. 에너지드링크");
		System.out.println("0. 안마심");
		System.out.println("========================================");
		System.out.print("입력>>");
		int drinkNo = sc.nextInt();
		
		Drink drink = null;
		switch (drinkNo) {
			case 1:
				drink = new VitaminDrink();
				break;
			case 2:
				drink = new Coffee();
				break;
			case 3:
				drink = new EnergyDrink();
				break;
			default:
				break;
		}
		
		ModooDriver modooDriver = new ModooDriver();
		switch (deliveryNo) {
			case 1:
					modooDriver.drive(new Walker(), drink);
					break;
			case 2:
					modooDriver.drive(new Bicycle(), drink);
					break;
			case 3:
					modooDriver.drive(new KickBoard(), drink);
					break;
			case 4:
					modooDriver.drive(new MotorCycle(), drink);
					break;
			default:
					break;
		}	
		sc.close();
	}
}