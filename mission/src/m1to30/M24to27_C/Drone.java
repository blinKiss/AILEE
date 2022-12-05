package m1to30.M24to27_C;

public class Drone implements RemoteControl {
	
	int battery;
	int speed;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("전원 On");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("전원 Off");
	}
	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		if (speed > RemoteControl.MAX_SPEED) {
			this.speed = RemoteControl.MAX_SPEED;
		}
		else if(speed < RemoteControl.MIN_SPEED) {
			this.speed = RemoteControl.MIN_SPEED;
		}
		else {
			this.speed = speed;
		}
		System.out.println("현재 속도 : " + this.speed);
	}
	
	
	@Override
	public void changeBattery() {
		// TODO Auto-generated method stub
		System.out.println("배터리 교환");
	}
	

}
