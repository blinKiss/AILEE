package Day08.Ex07_InterfaceExtends;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA iA = impl;
		iA.methodA();
		System.out.println();
		
		InterfaceB iB = impl;
		iB.methodB();
		System.out.println();
		
		// InterfaceC 는 InterfaceA, InterfaceB를 상속받은 인터페이스로,
		// methodA(), methodB(), methodC() 메소드 모두 호출 가능 
		InterfaceC iC = impl;
		iC.methodA();
		iC.methodB();
		iC.methodC();
		System.out.println();
	}
}
