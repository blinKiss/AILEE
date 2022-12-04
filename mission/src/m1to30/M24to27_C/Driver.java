package m1to30.M24to27_C;

public class Driver {

	public static void main(String[] args) {
		System.out.println("--드론--");
		RemoteControl dCtrl = new Drone();
		dCtrl.turnOn();
		dCtrl.setSpeed(3);
		dCtrl.setSpeed(130);
		dCtrl.turnOff();
		dCtrl.changeBattery();
		System.out.println();
		
		
		System.out.println("--RC카--");
		RemoteControl rCtrl = new RcCar();
		rCtrl.turnOn();
		rCtrl.setSpeed(-1);
		rCtrl.setSpeed(75);
		rCtrl.turnOff();
		dCtrl.changeBattery();
		System.out.println();
		
	}
}
