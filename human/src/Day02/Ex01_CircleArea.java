package Day02;

public class Ex01_CircleArea {

	public static void main(String[] args) {
		// 원의 넓이 = πr^2
		final double PI = 3.14;  // 원주율을 상수로 선언
		double radius = 5; 		 // 원의 반지름
		double circleArea = radius * radius * PI;
		
		// 원의 넓이를 출력
		System.out.println("반지름 : " + radius);
		System.out.println("넓이 : " + circleArea);
		
		double radius2 = 10;
		double circleArea2 = Math.pow(radius2, 2) * Math.PI;
		// Math.pow(밑, 제곱) : ex) Math.pow(2, 3) = 2^3
		System.out.println("반지름2 : " + radius2);
		System.out.println("넓이2 : " + circleArea2);
		
		
		
	
	}
}
