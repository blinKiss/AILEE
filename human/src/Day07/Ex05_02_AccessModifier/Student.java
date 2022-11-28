package Day07.Ex05_02_AccessModifier;

import Day07.Ex05_01_AccessModifier.Person;

public class Student extends Person {

	public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(String name, int height, int age, int weight) {
			super(name, height, age, weight);
			// TODO Auto-generated constructor stub
		}
	

	public void defaultSetting() {
		name = "이름없음";
		height = 175;
		// age = 20;
		// weight = 60;
		setAge(20);
		setWeight(60);
	}

}