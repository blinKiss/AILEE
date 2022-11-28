package Day12.Ex01_Generic;

public class BoundedTypeMethod {

	// 제네릭 메소드 타입 제한
	// Number
	// - 자식 클래스 : Integer, Double, Byte 등의 Wrapper클래스 외 다수 
	public <T extends Number> void method(T t) {
		// 남아온 어떤 타입이든 정수로 변환
		// 타입을 Number로 한정했기 때문에,
		// Number 클래스의 메소드 호출이 가능하다
		System.out.println( t.intValue() );
	}
	
	public static void main(String[] args) {
		
		BoundedTypeMethod btm = new BoundedTypeMethod();
		btm.method(1234.5678);
		
		
	}
}
