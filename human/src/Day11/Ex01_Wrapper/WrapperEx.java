package Day11.Ex01_Wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		// Character
		// 대소문자 변환
		char a = 'a';
		char A = 'A';
		
		System.out.println(Character.toLowerCase(A));
		System.out.println(Character.toUpperCase(a));
		
		// 해당 문자가 숫자인지 알파벳인지 판별
		char c1 = '7', c2 = 'K';
		if ( Character.isDigit(c1) ) {
			System.out.println(c1 + "(은/는) 숫자");
		}
		
		if ( Character.isAlphabetic(c2) ) {
			System.out.println(c2 + "(은/는) 영문자");
		}
		
		// Integer 사용
		System.out.println(Integer.parseInt("28") + 1);	//문자열 -> 정수 변환
		System.out.println(Integer.toString(28) + 2); 	//정수 -> 문자열
		System.out.println(Integer.toBinaryString(28)); // 2진수 문자열로 변환
		System.out.println(Integer.bitCount(28));		// 2진수의 1의 개수
		
		// 아래 주석 deprecated 주의 메시지 : 더 이상 사용되지 않는 문법
		// Integer i = new Integer(28);
		Integer i = 28;
		System.out.println(i.doubleValue()); // 정수를 double 값으로 변환
		
		// Double 사용
		Double d = 3.14;
		System.out.println(d.toString() + 0.06); 			   // 실수형 -> 문자열
		System.out.println(Double.parseDouble("3.14") + 0.06); // 문자열-> 실수형
		
		// Boolean 사용
		Boolean b = (i < 40);
		System.out.println(Boolean.toString(b));			// "true"
		System.out.println(Boolean.parseBoolean("false"));	// "false" -> false
	}
}
