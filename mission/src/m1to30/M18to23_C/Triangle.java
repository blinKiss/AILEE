package m1to30.M18to23_C;



// : Shape 클래스를 상속받아 추상메소드를 오버라이딩 하시오.
public class Triangle extends Shape { // Shape 클래스를 구현하시오.

	double width, height; // 멤버변수로 가로, 높이 길이를 저장할 변수를 선언하시오
	
	// 기본 생성자 - super() 호출
	public Triangle() { // 생성자를 정의하시오.
		super();
	}
	
	// 매개변수가 있는 생성자
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// getter, setter 메소드를 정의하시오
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	// toString() 메소드를 재정의하시오.
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return width * height / 2;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return width * 3;
	}
	

	
}
