package m1to30.M18to23_C;

public class Circle extends Shape { // Shape 클래스를 구현하시오

	double radius; // 멤버변수로 반지름 길이를 저장할 변수를 선언하시오
	
	public Circle() { //생성자를 정의하시오
		super();
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// getter, setter 메소드를 정의하시오
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// toString() 메소드를 재정의하시오
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return Math.PI * radius * 2;
	}
	

	
	

	
}
