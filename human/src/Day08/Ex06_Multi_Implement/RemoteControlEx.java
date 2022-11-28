package Day08.Ex06_Multi_Implement;

public class RemoteControlEx {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
		
		rc.turnOn();
		searchable.search("youtube.com");
		rc.setVolume(8);
		rc.turnOff();
	}
}
