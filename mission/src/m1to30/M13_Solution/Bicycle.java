package m1to30.M13_Solution;

public class Bicycle extends DeliveryType{

	public Bicycle() {
		super("자전거");
	}

	public Bicycle(String name) {
		super(name);
	}

	@Override
	void work() {
		System.out.println(name + " (으/)로 배달을 수행중입니다.");
	}
	
}