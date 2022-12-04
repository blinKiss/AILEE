package Day08.Ex01_Shape;

public class Rectangle extends Shape {

	double width, height;

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	double area() {
		// (가로) * (세로)
		return width * height;
	}
	
	@Override
	double round() {
		// (정사각형) : (한 변의 길이) * 4
		return width * 4; 
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
}
