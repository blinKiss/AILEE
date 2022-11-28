package Day07.Ex04_StaticMember;

public class StaticMember {

//	static 변수
	static int a;
	static int b;
	int c;
	// final 변수는 선언할 때 반드시 값을 초기화해야한다.
	// final 변수는 상수가 돼서, 값을 바꿀 수 없다.
	static final double PI = 3.141592;
	
	
//	static 메소드
	public static int sum(int x, int y) {
		int sum = a+b+x+y;
		// sum += c;
		// c 는 인스턴스 변수로, 객체가 생성될 때 메모리에 할당된다.
		// static 메소드는 제일 먼저 메모리에 할당되기 때문에
		// 나중에 메모리에 할당되는 c 는 접근할 수 없다.
		return sum;
	}
			
	public static void main(String[] args) {
		// not used : int sum = sum(10,20);
		a = 100;
		StaticMember sm1 = new StaticMember();
		StaticMember sm2 = new StaticMember();
		// 주석은 원본 아랫줄이 수정본 int a1 = sm1.a;
		int a1 = StaticMember.a;
		int c1 = sm1.c = 10;
		// 주석은 원본 아랫줄이 수정본 int a2 = sm2.a;
		int a2 = StaticMember.a;
		int c2 = sm2.c = 20;
		
//		PI = 100;
		
		System.out.println("a1 : " + a1);
		System.out.println("c1 : " + c1);
		System.out.println("a2 : " + a2);
		System.out.println("c2 : " + c2);
		
	}
	
}
