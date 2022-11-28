package Day02;

public class Ex06_BitOperator {

	public static void main(String[] args) {
		// AND
		// 20 (십진수) -> 0001 0100 (이진수)
		// 16 (십진수) -> 0001 0000 (이진수) 
		// 이진수 : 0 또는 1로만 표현한 수
		
		// 0001 0100
		// 0001 0000
		// ---------
		// 0001 0000	-> 16
		int result = 20 & 16;
		System.out.println("and");
		System.out.println(20 & 16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("---------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		// OR
		// 0001 0100
		// 0001 0000
		// ---------
		// 0001 0100
		int result2 = 20 | 16;
		System.out.println("or");
		System.out.println(20 | 16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("---------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();

		// XOR
		// 0001 0100
		// 0001 0000
		// ---------
		// 0000 0100
		int result3 = 20 ^ 16;
		System.out.println("xor");
		System.out.println(20 ^ 16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("---------");
		System.out.println(Integer.toBinaryString(result3));
		System.out.println();
		
		// NOT
		// ~0001 0100
		// ---------
		// 1110 1011
		int result4 = ~20;
		System.out.println("not");
		System.out.println(~20);
		System.out.println(Integer.toBinaryString(20));
		System.out.println("---------");
		System.out.println(Integer.toBinaryString(result4));
		System.out.println();
		
		// int (4byte) (32bit)
		// 0000 0000 0000 0000 0000 0000 0001 0100
		// 1111 1111 1111 1111 1111 1111 1110 1011
		
		// 최상위 비트
		// 부호가 있는 수의 경우는 최상위비트를 부호비트로 사용한다
		
		// 시프트 연산
		// - 산술 시프트 ( << , >> )
		//	: 부호 비트 유지하면서, 왼쪽 또는 오른쪽으로 이동시키는 연산자
		// - 논리 시프트 ( <<<, >>> )
		//	: 부호 비트를 포함해서, 전체를 왼쪽 또는 오른쪽으로 이동시키는 연산자
		
		// 0000 0010	->	2 = 2^1
		// 0000 0100	->	4 = 2^2
		// 0000 1000	->	8 = 2^3
		System.out.println(2 << 1);
		System.out.println(2 << 2);
		System.out.println(2 << 3);
		System.out.println();

		System.out.println(16 >> 1);
		System.out.println(16 >> 2);
		System.out.println(16 >> 3);
		System.out.println();
		
		System.out.println(-2 << 1);
		System.out.println(-2 << 2);
		System.out.println(-2 << 3);
		System.out.println();
		
		System.out.println(2 >> 1);
		System.out.println(-2 >>> 31);
		System.out.println(Integer.toBinaryString(2) );
		System.out.println(Integer.toBinaryString(-2));
		// -2
		// 11111111111111111111111111111110
		// 01111111111111111111111111111111
		// 00000000000000000000000000000001
		System.out.println();
		
		
	}
}
