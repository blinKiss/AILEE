package Day11.Ex02_Class;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.TimeZone;

public class DateTimeCreateEx {

	public static void main(String[] args) {
		
		// 날짜 얻기
		// LocalDate : 날짜를 다루는 클래스
		LocalDate nowDate = LocalDate.now();
		System.out.println("현재 날짜 : " + nowDate);
		
		LocalDate endDate = LocalDate.of(2023, 6, 29);
		System.out.println("종료 날짜 : "  + endDate);
		
		// LocalTime : 시간을 다루는 클래스
		LocalTime nowTime = LocalTime.now();
		System.out.println("현재 시간 : " + nowTime);
		
		// LocalTime.of(시간, 분, 초, 나노초);
		LocalTime endTime = LocalTime.of(15, 30, 0, 0);
		System.out.println("종료 시간 : " + endTime);
		
		// LocalDateTime : 날짜와 시간을 다루는 클래스
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : " + nowDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2023, 6, 29, 3, 30, 0, 0);
		System.out.println("현재 날짜와 시간 : " + endDateTime);
		
		// 협정 시계시와 타임존(TimeZone)
		// UTC : 협정 세계시 - 국제 표준시
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시 : " + utcDateTime);
	
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 표준시 : " + seoulDateTime);
	
		ZonedDateTime newYorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 표준시 : " + newYorkDateTime);
	
		ZonedDateTime japanDateTime = ZonedDateTime.now(ZoneId.of("Japan"));
		System.out.println("일본 표준시 : " + japanDateTime);
	
		ZonedDateTime romeDateTime = ZonedDateTime.now(ZoneId.of("Europe/Rome"));
		System.out.println("로마 표준시 : " + romeDateTime);
		
		//
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("년도 : " + ldt.getYear());
		System.out.println("월 : " + ldt.getMonthValue());
		System.out.println("일 : " + ldt.getDayOfMonth());
		System.out.println("시 : " + ldt.getHour());
		System.out.println("분 : " + ldt.getMinute());
		System.out.println("초 : " + ldt.getSecond());
		System.out.println("나노초 : " + ldt.getNano());
		
		// 윤년
		// 2월 29일
		LocalDate ld = LocalDate.now();
		// LocalDate객체.isLeapYear() : 윤년이면 true, 평년이면 false를 반환하는 메소드
		if( ld.isLeapYear()) {
			System.out.println("올해는 윤년 : 2월 29일까지");
		} else { 
			System.out.println("올해는 평년 : 2월 28일까지");
		}
		
		// 사용가능한 타임존 아이디
		String[] timeZoneId = TimeZone.getAvailableIDs();
		
		for (String ZoneId : timeZoneId) {
			System.out.println(ZoneId);
		}
		
		
	
	}
}
