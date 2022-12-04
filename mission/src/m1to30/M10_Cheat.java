package m1to30;

import java.util.Scanner;

public class M10_Cheat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 7;
		
		String[] name = new String[size];
		int[] money = new int[size];
		
		int index = 0;
		while (true) {
			String command = sc.next();
			if (command.equalsIgnoreCase("QUIT")) {
				break;
			}
			name[index] = command;
			money[index] = sc.nextInt();
			index++;
			
			
			if (index == size) {
				break;
			}
		}
		
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t" + money[i]);
			
		}
		sc.close();
	}
}
