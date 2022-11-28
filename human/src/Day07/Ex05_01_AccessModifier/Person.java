package Day07.Ex05_01_AccessModifier;

public class Person {

	// 이름, 키, 나이, 체중
	public String name;		// public    	접근 = 모든곳에서
	protected int height;	// protected 	접근 = 같은 패키지, 혹은 상속받은 패키지에서 가능
	int age;				// default 		접근 = 같은 패키지에서 가능
	private int weight;		// private		접근 = 같은 클래스에서 가능
	
	// 생성자
	public Person() {
		
	}

	public Person(String name, int height, int age, int weight) {
		this.name = name;
		this.height = height;
		this.age = age;
		this.weight = weight;
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
	
}
