package m1to30.M11_C;

public class Circle {

	double radius;
	double area;
	double PI = 3.1415926535;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	double getArea() {
		// (원주율) x (반지름) x (반지름)
		return PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area + "]";
	}

}
