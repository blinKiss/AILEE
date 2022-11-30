package Day14.Ex01_Comparable;

import java.util.Collections;
import java.util.LinkedList;

public class PersonList {

	public static void main(String[] args) {
		
		Person p1 = new Person("김휴먼" , 44);
		Person p2 = new Person("정에듀" , 56);
		Person p3 = new Person("박리사" , 35);
		Person p4 = new Person("이재석" , 18);
		Person p5 = new Person("윤호식" , 24);
		
		LinkedList<Person> personList = new LinkedList<>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		
		Collections.sort(personList);
		
		for (Person person : personList) {
			System.out.println(person.name + " : " + person.age);
		}
		
		
		
	}
}
