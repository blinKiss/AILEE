package Ex02;

import java.util.ArrayList;

public class Library {

	public static void main(String[] args) {

	ArrayList<Book> list = new ArrayList<Book>();
	System.out.println("########## 휴먼 스터디 도서관 ##########");
	list.add(new Book("123123", "이게 자바냐", "감자바", "자바 감자바", "33000"));
	list.add(new Book("112112", "정보처리기사", "김휴먼", "국가기술자격", "45000"));
	list.add(new Book("001001", "실무 DB", "박디비", "디비디비딥", "60000"));
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i).getIsbn()+" | "+list.get(i).getTitle()+" | "+list.get(i).getWriter()+" | "+list.get(i).getContent()+" | "+list.get(i).getPrice());
	}
	
		
	}
}
