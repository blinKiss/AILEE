package Day07.Ex05_02_AccessModifier;

import Day07.Ex05_01_AccessModifier.Person;

public class Manager {

	public static void main(String[] args) {
		Student student = new Student();
		student.defaultSetting();
		System.out.println("name : " + student.name);
		System.out.println("height : " + student.getHeight());
		System.out.println("weight : " + student.getWeight());
		System.out.println("age : " + student.getAge());
		
		Person person = new Person("홍길동", 160, 20, 40);
		System.out.println("name : " + person.name);
		System.out.println("height : " + person.getHeight());
		System.out.println("weight : " + person.getWeight());
		System.out.println("age : " + person.getAge());
		
		
		
	}
}
