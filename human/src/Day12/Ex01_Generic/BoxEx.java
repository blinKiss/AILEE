package Day12.Ex01_Generic;

public class BoxEx {

	public static void main(String[] args) {
		// 제네릭
		// : 모든 클래스 타입을 다룰 수 있도록 클래스와 메소드를 작성하는 기법
		// - 타입매개변수 : 모든 클래스타입을 일반화한 변수
		// - 객체를 생성할 때, 타입을 구체화하여 사용한다.
		Box<String> box1 = new Box<String>();
		box1.set("쿠팡택배");
		String str = box1.get();
		System.out.println(str);

		Box<Integer> box2 = new Box<Integer>();
		box2.set(100);
		int value = box2.get();
		System.out.println(value);
	}
}
