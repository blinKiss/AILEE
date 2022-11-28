package Day11.Ex02_Class;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareEx {

	public static void main(String[] args) {
		// 2022년 11월 10일 9시 0분 0초
		LocalDateTime startDateTime = LocalDateTime.of(2022, 11, 10, 9, 0, 0);
		System.out.println("시작일 : " + startDateTime);

		// 2023년 6월 29일 18시 0분 0초
		LocalDateTime endDateTime = LocalDateTime.of(2023, 6, 29, 18, 0, 0);
		System.out.println("종료일 : " + endDateTime);

		LocalDateTime nowTime = LocalDateTime.now();

		// isBefore(), isEqual(), isAfter()
		// : LocalDateTime 객체가 인자로 지정한 객체와 비교하여
		// 시간 순으로 이전/일치/이후 확인하여 여부를 true, false로 반환하는 메소드
		if (nowTime.isBefore(endDateTime)) {
			System.out.println("훈련과정 진행 중입니다.");
		} else if (nowTime.isEqual(endDateTime)) {
			System.out.println("종강합니다.");
		} else if (nowTime.isAfter(endDateTime)) {
			System.out.println("훈련과정이 종료되었습니다.");
		}

		if (nowTime.isBefore(startDateTime)) {
			System.out.println("훈련과정 개강 전입니다.");
		} else if (nowTime.isEqual(startDateTime)) {
			System.out.println("개강합니다.");
		} else if (nowTime.isAfter(startDateTime)) {
			System.out.println("개강일이 지났습니다.");
		}
		System.out.println();

		// until()
		// : LocalDateTime 객체의 날짜/시간부터 인자로 지정한 객체의 날짜/시간까지
		// 남은 시간을 반환하는 메소드
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);

		System.out.println("남은 년도 : " + remainYear);
		System.out.println("남은 개월 : " + remainMonth);
		System.out.println("남은 일 : " + remainDay);
		System.out.println("남은 시간 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
		System.out.println();

		// between()
		// ChronoUnit.상수.between(시작일, 종료일)
		// : 시작일과 종료일 사이의 남은 시간을 지정한 상수 단위에 맞게 반환하는 메소드
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainMinute = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);

		System.out.println("남은 년도 : " + remainYear);
		System.out.println("남은 개월 : " + remainMonth);
		System.out.println("남은 일 : " + remainDay);
		System.out.println("남은 시간 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
		System.out.println();

	}
}
