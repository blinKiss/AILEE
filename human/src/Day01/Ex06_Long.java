package Day01;

public class Ex06_Long {
	
	public static void main(String[] args) {
		long ln1 = 1000;
		long ln2 = 2100000000;
		long ln3 = 123400000000L;
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		int maxOverflow = max + 1;
		int minOverflow = min - 1; 
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println(maxOverflow);
		System.out.println(minOverflow);
		
		System.out.println(ln1);
		System.out.println(ln2);
		System.out.println(ln3);
	}
	
	

}
