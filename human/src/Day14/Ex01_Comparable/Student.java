package Day14.Ex01_Comparable;

public class Student implements Comparable<Student> {

	String name;
	int age;
	int grade;
	
	// 생성자
	public Student() {
		
	}
	
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	// 게터 세터
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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	// 투스트링
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}

	@Override
	public int compareTo(Student o) {
		// 이름순
		int gap = this.getName().compareTo( o.getName() );
		// 해당객체가 더 앞선 순서 : 음수
		// 순서가 같다          : 0
		// 해당객체가 더 뒤쪽 순서 : 양수
		return gap;
	}
	
	
	
	
}
