package Day12.Ex01_Generic;

class Student { }

class Developer { }

class Person {
	
	private Object object = new Object();
	
	public Object get() {
		return object;
	}
	
	public void setObject(Object object) {
		this.object = object;
	}
}


public class ObjectProduct {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.setObject( new Student() );
		
		// Developer developer = (Developer) person1.get();
		// 다양한 타입을 사용하기 위해서
		// Object 타입으로 인스턴스를 저장할 수는 있지만,
		// 타입 변환을 올바르지 못하게 하는 상황이 발생할 수 있다
		// 그 경우 ClassCastException이 발생한다 : 위의 Developer~get(); 주석
		
		// 약한 타입 체크
		// : 잘못된 타입 변환에도 문법오류를 발생시키지 않고 타입을 체크하는 것
		
		
	}
}
