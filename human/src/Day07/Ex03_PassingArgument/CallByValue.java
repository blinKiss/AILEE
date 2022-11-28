package Day07.Ex03_PassingArgument;

public class CallByValue {

	public static int sum(int sa, int sb) {
		sa = 100;
		sb = 200;
		System.out.println("***** sum 메소드 *****");
		System.out.println("(sa,sb) : (" + sa + "," + sb + ")");
		int sum = sa+sb;
		return sum;
	}
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("***** main 메소드 *****");
		System.out.println("(x,y) : (" + x + "," + y + ")");
		
		int sum = sum(x, y);
		System.out.println("sum : " + sum);
		
		System.out.println("***** sum 메소드 호출 후 *****");
		System.out.println("(x,y) : (" + x + "," + y + ")");
	}
}
