package Day04;

// 열거체 정의
enum Rainbow {RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}

public class Ex07_Enum {

	public static void main(String[] args) {
		// ENUM (열거체)
		// - 요소들을 명명한 값으로 집합을 이룬 자료형
		// 특징
		// 1. enum 비교할 때는 값뿐만 아니라 타입도 비교한다
		// 2. enum의 상수값이 재정의돼도 다시 컴파일할 필요가 없다.
		
		// values() : 열거체의 모든 요소를 배열로 변환
		Rainbow[] arr = Rainbow.values();
		for (Rainbow color : arr) {
			System.out.print(color + " ");
		}
		System.out.println();
		
		// valueOf() : 전달된 문자열과 일치하는 열거체 상수를 반환
		Rainbow G = Rainbow.valueOf("GREEN");
		System.out.println("G : " + G);
		
		// ordinal() : 해당 열거체 상수가 정의된 순서 index를 반환
		int index = G.ordinal();
		System.out.println("GREEN 의 index : " + index);
	}
}
