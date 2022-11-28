package Day04;

public class Ex05_String {
	
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Java"; // b가 사용되지 않아 느낌표가 뜨기에 코드 하단에 사용함
		String c = "Hello";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		System.out.println(a == c);
		System.out.println(a == d);
		System.out.println(a.equals(d));
		
		System.out.println(e == f);
		System.out.println(e.equals(f));
		
		System.out.println(b == e);
		System.out.println();
		System.out.println(a + " " + b);
		// == 		: 해당 변수의 레퍼전스(참조정보)를 비교
		// equals() : 해당 변수의 문자열 자체를 비교
	}

}
