package Day07.Ex04_StaticMember;

public class SingleTonTest {

	public static void main(String[] args) {
		SingleTon st01 = SingleTon.getInstance();
		SingleTon st02 = SingleTon.getInstance();
		
		System.out.println(st01==st02);
	}
}
