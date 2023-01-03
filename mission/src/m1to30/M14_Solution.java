package m1to30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class M14_Solution {

	public static void main(String[] args) {
		
		ArrayList<Integer> lottoList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임? ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			lottoList.clear();
			System.out.print("[" + (i+1) + " 게임] : ");
			for (int j = 0; j < 6; j++) {
				int rand = (int)(Math.random() * 45) + 1;
				if(lottoList.contains(rand)) {
					j--;
				} else {
					lottoList.add(rand);
				}
			}
			Collections.sort(lottoList);
			
			for (Integer lotto : lottoList) {
				System.out.print(lotto + " ");
			}
			System.out.println();
		}
		sc.close();
	}
	
}