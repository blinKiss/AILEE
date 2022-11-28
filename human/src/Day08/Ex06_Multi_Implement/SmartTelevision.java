package Day08.Ex06_Multi_Implement;


// 인터페이스 구현 키워드 : implements
// 다중 인터페이스를 구현하는 클래스
public class SmartTelevision implements RemoteControl, Searchable {

	// 변수
	private int volume;		// 음량

	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		// 유효성 검사
		// 볼륨 최대값을 넘지 못하게 지정
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		// 볼륨 최소값을 넘지 못하게 지정
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} 
		// 유효한 볼륨값 설정
		else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + " 경로를 검색합니다");
	}
	
	
	
}
