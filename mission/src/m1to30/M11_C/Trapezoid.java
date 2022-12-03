package m1to30.M11_C;

public class Trapezoid {

	double top, bottom, height;
	double area;

	public Trapezoid() {
	}

	public Trapezoid(double top, double bottom, double height) {
		this.top = top;
		this.bottom = bottom;
		this.height = height;
	}

	double getArea() {
		return (top + bottom) * height / 2;
	}

	@Override
	public String toString() {
		return "Trapezoid [top=" + top + ", bottom=" + bottom + ", height=" + height + ", area=" + area + "]";
	}

}
