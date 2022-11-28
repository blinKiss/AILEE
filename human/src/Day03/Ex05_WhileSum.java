package Day03;

public class Ex05_WhileSum {
	
	public static void main(String[] args) {
		// 1부터 50까지의 합계를 구하시오.
		// 1+2+3+4+...+50 = 1275
		int sum=0;
		int a=1;
		
		while(a<=50) {
			// 복합대입연산자
			sum += a++;
			// sum = sum+a;
			// a++;
			
		}
		System.out.println("합계 : " +sum);
	}

}
