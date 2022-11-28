package Day08.Ex03_Animal;

public abstract class Animal {

	public String kind;
	
	
	// 메소드 - 숨쉬기
	public void breathe() {
		System.out.println("산소를 마십니다.");
	}
	
	// 추상 메소드 - 소리내기
	public abstract void sound();
}
