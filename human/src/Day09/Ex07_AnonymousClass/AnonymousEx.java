package Day09.Ex07_AnonymousClass;

public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		
		// 익명 객체 : child
		anonymous.child.work();
		
		anonymous.methodA();
		
		// 익명 객체 생성해서, 인자로 전달
		anonymous.methodB(
				new Person() {
//					void soccer() {
//						System.out.println("축구를 합니다");
//					}
// 위쪽 원본 = 사용이 불가하여 주석처리 error message : never used

					@Override
					void work() {
						System.out.println("훈련을 합니다");
					}
					
					
				}
		);
		
		
	}
	
}
