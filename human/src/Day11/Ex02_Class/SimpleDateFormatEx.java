package Day11.Ex02_Class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println( sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println( sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy/MM/dd a HH:mm:ss");
		System.out.println( sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy/MM/dd(E)");
		System.out.println( sdf.format(now));
		
		sdf = new SimpleDateFormat("올해 첫 날부터 D번째 날");
		System.out.println( sdf.format(now));
	
		sdf = new SimpleDateFormat("이번 달 첫 날부터 d번째 날 ");
		System.out.println( sdf.format(now));
	
		sdf = new SimpleDateFormat("올해의 w주차 입니다");
		System.out.println( sdf.format(now));
		
		sdf = new SimpleDateFormat("이번 달의 W주차 입니다");
		System.out.println( sdf.format(now));
	
		sdf = new SimpleDateFormat("w");
		int dWeek = 52 - Integer.parseInt( sdf.format(now));
		System.out.println("올해는 " + dWeek + "주 남았습니다");
	
		sdf = new SimpleDateFormat("D");
		int dDay = 365 - Integer.parseInt( sdf.format(now));
		System.out.println("올해는 " + dDay + "일 남았습니다");
	
	
	
	
}

}