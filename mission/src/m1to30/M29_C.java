package m1to30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class M29_C {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("노", "답");
		map.put("한글", "대학교");
		map.put("영어", "University");
//		map.put("한글", "수업");
//		map.put("영어", "class");
//		map.put("한글", "행복");
//		map.put("영어", "Happiness");
		
		System.out.println("입력한 단어 수 : " + map.size());
		
		map.clear();
		map.put("한글", "대학교");
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			String value = map.get(key);
			System.out.println(">>" + key + " : " + value);
		}
		map.clear();
		map.put("영어", "University");
		Set<String> keySet1 = map.keySet();
		for (String key : keySet1) {
			String value = map.get(key);
			System.out.println(">>" + key + " : " + value);
		}
		map.clear();
		map.put("한글", "수업");
		Set<String> keySet2 = map.keySet();
		for (String key : keySet2) {
			String value = map.get(key);
			System.out.println(">>" + key + " : " + value);
		}
		map.clear();
		map.put("영어", "class");
		Set<String> keySet3 = map.keySet();
		for (String key : keySet3) {
			String value = map.get(key);
			System.out.println(">>" + key + " : " + value);
		}
		map.clear();
		map.put("한글", "행복");
		Set<String> keySet4 = map.keySet();
		for (String key : keySet4) {
			String value = map.get(key);
			System.out.println(">>" + key + " : " + value);
		}
		map.clear();
		map.put("영어", "Happiness");
		Set<String> keySet5 = map.keySet();
		for (String key : keySet5) {
			String value = map.get(key);
			System.out.println(">>" + key + " : " + value);
		}
		map.clear();
		map.put("한글", "수업");
		map.put("영어", "class");
		System.out.println("검색할 단어 : " + map.get("한글"));
		
		System.out.println(">>"+'"'+map.get("한글")+" "+'"'+" "+"은 영어로 "+'"' + map.get("영어")+'"'+" 입니다.");
		
		
		// 모든 키를 가져온다 : keySet()
		map.clear();
		
		System.out.println("검색할 단어 : " + map.size());
		System.out.println("종료합니다.");
	}
}
