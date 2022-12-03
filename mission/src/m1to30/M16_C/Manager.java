package m1to30.M16_C;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class Manager {

	public static void main(String[] args) {
		
		LinkedList<Student> list = new LinkedList<>();
		
		
		
		list = getTxtToList(list);
		printList(list);
	}
	
	// 텍스트 파일 입력
	public static LinkedList<Student> getTxtToList(LinkedList<Student> list) {
		
		
		try {
			// Scanner sc = new Scanner(System.in); // 키보드 입력
			File file = new File("student.txt");
			Scanner sc = new Scanner(file); // 파일 입력
			Student std;
			
			// hasNextLine() : 텍스트의 다음 줄이 있는지 여부를 반환
			while(sc.hasNextLine()) {
				String stn = sc.nextLine(); // 한 줄 읽어옴
				String[] data = stn.split("/");
				// [1][김휴먼[90][백엔드]
				
				int no = Integer.parseInt( data[0]);
				String name = data[1];
				int score = Integer.parseInt( data[2] ); 
				String className = data[3];
				
				std = new Student(no, name, score, className);
				
				list.offer(std);
			}
			
			
			
			
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		return list;
	}
	
	// 리스트 출력
	public static void printList(LinkedList<Student> list) {
		
		Collections.sort(list, new Student());
		
		System.out.println("번호\t이름\t성적\t반");
		while ( !list.isEmpty() ) {
			Student std = list.poll();
			int no = std.getNo();
			String name = std.getName();
			int score = std.getScore();
			String className = std.getClassName();
			
			
			System.out.println(no + "\t" + name + "\t" + score + "\t" + className);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
