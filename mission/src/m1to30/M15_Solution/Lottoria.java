package m1to30.M15_Solution;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Lottoria {

	final static long INTPUT_COUNT = 6;
	final static long MAX_GAME = 5;
	final static long PRICE = 1000;
	static Scanner sc = new Scanner(System.in);
	
	// 게임 시작
	public static void start() {
		ArrayList<ArrayList<Integer>> gameList = Lotto.getInstance().getGameList();
		ArrayList<Integer> tempList = null;
		System.out.print("몇 게임? ");
		int N = sc.nextInt();
		int cnt = 1;
		while( cnt <= N && cnt <= MAX_GAME ) {
			System.out.print("[" + (cnt++) + " 게임] (1.자동 / 2.수동) : ");
			int no = sc.nextInt();
			switch (no) {
				case 1:
						tempList = randomInput();
						break;
				case 2:
						tempList = directInput();
						break;
				default:
						break;
			}
			printList(tempList);
			gameList.add( tempList );
		}
		
		// 출력하기
		printGameList();
		
		// 당첨확인
		
		
		ArrayList<Integer> winningList = randomInput();
		ArrayList<String> typeList = Lotto.getInstance().getTypeList();
		int bonusNo = getBonusNo(winningList);
		
		System.out.println();
		System.out.print("당첨 번호 : ");
		printList(winningList);
		System.out.println("보너스 번호 : " + bonusNo);
		System.out.println();
		
		int[]rankList = new int[5];
		System.out.println("#################### 당첨 결과 ####################");
		for (int i = 0; i < gameList.size(); i++) {
			System.out.print( (char)(65+i) + " ");
			System.out.print(typeList.get(i) + " ");
			ArrayList<Integer> game = gameList.get(i);
			cnt = 0;
			for (Integer gameNo : game) {
				System.out.printf("%1$02d    ", gameNo);
				for (Integer winNo : winningList) {
					if( gameNo == winNo )
						cnt++;
				}
			}
			int rank = 0;
			
			switch (cnt) {
				case 6:		rank = 1; rankList[0]++;	break;
				case 5:		rank = 3; 
					// 보너스번호 체크
					for (Integer gameNo : game) {
						if( gameNo == bonusNo )
							rank = 2;
					}
					if( rank == 2 ) rankList[1]++;
					if( rank == 3 ) rankList[2]++;
					break;
				case 4: 	rank = 4; rankList[3]++;	break;
				case 3:		rank = 5; rankList[4]++;	break;
				default:	break;
			}
			if( rank == 0 )
				System.out.println("(낙첨)");
			else
				System.out.println("("+ rank +"등)");
			
		}
		System.out.println("#################################################");
//		System.out.println("1등 : " + rankList[0]);
//		System.out.println("2등 : " + rankList[1]);
//		System.out.println("3등 : " + rankList[2]);
//		System.out.println("4등 : " + rankList[3]);
//		System.out.println("5등 : " + rankList[4]);
	}
	
	/**
	 * (start~end) 사이의 숫자만 입력
	 * @return
	 */
	public static int inputNo(int start, int end) {
		Integer inputNo = null;
		System.out.print(">> 입력 : ");
		while(!sc.hasNextInt() ||  ( (inputNo = Integer.parseInt( sc.next() ) ) < start ) || (inputNo > end)  )  {
			System.err.println("(" + start + "~" + end + ") 사이의 숫자만 입력할 수 있습니다.");
			if( inputNo == null )
				sc.next();
			inputNo = null;
			System.out.print(">> 입력 : ");
		}
		if( inputNo >= start && inputNo <= end ) return inputNo;
		inputNo = sc.nextInt();
		return inputNo;
	}
	
	// 자동번호 입력
	public static ArrayList<Integer> randomInput() {
//		ArrayList<Integer> lottoList = Lotto.getInstance().getLottoList();
		ArrayList<Integer> lottoList = new ArrayList<Integer>();
		ArrayList<String> typeList = Lotto.getInstance().getTypeList();
		lottoList.clear();
		for (int i = 0; i < INTPUT_COUNT; i++) {
			int rand = (int)(Math.random() * 45) + 1;
			if(lottoList.contains(rand)) {
				i--;
			} else {
				lottoList.add(rand);
			}
		}
		Collections.sort(lottoList);
		typeList.add("자  동");
		return lottoList;
	}
	
	// 수동번호 입력
	public static ArrayList<Integer> directInput() {
		String[] no = {"①", "②", "③", "④", "⑤", "⑥"};
//		ArrayList<Integer> lottoList = Lotto.getInstance().getLottoList();
		ArrayList<Integer> lottoList = new ArrayList<Integer>();
		ArrayList<String> typeList = Lotto.getInstance().getTypeList();
		for (int i = 0; i < INTPUT_COUNT; i++) {
			System.out.print(no[i] + " : ");
			int input = sc.nextInt();
			if(lottoList.contains(input)) {
				i--;
			} else {
				lottoList.add(input);
			}
		}
		Collections.sort(lottoList);
		typeList.add("수  동");
		return lottoList;
	}
	
	// 보너스 번호
	public static int getBonusNo(ArrayList<Integer> list) {
		int rand = 0;
		while(true) {
			rand = (int)(Math.random() * 45) + 1;
			if(!list.contains(rand)) {
				break;
			}
		}
		return rand;
	}
	
	// 번호 출력하기
	public static void printList(ArrayList<Integer> list) {
		for (Integer no : list) {
			System.out.print(no + " ");
		}
		System.out.println();
	}
	
	public static void printDate() {
//		String[] week = {"일","월","화","수","목","금","토"}; // 안쓰여서 경고 뜨므로 주석
		SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM/dd일 (E) HH:mm:ss", Locale.KOREAN);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd일 (E)", Locale.KOREAN);
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		calendar.setTime(date);
		
		int todayWeekIndex = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		int nowHour = calendar.get(Calendar.HOUR);
		int am_pm = calendar.get(Calendar.AM_PM);
		
		if( todayWeekIndex == 6 && nowHour >= 9 && am_pm == 1 ) {
			calendar.add(Calendar.DATE, 7);
			calendar.set(Calendar.HOUR, 9);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.AM_PM, 1);
		} else {
			calendar.add(Calendar.DATE, 6-todayWeekIndex);
			calendar.set(Calendar.HOUR, 9);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.AM_PM, 1);
		}
		
//		System.out.println(week[todayWeekIndex]);
//		System.out.println(nowHour);
//		System.out.println(am_pm);
		
		//   0   1   2    3    4    5   6
		//   6   5   4    3    2    1   ?
		//							    7  PM9이후
		//                              0  PM9이전
		// {"일","월","화","수","목","금","토"};
		
		System.out.println("발행일 \t: " + dateTimeFormat.format(date));
		System.out.println("추첨일 \t: " + dateTimeFormat.format(calendar.getTime()));
		calendar.add(Calendar.YEAR, 1);
		calendar.add(Calendar.DATE, 1);
		System.out.println("지급기한 \t: " + dateFormat.format(calendar.getTime()));
		
	}
	
	// 게임 전체번호 출력하기
	public static void printGameList() {
		ArrayList<ArrayList<Integer>> gameList = Lotto.getInstance().getGameList();
		ArrayList<String> typeList = Lotto.getInstance().getTypeList();
		System.out.println();
		System.out.println("############ 인생역전 Lottoria ############");
		printDate();
		System.out.println("-----------------------------------------");
		for (int i = 0; i < gameList.size(); i++) {
			System.out.print( (char)(65+i) + " ");
//			System.out.print( (i+1) + " ");
			System.out.print(typeList.get(i) + " ");
			for (int j = 0; j < gameList.get(i).size(); j++) {
				System.out.printf("%1$02d    ", gameList.get(i).get(j));
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		String strPrice = NumberFormat.getInstance().format(gameList.size() * PRICE);
		System.out.println("금액\t\t\t\t   \u20A9" + strPrice);
		System.out.println("#########################################");
	}
	
	// 당첨확인
	
	public static void main(String[] args) {
		start();
		sc.close();
	}
	
}
