package m1to30.M13_Solution;

public class Coffee extends Drink {

	public Coffee() {
		super("커피");
	}

	public Coffee(String name) {
		super(name);
	}

	@Override
	public int getPower() {
		System.out.println(this.name + " (을/)를 마셨습니다.");
		return 30;
	}
	
}