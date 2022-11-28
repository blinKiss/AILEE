package Day02;

public class Ex05_LogicalOperator {
	public static void main(String[] args) {
		
		// 논리 연산자
		// AND (&&)
		// A AND B : A와 B 둘 다 true일 때, 결과가 true
		// A     B	결과
		// F     F	F
		// T     F	F
		// F     T	F
		// T     T	T
		System.out.println(true && true);
		System.out.println(true && false);
		// System.out.println(false && (5 < 3));
		// 위쪽 원본 실행되지 않는 데드코드이므로 삭제하거나 주석처리 - 후자 선택
		// 아래쪽 여러 System.out.println 주석도 데드코드
		System.out.println((5 <= 10) && (7 > 2));
		System.out.println();
		
		// OR (||)
		// A OR B : A 또는 B가 true일 떄, 결과가 
		// A	B	결과
		// F	F	F
		// T	F 	T
		// F	T	T
		// T	T	T
		
				
		// System.out.println(true || true);
		// System.out.println(true || false);
		System.out.println(false || (100 < 50));
		// System.out.println((5 < 20) || (5 > 2));
		System.out.println();
		
		// XOR (^)
		// A XOR B : A와 B가 다를 때, 결과가 true
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ (5 < 3));
		System.out.println((9 >= 2) ^ (7 > 4));
		System.out.println();

		// NOT (!)
		// !A		: A가 true면 false로, A가 false면 true로 반전
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();

		int value1 = 3;
		// 쇼트 서킷 : 논리 연산의 결과를 미리 알아서, 남은 논리식을 확인하지 않는 것
		// System.out.println(false && ++value1 >10);
		System.out.println(value1);
		System.out.println();
		
		int value2 = 3;
		// 비트 연산자의 경우는 쇼트 서킷이 적용되지 않는다.
		System.out.println(false & ++value2 > 6);
		System.out.println(value2);
		System.out.println();
		
		int value3 = 3;
		// System.out.println(true || ++value3 > 5);
		System.out.println(value3);
		System.out.println();
		
		int value4 = 3;
		System.out.println(true | ++value4 > 2);
		System.out.println(value4);
		System.out.println();
		
		// 논리연산 &&(두개) 비트연산 & (하나)
	}

}
