package Day03;

public class Ex06_OddEven {
	
	public static void main(String[] args) {
		// 1~20까지의 정수 중,
		// 홀수의 합계, 짝수의 합계 각각 구하여 출력하시오.
		// 1+3+5~ = sum1
		// 2+4+6~ = sum2
		// while, if 문을 사용.
		
		int a = 1;
		int sum1=0;		
		int sum2=0;
		while( a <= 20) {
			// a % 2 == 1 : 홀수
			// a % 2 == 0 : 짝수
			if( a % 2 == 1) {
				sum1 += a;
			}
			else {
				sum2 += a;
			}
			a++;
		}
		
			
	
			System.out.println("홀수의합계 : " +sum1);
			System.out.println("짝수의합계 : " +sum2);
		}
}
			
		
		
	

	
			