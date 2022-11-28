package Day08.Ex05_NoNameObject;

public class RemoteControlEx {

	public static void main(String[] args) {
		// 익명 구현 객체
		// : 클래스를 정의하지 않고도, 이름없이 구현된 객체
		
		RemoteControl rc= new RemoteControl() {
			int volume;
			
			@Override
			public void turnOn() {
				System.out.println("ON");
			}
			
			@Override
			public void turnOff() {
				System.out.println("OFF");
			}
			
			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("volume : " + this.volume);
			}
		};
		rc.turnOn();
		rc.setVolume(50);
		rc.turnOff();
	}
}
