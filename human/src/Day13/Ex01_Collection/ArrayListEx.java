package Day13.Ex01_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		// 객체 추가
		list.add("Java");
		list.add("JDBC");
		list.add("JSP");
		list.add("SPRING");
		
		int size = list.size();
		System.out.println("요소 개수 : " + size);
		
		// 객체 검색
		String first = list.get(0);
		System.out.println("첫번째 기술스택 : " + first);
		
		// 반복 1
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		System.out.println();
		
		// 반복 2
		for (String skill : list) {
			System.out.println(skill + " ");
		}
		System.out.println();
		
		list.remove(0);
		list.remove("SPRING");
		
		System.out.println(list);
		
		// 반복 3
		Iterator<String> it = list.iterator();
		int i = 0;
		while ( it.hasNext()) {
			String item = it.next();
			System.out.println("item : " + i++ + " : " + item);
		}
	}
}
