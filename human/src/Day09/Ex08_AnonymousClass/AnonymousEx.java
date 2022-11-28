package Day09.Ex08_AnonymousClass;

public class AnonymousEx {

	public static void main(String[] args) {

		Anonymous anonymous = new Anonymous();

		anonymous.tv.turnOn();

		anonymous.methodA();

		anonymous.methodB(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다");
			}
		});

	}
}
