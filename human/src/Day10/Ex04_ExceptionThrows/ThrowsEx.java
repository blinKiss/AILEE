package Day10.Ex04_ExceptionThrows;

public class ThrowsEx {

	public static void main(String[] args) {

		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println("클래스가 존재하지 않습니다");
		}
	}

	// 예외 떠넘기기
	public static void findClass() throws ClassNotFoundException {
		// Class.forName
		// : "패캐지.클래스명"에 존재하는 클래스 객체를 반환하는 메소드
		// Class c = Class.forName("java.lang.xxxx");
		// 위쪽 원본 c가 사용되지 않아 주석처리 : c not used
	}
}
