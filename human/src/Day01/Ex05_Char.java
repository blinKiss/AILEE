package Day01;

public class Ex05_Char {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int uniCode = c1;
		
		char b = (char) (c2 + 1); // 강제타입변환 작은타입 작은타입값 = (작은타입) 큰타입값
		System.out.println(b);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
		

	}

}
