package m1to30;

public class M03_Solution {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			
			int ten = i / 10;
			int one = i % 10;
			boolean isTen369 = ten == 3 || ten == 6 || ten == 9; 
			boolean isOne369 = one == 3 || one == 6 || one == 9; 
			
//			boolean isTen369 = (ten != 0) && (ten % 3 == 0); 
//			boolean isOne369 = (one != 0) && (one % 3 == 0);
			
			if( isTen369 && isOne369 )	System.out.println("**");
			else if( isTen369 || isOne369 )	System.out.println("*");
			else System.out.println(i);
		}
	}
}