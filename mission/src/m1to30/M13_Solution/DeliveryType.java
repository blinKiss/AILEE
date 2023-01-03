package m1to30.M13_Solution;

public class DeliveryType {
	
	String name;
	
	public DeliveryType() {
		this.name = "배달수단";
	}

	public DeliveryType(String name) {
		this.name = name;
	}

	void work() {
		System.out.println("배달을 수행중입니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
