package Day12.Ex01_Generic;

class A {}

class B extends A {}
class C extends B {}

// A -> B
// B -> C

// 타입지정이 가능한 클래스 = B, C : 상위클래스는 불가능
class D <T extends B> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
public class BoundedTypeClass {

	public static void main(String[] args) {
		D<B> d1 = new D<B>();
		D<C> d2 = new D<C>();
		// D<A> d3 = new D<A>();
		// D 클래스의 타입매개변수를 B클래스로 제한하고 있기 때문에, 
		// D의 타입으로 B와 C만 가능하다 : A는 상위클래스
		
		d1.setT( new B() );
		d2.setT( new C() );
		
		d1.setT( new C() );		// d1<B> <-- 자식객체인 C 대입 가능 (업캐스팅)
		// d2.setT( new B() );	// d2<C> <-- 부모객체인 B 대입 불가
		
		D<B> d4 = new D<>();	// D d4 = new D();로 생략 가능
								// 원본은 위쪽 주석이지만 전구떠서 바꿈
		d4.setT( new B() );
		d4.setT( new C() );
		
		
		
	}
	
}
