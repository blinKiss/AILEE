package Day12.Ex02_WildCard;

// 제네릭 클래스 정의
public class Course<T> {

	private String name;
	private T[] students; // 제네릭타입의 배열
	
	public Course(String name, int capacity) {
		this.name = name;
		// Object 배열요소 생성
		// (T[]) 제네릭타입으로 변환
		students = (T[]) (new Object[capacity]);
	}
	
	public String getName() {
		return name; 
	}
	public T[] getStudents() {
		return students; 
	}
	
	public void add(T t) {
		// 비어있는 배열요소에 전달받은 객체를 대입
		for (int i = 0; i < students.length; i++) {
			if( students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	
	
	
	
}
