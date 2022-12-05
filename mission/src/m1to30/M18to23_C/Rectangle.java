package m1to30.M18to23_C;

	// Shape 클래스를 구현하시오.
public class Rectangle extends Shape {

	double width, height; // 멤버변수로 가로, 높이 길이를 저장할 변수를 선언하시오

	public Rectangle() { // 생성자를 정의하시오.
		super();
	}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// getter, setter 메소드를 정의하시오.
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
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return (width+height)*2; // 직사각형으로 가정
		
	}
	
	

}
