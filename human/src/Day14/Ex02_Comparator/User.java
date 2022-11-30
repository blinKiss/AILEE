package Day14.Ex02_Comparator;

import java.util.Comparator;

public class User implements Comparator<User> {

	String id;
	String name;
	int age;
	
	public User() {
		
	}

	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(User o1, User o2) {
		
		int gap = o1.getName().compareTo( o2.getName() );
		// o1.name 가 o2.name 보다 더 앞에나오면 음수 --> 가나다순
		// o1.name 가 o2.name 보다 더 뒤에나오면 양수 --> 가나다역순
		return gap;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
