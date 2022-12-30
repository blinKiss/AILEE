package m1to30;

import java.util.Iterator;
import java.util.Vector;

public class M28_Solution {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		int sum = 0;
		int count = 0;
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		System.out.println("벡터 요소 수 : " + v.size());
		Iterator<Integer> iterator = v.iterator();
		while( iterator.hasNext() ) {
			int item = iterator.next();
			System.out.print(item + " ");
			sum += item;
			count++;
		}
		System.out.println();
		System.out.println("요소 수 : " + count);
		System.out.println("벡터 용량 : " + v.capacity());
		System.out.println("총합 : " + sum);
	}
}