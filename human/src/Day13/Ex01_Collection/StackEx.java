package Day13.Ex01_Collection;

import java.util.Stack;

/*
 Stack :'쌓다'
 - 데이터를 한쪽 끝에서만 추가하고 삭제할 수 있는 자료구조
   최상위 데이터 : TOP
   
   자료추가 - Push : TOP 위에 데이터를 추가
   자료삭제 - Pop  : TOP 위치의 데이터를 삭제
   
   Last In First Out (L.I.F.O)
   
 */

/*
   객체 추가
   - add(E)  : 객체 E를 TOP 위에 추가 
   - push(E) : 객체 E를 TOP 위에 추가
   
   객체 검색
   - contains(Object) : 주어진 객체의 포함여부 (true,false)
   - isEmpty()        : 비어있는지 여부 (true,false)
   - size()           : 객체 수 반환
   
   객체 삭제
   - remove(Object)   : 주어진 객체를 삭제
   - pop()            : TOP에 있는 객체를 삭제
   - clear()          : 모든 요소를 삭제
   
 */
public class StackEx {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("empty : " + stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("empty : " + stack.isEmpty());
		System.out.println("1 포함 여부 : " + stack.contains(1));
		
		for (Integer item : stack) {
			System.out.println("item : " + item);
		}
		
		// peek() : TOP의 데이터를 반환
		System.out.println("TOP : " + stack.peek());
		System.out.println("size : " + stack.size());
		
		stack.pop();
		stack.remove(1);				// index
		stack.remove( (Integer) 3);		// Ojbect
		
		for (Integer item : stack) {
			System.out.println("item : " + item);
		}
		
		stack.clear();
		System.out.println("empty : " + stack.isEmpty());
		
	}
}
