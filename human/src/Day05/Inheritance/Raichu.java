package Day05.Inheritance;

// 상속 키워드 : 자식클래스 extends 부모클래스
public class Raichu extends Pikachu {

	// 생성자 자동완성 단축키
	// A + S + s : c
	public Raichu() {
		super(200, "super-thunder");
	}

	public Raichu(int energy, String type) {
		super(energy, type);
		
	}
	
	// 메소드 오버라이딩 : 메소드 재정의
	// A + S + s : v 오버라이드
		

	@Override
	public String aAttack() {
		// TODO Auto-generated method stub
		return "백만볼트";
	}

	@Override
	public String bAttack() {
		// TODO Auto-generated method stub
		return "볼트체인지";
	}
	
	
	
	
	
	
}
