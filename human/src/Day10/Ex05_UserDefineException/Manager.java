package Day10.Ex05_UserDefineException;

public class Manager {

	public static void main(String[] args) {
		
		Storage storage = new Storage();
		
		try {

			storage.in(10);		// 물건 10개 출고
			storage.out(20);	// 물건 20개 출고 - 예외발생
			
			
		} catch (StorageOverflowException e) {
			e.printStackTrace();
		}
	}
}
