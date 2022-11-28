package Day11.Ex02_Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) throws ParseException {
		// Date 객체는 시스템에서 현재 날짜를 가져온 정보를 가지고 있다
		Date now = new Date();
		System.out.println("now : " + now);
		
		String dateStr = now.toString();
		System.out.println("date 문자열 기본 포맷 : " + dateStr);
		
		// 날짜/시간 형식 문자 : y M d , h m s
		String dateFormat = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		String nowStr = sdf.format(now);
		System.out.println(nowStr);
		
		String dateFormat2 = "yyyy/MM/dd/ hh:mm:ss";
		SimpleDateFormat sdf2 = new SimpleDateFormat(dateFormat2);
		String nowStr2 = sdf2.format(now);
		System.out.println(nowStr2);
		
		String day1 = "2022/11/25";
		String day2 = "2022/12/05";
		System.out.println();
		
		// 파싱 (Parsing)
		// : 구분 문자나 형식으 가진 데이터(문자열)의 구성 성분을 분석하는 과정
		// 데이터를 다루기 쉬운 형태로 바꿔줌
		Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(day1);
		Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse(day2);
		
		// getTime() :
		// 1970년 1월 1일 0시 0분 0초 0밀리초 부터 Date에 지정된 날짜/시간까지의 밀리초 누적값
		long gapDays = (date2.getTime() - date1.getTime()) / (1000*60*60*24);
		long gapHours = (date2.getTime() - date1.getTime()) / (1000*60*60);
		long gapMin = (date2.getTime() - date1.getTime()) / (1000*60);
		long gapSec = (date2.getTime() - date1.getTime()) / (1000);
		
		System.out.println("1970/01/01 00:00:00 00ms ~ date1까지");
		System.out.println(date1.getTime() + "밀리초");
		System.out.println(date1.getTime() / 1000 + "초");
		System.out.println(date1.getTime() / (1000*60) + "분");
		System.out.println(date1.getTime() / (1000*60*60) + "시간");
		System.out.println(date1.getTime() / (1000*60*60*24) + "일");
		System.out.println(date1.getTime() / (1000*60*60*24) / 365 + "년");
		System.out.println();
		
		System.out.println("1970/01/01 00:00:00 00ms ~ date2까지");
		System.out.println(date2.getTime() + "밀리초");
		System.out.println(date2.getTime() / 1000 + "초");
		System.out.println(date2.getTime() / (1000*60) + "분");
		System.out.println(date2.getTime() / (1000*60*60) + "시간");
		System.out.println(date2.getTime() / (1000*60*60*24) + "일");
		System.out.println(date2.getTime() / (1000*60*60*24) / 365 + "년");
		System.out.println();
		
		System.out.println("시험 D-day : " + gapDays);
		System.out.println("시험까지 남은 시간(/시) : " + gapHours);
		System.out.println("시험까지 남은 시간(/분) : " + gapMin);
		System.out.println("시험까지 남은 시간(/초) : " + gapSec);
		System.out.println();
		
		// Date 객체의 getXXX() 메소드는 Deprecated(더 이상 사용되지 않음)
		// getYear의 리턴 = 년도에서 1900을 뺀 값이기 때문에 1900을 더해야 정확하게 나옴
		// 현재 버전에서 날짜의 년/월/일을 추출하는 기능은 Calendar 클래스에서 다룬다
		// 아래쪽 ** 주석 전구가 떠서 주석처리
		
		/*
		System.out.println("Today (년) : " + (date1.getYear() + 1900));
		System.out.println("Today (월) : " + (date1.getMonth() +1));
		System.out.println("Today (일) : " + date1.getDate());
		*/
		
		// 년/월/일은 Calendar로 추출
		// Date를 Calendar로 변환하여 년/월/일을 추출
		Calendar calendar = Calendar.getInstance();
		// Calendar객체.setTime(Date객체);
		calendar.setTime(date1);
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) +1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("Today (년) : " + year);
		System.out.println("Today (월) : " + month);
		System.out.println("Today (일) : " + day);
		
		// 2022/11/25 : 5일 후
		// 2022/11/25 : 10일 후
		// 2022/11/25 : 100일 후
		System.out.println(date1.getTime());
		int dayTime = (1000 * 60 * 60 * 24); // ms 단위로 1일을 환산한 값
		int day5TimeValue = 5 * dayTime;
		int day10TimeValue = 10 * dayTime;
		int day100TimeValue = 100 * dayTime;
		
		// 5일 후
		Date after5Days = new Date();
		after5Days.setTime( date1.getTime() + day5TimeValue);
		String after5DaysStr = sdf.format(after5Days);
		System.out.println("현재 11월 25일, 5일 후는? : " + after5DaysStr);
		
		// 10일 후
		Date after10Days = new Date();
		after10Days.setTime( date1.getTime() + day10TimeValue);
		String after10DaysStr = sdf.format(after10Days);
		System.out.println("현재 11월 25일, 10일 후는? : " + after10DaysStr);
		
		// 올바르지 않은 결과가 나온다
		// 날짜를 계산하는 경우는 Calendar 클래스를 사용할 것을 권장
		// 100일 후
		Date after100Days = new Date();
		after100Days.setTime( date1.getTime() + day100TimeValue);
		String after100DaysStr = sdf.format(after100Days);
		System.out.println("현재 11월 25일, 100일 후는? : " + after100DaysStr);
		
	}
}
