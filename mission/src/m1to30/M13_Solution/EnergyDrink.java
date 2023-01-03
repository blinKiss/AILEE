package m1to30.M13_Solution;

public class EnergyDrink extends Drink {

	public EnergyDrink() {
		super("에너지 드링크");
	}

	public EnergyDrink(String name) {
		super(name);
	}

	@Override
	public int getPower() {
		System.out.println(this.name + " (을/)를 마셨습니다.");
		return 50;
	}

	
}
