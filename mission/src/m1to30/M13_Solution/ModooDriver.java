package m1to30.M13_Solution;

public class ModooDriver {

	private int power;

	public ModooDriver() {
		this.power = 100;
	}

	public ModooDriver(int power) {
		this.power = power;
	}

	void drive(DeliveryType deliveryType) {
		deliveryType.work();
		System.out.println("활력 : " + this.power);
	}
	
	void drive(DeliveryType deliveryType, Drink drink) {
		if( drink == null ) { 
			drive(deliveryType);
			return;
		}
		this.powerUp(drink);
		deliveryType.work();
		System.out.println("활력 : " + this.power);
	}
	
	void powerUp(Drink drink) {
		this.power += drink.getPower();
	}
	
}
