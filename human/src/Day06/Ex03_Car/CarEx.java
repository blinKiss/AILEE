package Day06.Ex03_Car;

public class CarEx {

	public static void main(String[] args) {
		// 객체 생성
		Car car = new Car();
		car.model = "Genesis";
		// car.speed = 100;
		// private 변수라서, speed에 접근이 불가능
		// 이런경우 우회해서 접근해야함
		car.setSpeed(100);
		
		System.out.println(car.model);
		System.out.println("speed : " +car.getSpeed());
		
	}
}
