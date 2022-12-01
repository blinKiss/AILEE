package m1to30.M11;


public class Triangle extends Shape {

	double width, height;
	
	// 기본 생성자 - super() 호출
	public Triangle() {
		super();
	}
	
	
	// 매개변수가 있는 생성자
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {
		// (가로) x (세로) / 2
		return width * height / 2;
	}

	@Override
	double round() {
		// (정삼각형) : (한 변의 길이) * 3
		return width * 3;
	}
	// toString()
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

	
	
}
