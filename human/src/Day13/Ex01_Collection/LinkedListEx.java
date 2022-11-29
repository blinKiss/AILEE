package Day13.Ex01_Collection;

import java.util.LinkedList;
import java.util.Scanner;

/*
 ArrayList : 
 순차적으로 추가/삭제  - 빠르다
 중간에 추가/삭제 - 느리다
 검색 - 빠르다
 
 LinkedList : 
 순차적으로 추가/삭제 - 느리다
 중간에 추가/삭제 - 빠르다
 검색 - 느리다
 */

public class LinkedListEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
	
		// Board 클래스
		LinkedList<Board> boardlist = new LinkedList<>();
		
		do {
			System.out.println("1. 게시글 쓰기");
			System.out.println("0. 종료");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 0) {
				break;
			}
			if(menu == 1) {
				System.out.print("제목 : ");
				String title = sc.nextLine();
				
				System.out.print("작성자 : ");
				String writer = sc.nextLine();
		
				System.out.print("내용 : ");
				String content = sc.nextLine();

				Board board = new Board();
				board.setTitle(title);
				board.setWriter(writer);
				board.setContent(content);
				
				//객체 추가
				boardlist.add(board);
			}
		
			
			for (Board board : boardlist) {
				System.out.println(board);
			}
		}while (true);
			
		sc.close();


	}
	
	
	
	
	
	
}
