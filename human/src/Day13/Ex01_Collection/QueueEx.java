package Day13.Ex01_Collection;

import java.util.LinkedList;
import java.util.Queue;

/*
 Queue :
 먼저 추가한 데이터가 가장 먼저 나오는 자료구조
 
 데이터 추가 - Enqueue : 한 쪽에서 데이터를 추가하는 연산
 데이터 삭제 - Dequeue : 가장 먼저 추가한 데이터를 삭제하는 연산
 
 앞쪽		: front, head
 뒤쪽		: rear, tail
 
 객체 추가
 - add()	: 데이터를 추가하여 성공하면, true를 반환. 추가할 공간이 없으면 예외발생
 - offer()	: 용량제한을 넘기지않고 데이터를 추가, 넘기면 false 반환
 
 객체 검색
 - element() : head의 데이터 반환
 - peek()    : head의 데이터 반환, 큐가 비어있으면 null 반환
 
 객체 삭제
 - remove() : head의 데이터를 삭제
 - poll()   : head의 데이터를 삭제하고 삭제된 값을 반환, 큐가 비어있으면 null 반환
 
 */
public class QueueEx {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		for (Integer item : queue) {
			System.out.println("item : " + item);
		}
		
		queue.poll();		// 1
		queue.poll();		// 2

		System.out.println("Last Item : " + queue.peek());
		queue.poll();
		
		System.out.println( queue.poll() );
	}
}
