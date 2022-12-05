package m1to30;

import java.util.Iterator;
import java.util.Vector;

public class M28_C {

	public static void main(String[] ar) {
		
		Vector<Integer> vec = new Vector<Integer>(10);
		int sum = 0;
		
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		
		
		
		System.out.println("벡터의 요소 수 : "+ vec.size());
		
		Iterator<Integer> ir = vec.iterator();
		while (ir.hasNext()) {
			int item = ir.next();
			sum += item;
		    System.out.print(item + " ");
		}
		
		vec.add(sum);
//		while (ir.hasNext()) {
//			sum = sum + ir.next();
//		}

		System.out.println();

		System.out.println("요소 수 : "+ vec.indexOf(sum));
		System.out.println("벡터 용량 : "+ vec.capacity());
		System.out.println("총합 : " + sum);
		
		
		
		
		
		
	}
}