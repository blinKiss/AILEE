package Day07.Ex06_UpDownCasting;

public class UpCasting {

	public static void main(String[] args) {
		// 업캐스팅 (자동 타입 변환)
		// (부모클래스) = (자식클래스)
		Person person = new Student("김휴먼", 20, 1, "뮤지컬학과");
		// 변수
		// Person 	: name, age 
		// Student 	: name, age, grade, major 
		
		System.out.println(person);
		
		// 바인딩 (Binding)
		// : 프로그램에 사용되는 요소의 실제 값을 결정짓는 행위
		// - 정적 바인딩
		//   : 컴파일 시간에 결정
		//     변수 등
		
		// - 동적 바인딩
		//   : 실행 시간에 결정
		//     오버라이딩 등
		System.out.println(person.work());
					
		// 업캐스팅 후, 부모클래스에 있는 변수만 접근 가능
		// System.out.println(person.grade);
		// System.out.println(person.major);
	}
}
