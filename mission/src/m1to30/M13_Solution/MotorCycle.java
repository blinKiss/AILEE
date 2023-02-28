package m1to30.M13_Solution;

public class MotorCycle extends DeliveryType {

	public MotorCycle() {
		super("오토바이");
	}

	public MotorCycle(String name) {
		super(name);
	}

	@Override
	void work() {
		System.out.println(name + " (으/)로 배달을 수행중입니다.");
	}
	
}