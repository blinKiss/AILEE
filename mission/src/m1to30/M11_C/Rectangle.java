package m1to30.M11_C;

public class Rectangle {

	double width, height;
	double area;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double getArea() {
		// (가로) * (세로)
		return width * height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", area=" + area + "]";
	}

}