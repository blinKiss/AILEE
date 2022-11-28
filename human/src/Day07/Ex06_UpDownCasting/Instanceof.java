package Day07.Ex06_UpDownCasting;

class ItPerson {}
class Planner extends ItPerson {}
class Designer extends ItPerson {}
class Developer extends ItPerson {}


public class Instanceof {

	// A instanceof B
	// : A 인스턴스가 B 클래스의 인스턴스인지 확인하는 키워드
	//   - A = B : true
	//   - A ≠ B : false
	public static void checkInstance(ItPerson itPerson) {
		
		if( itPerson instanceof Planner )
			System.out.println("기획자입니다!");
		if( itPerson instanceof Planner )
			System.out.println("디자이너입니다!");
		if( itPerson instanceof Planner )
			System.out.println("개발자입니다!");
	}
	
	public static void main(String[] args) {
		System.out.println("어떤 직무를 하고 계신가요?");
		checkInstance(new Planner());
		checkInstance(new Designer());
		checkInstance(new Developer());
	}
}
