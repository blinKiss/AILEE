package Day12.Ex01_Generic;

class GenericMethod {
	
	// 제네릭 메소드
	public <T> T method1(T t) {
		return t;
	}
	
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	
	public <K, V> void method3(K k, V v) {
		System.out.println(k + " : " + v);
	}
}

public class GenericMethodEx {

	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		
		String str1 = gm.<String>method1("제네릭 메소드");
		System.out.println("str1 : " + str1);
		
		// 전달인자의 값으로 타입을 유추할 수 있으면, 명시적으로 제네릭 타입을 지정하는 것을 생략할 수 있다
		String str2 = gm.method1("타입 지정 생략 가능");
		System.out.println("str2 : " + str2);
		
		boolean bool1 = gm.<Double>method2(10.5, 10.5);
		System.out.println("bool1 : " + bool1);
		
		boolean bool2 = gm.method2(10.5, 20.5);
		System.out.println("bool2 : " + bool2);
		
		gm.<String, Integer>method3("자바 점수", 90);
		gm.method3("HTML 점수", 100);
		
		
		
		
	}
}
