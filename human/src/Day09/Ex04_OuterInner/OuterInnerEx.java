package Day09.Ex04_OuterInner;

public class OuterInnerEx {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.print();
	}
}
