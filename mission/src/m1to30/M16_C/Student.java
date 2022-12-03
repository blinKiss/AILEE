package m1to30.M16_C;

import java.util.Comparator;

public class Student implements Comparator<Student> {

	// 번호, 이름, 성적, 반
	private int no;
	private String name;
	private int score;
	private String className;
	
	// 생성자
	public Student() {
		this(0, "", 0, "");
	}

	public Student(int no, String name, int score, String className) {
		super();
		this.no = no;
		this.name = name;
		this.score = score;
		this.className = className;
	}

	//getter setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	// tostring
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", score=" + score + ", className=" + className + "]";
	}

	@Override
	public int compare(Student o1, Student o2) {
		if( o1.score < o2.score) {
			return 1;
		}
		// o1.age < o2.age
		// o1을 기준으로 o2보다 작을 때, 음수를 리턴 -> 오름차순
		// 양수 리턴 시, o1이 더 앞에 나온다.
		if( o1.score > o2.score) {
			return -1;
		}
		
			
		return 0;
	}
	
	
	
	
	
	
}
