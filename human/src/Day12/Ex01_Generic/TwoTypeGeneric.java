package Day12.Ex01_Generic;

// 제네릭기법으로 타입매개변수를 2개 지정
class KeyValue<K, V> {
	
	private K key;
	private V value;
	// K V 입력 후 게터세터 ASs+r
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}


public class TwoTypeGeneric {

	public static void main(String[] args) {
		// 제네릭으로 객체 생성
		// 클래스<타입1,타입2> 객체명 = new 클래스<타입1,타입2>(); new 뒤의 타입 생략가능
		// - 인스턴스 생성하는 클래스 뒤의 타입은 생략 가능
		// KeyValue<String, Integer> kv = new KeyValue<String, Integer>();
		// -> KeyValue<String, Integer> kv = new KeyValue();
		// 생략시에 전구가 떠서 풀어서 쓰는 것으로 수정
		KeyValue<String, Integer> kv = new KeyValue<String, Integer>();
		
		kv.setKey("Java");
		kv.setValue(100);
		
		String key = kv.getKey();
		int value = kv.getValue();
		
		System.out.println("key : " + key);
		System.out.println("value : " + value);
		
		KeyValue<Integer, String> kv2 = new KeyValue<Integer, String>();
		kv2.setKey(100);
		kv2.setValue("Java");
		
		int key2 = kv2.getKey();
		String value2 = kv2.getValue(); 
		
		System.out.println("key2 : " + key2);
		System.out.println("value2 : " + value2);
		
		// Void : 해당 타입에는 변수를 사용하지 않도록 지정
		KeyValue<String, Void> kv3 = new KeyValue<String, Void>();
		kv3.setKey("키 값만");
		String key3 = kv3.getKey();
		System.out.println("key : " + key3);
		
						
	}
}
