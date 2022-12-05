package m1to30.M18to23_C;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ShapeMaker {

	public static void main(String[] args) { //main() 메소드를 정의 하시오
		Scanner sc = new Scanner(System.in);
		Shape shape = null;
		double width = 0.0;
		double height = 0.0;
		double radius = 0.0;
		
		// 총합
		double roundSum = 0.0;
		double areaSum = 0.0;
		
		// 리스트 : 동적 자료구조, 컬렉션
		// 여기서는 Shape 객체들을 담는 목록
		List<Shape> list = new LinkedList<Shape>();
		
		while(true) {
			// 1. 삼각형, 2. 사각형, 3. 원형 으로 각 도형의 종류를 선택하시오
			System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
			System.out.print("숫자를 입력하여 도형 선택 : ");
			String input = sc.next();
			
			if(input.equals("그만") ) break;
			
			int menuNo = Integer.parseInt(input);	// (문자열) -> (정수) 변환
			switch (menuNo) {
				// 삼각형
			case 1:
				System.out.print("가로 = ");
				width = sc.nextDouble();
				System.out.print("높이 = ");
				height = sc.nextDouble();
				shape = new Triangle(width, height);
				list.add(shape);	// 도형 목록에 삼각형을 추가
				break;
			
				// 사각형
			case 2:
				System.out.print("가로 = ");
				width = sc.nextDouble();
				System.out.print("높이 = ");
				height = sc.nextDouble();
				shape = new Rectangle(width, height);
				list.add(shape);	// 도형 목록에 사각형을 추가
				break;
			
				//원형
			case 3:
				System.out.print("반지름 = ");
				radius = sc.nextDouble();
				shape = new Circle(radius);
				list.add(shape);	// 도형 목록에 원형을 추가
				break;
			}
		} // - while의 끝
		
		for (Shape s : list) {
			if( s instanceof Triangle)
				System.out.print("[삼각형]");
			if( s instanceof Rectangle)
				System.out.print("[사각형]");
			if( s instanceof Circle)
				System.out.print("[원형]");
			
			double area = s.area();
			double round = s.round();

			roundSum += round;
			areaSum += area;
			
			
			System.out.println("둘레 : " + s.round() + " \t");
			System.out.println("넓이 : " + s.area() + " \t");
			System.out.println();
		}
		
		System.out.println("둘레 총합 : " + roundSum);
		System.out.println("넓이 총합 : " + areaSum);
		
		
		
		
		sc.close();
	}
}
