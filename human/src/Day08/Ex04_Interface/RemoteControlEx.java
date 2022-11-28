package Day08.Ex04_Interface;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl tvRc = new Television();
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(true);
		tvRc.turnOff();
		System.out.println();
		
		RemoteControl speakerRc = new Speaker();
		speakerRc.turnOn();
		speakerRc.setVolume(5);
		speakerRc.setVolume(100);
		speakerRc.setMute(false);
		speakerRc.turnOff();
		System.out.println();
		
		RemoteControl.changeBattery();
	}
}
