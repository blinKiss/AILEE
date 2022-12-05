package m1to30.M11_C;

public class Triangle {

	double width, height;
	double area;

	// 기본 생성자 - super() 호출
	public Triangle() {
	}

	// 매개변수가 있는 생성자
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double getArea() {
		// (가로) x (세로) / 2
		return width * height / 2;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", area=" + area + "]";
	}

}
