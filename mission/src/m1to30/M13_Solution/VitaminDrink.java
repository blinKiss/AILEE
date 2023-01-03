package m1to30.M13_Solution;

public class VitaminDrink extends Drink {

	public VitaminDrink() {
		super("비타민 음료");
	}

	public VitaminDrink(String name) {
		super(name);
	}

	@Override
	public int getPower() {
		System.out.println(this.name + " (을/)를 마셨습니다.");
		return 10;
	}
	
}