package Day08.Ex04_Interface;

public interface RemoteControl {

	// 인터페이스 변수는 (public static final) 자동 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	// : (public abstract)를 생략하고 작성할 수 있다.
	void turnOn();				// 전원 on
	void turnOff();				// 전원 off
	void setVolume(int volume);	// 음량 설정
	
	// 디폴트 메소드
	// : 구현 객체에 할당될 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 설정");
		} else {
			System.out.println("음소거 해제");
		}
	}
	
	// static 메소드(정적 메소드)
	// : 구현 객체가 없어도 인터페이스만으로 호출이 가능한 메소드
	static void changeBattery() {
		System.out.println("배터리를 교환");
	}
	
}
