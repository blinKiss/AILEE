package Day11.Ex02_Class;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println( cal.get(Calendar.YEAR) );
		System.out.println( cal.get(Calendar.MONTH) +1 );
		System.out.println( cal.get(Calendar.DAY_OF_MONTH) );
		System.out.println( cal.get(Calendar.DAY_OF_WEEK) );
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd E요일 HH:mm:ss");
		String today = sdf.format( cal.getTime() );
		System.out.println(today);
		
		// 10분 후
		cal.add(Calendar.MINUTE, 10);
		String after10Min = sdf.format(cal.getTime());
		System.out.println("10분 후 : " + after10Min);
		
		// 1시간 후
		cal.add(Calendar.HOUR, 1);
		String after1Hour = sdf.format(cal.getTime());
		System.out.println("1시간 후 : " + after1Hour);
		
		// 1일 후
		cal.add(Calendar.DAY_OF_MONTH, 1);
		String after1Day = sdf.format(cal.getTime());
		System.out.println("1일 후 : " + after1Day);
		
		// 이번주 로또 추첨일시 구하기
		// 로또는?
		// 매일 6시부터 24시까지 판매
		// 추첨일(토요일)에는 오후 8시에 판매 마감
		// 추첨일 오후 8시부터 다음날(일요리) 오전 6시까지 판매 정지
		
		// 조건
		// 일요일 오전 6시 ~ 토요일 오후 8시 : 이번주 토요일 9시 추첨일시
		// 구입 요일, 시간
		Calendar lottoCal = Calendar.getInstance();
		
		// 2일 후 - 일요일 오전 9시
//		lottoCal.add(Calendar.DAY_OF_MONTH, 2);
//		lottoCal.set(Calendar.HOUR, 7);
		
		// 일요일(1) ~ 토요일(7)
		int 요일 = lottoCal.get(Calendar.DAY_OF_WEEK);
		int 시간 = lottoCal.get(Calendar.HOUR);
		int ampm = lottoCal.get(Calendar.AM_PM);
		String todayOfWeek = "";
		switch (요일) {
			case 1: todayOfWeek = "일"; break;
			case 2: todayOfWeek = "월"; break;
			case 3: todayOfWeek = "화"; break;
			case 4: todayOfWeek = "수"; break;
			case 5: todayOfWeek = "목"; break;
			case 6: todayOfWeek = "금"; break;
			case 7: todayOfWeek = "토"; break;
		}
		
		
		System.out.println(요일);
		System.out.println(시간);
		System.out.println(ampm);		// 0 : 오전, 1 : 오후
		System.out.println(todayOfWeek);
		
		lottoCal.set(Calendar.AM_PM, 1);
		lottoCal.set(Calendar.HOUR, 9);	// 오후
		lottoCal.set(Calendar.MINUTE, 0);
		lottoCal.set(Calendar.SECOND, 0);

		boolean buyYn = false;	// 구입 여부
		
		// 1. 토요일이면서, 오후 8시 이후 - 구입 불가
		if( todayOfWeek.equals("토") && 시간 >=8 && ampm == 1) {
			System.out.println("구입 불가");
		}
		// 2. 일요일이면서, 오전 6시 이전 - 구입 불가
		else if( todayOfWeek.equals("일") && 시간 < 6 && ampm == 0) {
			System.out.println("구입 불가");
		}
		// 3. 일요일이면서, 오전 6시 이후 - 다음 주 토요일 오후 9시 추첨일시
		else if( todayOfWeek.equals("일") && 시간 >= 6 && ampm == 0) {
			lottoCal.add(Calendar.DATE, 6);
			buyYn = true;
		}	
		// 4. 그 외 - 이번 주 토요일 오후 9시 추첨일시
		else { 
			// 월 -> 토 : 2 -> 7 : 5
			// 화 -> 토 : 3 -> 7 : 4
			// 수 -> 토 : 4 -> 7 : 3
			// 목 -> 토 : 5 -> 7 : 2
			// 금 -> 토 : 6 -> 7 : 1
			// 토 -> 토 : 7 -> 7 : 0
			// 요일 : 2 3 4 5 6 7
			// 차이 : 5 4 3 2 1 0 = (7-요일)
			lottoCal.add(Calendar.DATE, 7-요일);
			lottoCal.set(Calendar.AM_PM, 1);	// 오후
		}		
		
		if( buyYn ) {
		String 추첨일 = sdf.format(lottoCal.getTime());
		System.out.println("추첨일 : " + 추첨일);
		}	
		
	}
}
