package m1to30.M13_Solution;

public class KickBoard extends DeliveryType {

	public KickBoard() {
		super("킥보드");
	}

	public KickBoard(String name) {
		super(name);
	}

	@Override
	void work() {
		System.out.println(name + " (으/)로 배달을 수행중입니다.");
	}
	
}
