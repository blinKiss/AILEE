package m1to30.M13_Solution;

public class Drink {
	
	String name;
	
	public Drink() {
		this.name = "드링크";
	}

	public Drink(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		System.out.println(this.name + " (을/)를 마셨습니다.");
		return 10;
	}
}
