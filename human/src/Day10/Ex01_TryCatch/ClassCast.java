package Day10.Ex01_TryCatch;

class Animal {}

class Dog extends Animal { }

class Cat extends Animal { }

public class ClassCast {

	// Dog, Cat -> Animal
	// Animal = Cat의 경우는 다시 Dog 변환 불가
	// - Cat을 Dog로 타입변환할 수 없다
	public static void changeDog(Animal animal) {
		// java.lang.ClassCastException
//		Dog dog = (Dog) animal;
//		위쪽 원본 dog 객체가 사용되지 않아 주석 처리 error message : not used
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat);		// cat이 인자로 전달된 경우, (Dog)로 변환 불가
		
		
		
		
		
		
		
		
		
	}
}
