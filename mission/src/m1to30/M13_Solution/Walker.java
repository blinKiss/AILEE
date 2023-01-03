package m1to30.M13_Solution;

public class Walker extends DeliveryType {

	public Walker() {
		super("도보");
	}

	public Walker(String name) {
		super(name);
	}

	@Override
	void work() {
		System.out.println(name + " (으/)로 배달을 수행중입니다.");
	}
}