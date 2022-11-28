package Day10.Ex05_UserDefineException;

// 사용자 정의 예외 클래스 선언
// public class ???Exception extends Exception
public class StorageOverflowException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StorageOverflowException() {
		
	}
	
	public StorageOverflowException(String message) {
		super(message);
	}
	
}

/*
 * public class StorageOverflowException extends Exception {

	public StorageOverflowException() {
		
	}
	
	public StorageOverflowException(String message) {
		super(message);
	}
	
}
별표 안의 내용 전부 원본 첫째줄 StorageOverflowException에 뜨는 느낌표는
serializable을 설정에서 무시처리하거나 이클립스에서 자동수정해주는 걸 이용하면 되는데 후자 선택

 */
