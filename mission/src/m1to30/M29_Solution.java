package m1to30;

import java.util.HashMap;
import java.util.Scanner;

public class M29_Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력한 단어 수: ");
		int count = sc.nextInt();
		HashMap<String, String> word = new HashMap<String, String>();
		
		for (int i = 0; i < count; i++) {
			System.out.print(">>한글 : ");
			String kor = sc.next();
			System.out.print(">>영어 : ");
			String eng = sc.next();

			word.put(kor, eng);
		}
		
		while(true) {
			System.out.print("검색할 단어 : ");
			String search = sc.next();
			if( search.equals("0") ) break;
			
			System.out.println(">>\"" + search + "\"은 영어로 " + word.get(search) + "입니다."  );
		}
		System.out.println("종료합니다.");
		
		sc.close();
	}
}