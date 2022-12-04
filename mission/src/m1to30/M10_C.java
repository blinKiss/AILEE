package m1to30;

import java.util.Scanner;

public class M10_C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// (입력금액 - pay), (화폐매수 - count), (화폐단위 - pm)
//		String name;
//		int pay = 0; // 지급액
		// int count;
		int pm = 50000; // 지폐 50000~1
		boolean sw = true; // 화폐단위 변환 스위치 변수
		String name[] = new String[4]; // 멤버 이름
		int pay[] = new int[4];
//		ArrayList<String> name = new ArrayList<>(4); // 멤버 이름
//		ArrayList<Integer> pay = new ArrayList<>(4); // 지급액
		int count[] = new int[10]; // 지폐 몇장씩?
//		Boolean QUIT = true;
//		int first[] = new int [7]; // 지급액 중 처음액수 고정
		int total[] = new int[10];
		int index = 0;

		// 마마무 멤버 지급액 입력
		while (true) {
			String outcommand = sc.next();
			if (outcommand.equals("QUIT")) {
				break;
			}
			name[index] = outcommand; // name[0] = 첫 입력 멤버

			pay[index] = sc.nextInt(); // pay[0] = 첫 입력 멤버 지급액
//				first[i] = pay[i];
			index++;
		}

		sc.close();

		/*
		 * while(true) { name = sc.nextLine(); pay = sc.nextInt(); if
		 * (name.equals("QUIT")) break;
		 * 
		 * }
		 */

		System.out.println("성명\t출장비\t오만원\t만원\t오천원\t천원\t오백원\t백원\t오십원\t십원\t오원\t일원"); // 첫줄

		for (int i = 0; i < pay.length; i++) {
			System.out.print(name[i] + "\t" + pay[i] + "\t");

			for (int j = 0; j < count.length; j++) {
				count[j] = pay[i] / pm; // ex) 523132/50000=10 -> count[0]=10
				System.out.print(count[j] + "\t");
				pay[i] = pay[i] % pm; // ex) 523132 = 523132%50000 = 23131 -> pay[0] = 23132
				total[j] = total[j] + count[j];

				if (sw) {
					pm = pm / 5;
					sw = false;
				} else {
					pm = pm / 2;
					sw = true;
				}

			}
			pm = 50000;

//			System.out.print(name + "\t");
			/*
			 * System.out.println(name+"\t"+a+"\t"+count[0]+"\t"+count[1]+"\t"+count[2]+"\t"
			 * +count[3]+"\t"+count[4]+"\t"+
			 * count[5]+"\t"+count[6]+"\t"+count[7]+"\t"+count[8]+"\t"+count[9]);
			 */

			System.out.println();
		}
		System.out.print("전체  화폐매수 :    ");

		for (int k = 0; k < count.length; k++) {
			System.out.print(total[k] + "\t"); // 마지막줄
		}
		/*
		 * private static ArrayList<String> add(String next) { return null; }
		 */
	}
}
