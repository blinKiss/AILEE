package Day08.Ex01_Shape;

public class Circle extends Shape {

	double radius;
	
	public Circle() {
		super();
	}

	
	public Circle(double radius) {
		this.radius = radius;
	}


	@Override
	double area() {
		// (원주율) x (반지름) x (반지름)
		return Math.PI * radius * radius;
	}

	@Override
	double round() {
		// 2 x (원주율) x (반지름)
		return 2 * Math.PI * radius;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	

	
}
