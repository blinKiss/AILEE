package Day15.Board;

import java.util.List;
import java.util.Scanner;

import Day15.JDBConnection;
import Day15.Board.DAO.BoardDAO;
import Day15.Board.DTO.Board;

public class Main {

	static Board board;
	static List<Board> boardList;
	static Scanner sc = new Scanner(System.in);
	static BoardDAO dao = new BoardDAO();
	
	
	public static void menu() {
		System.out.println("********* 게시판 *********");
		System.out.println("** 1. 게시글 쓰기 *********");
		System.out.println("** 2. 게시글 수정 *********");
		System.out.println("** 3. 게시글 삭제 *********");
		System.out.println("** 4. 게시글 조회 *********");
		System.out.println("** 5. 게시글 전체 목록 *****");
		System.out.println("** 0. 종료하기 ***********");
		System.out.print(">> 입력 : ");
	}
	
	public static void main(String[] args) {
		
		int menuNo = 0;
		
		do {
			menu();		// 메뉴판 출력
			menuNo = sc.nextInt();
			sc.nextLine();
			
			if( menuNo == 0) {
				System.out.println("게시판을 종료합니다");
			}
			
			switch (menuNo) {
			case 1: menuWrite();
						break;
			case 2: menuUpdate();
						break;
			case 3: menuDelete();
						break;
			case 4: menuSelect();
						break;
			case 5: menuList();
						break;

			default:
				System.out.println("(0~5) 사이의 숫자를 입력헤주세요!");
						break;
			}
		} while(true);
	}


	


	private static void menuWrite() {
		System.out.println("********* [글쓰기] *********");
		System.out.print("제목 : ");
		String title = sc.nextLine();
		
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		board  = new Board(title, content, writer);
//		dao.insert(board);
	}
	private static void menuUpdate() {
		System.out.println("********* [수정하기] *********");
		
		System.out.print("게시글 번호 : ");
		int board_no = sc.nextInt();
		
		System.out.print("제목 : ");
		String title = sc.nextLine();
		
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		board  = new Board(title, content, writer);
		board.setBoard_no(board_no);
//		dao.update(board);
		}
	
	private static void menuDelete() {
		System.out.println("********* [삭제하기] *********");
		
		System.out.print("게시글 번호 : ");
//		int board_no = sc.nextInt();
		sc.nextLine();
		
//		dao.delete(board);
		
	}
	

	private static void menuSelect() {
		System.out.println("********* [조회하기] *********");
		
		System.out.print("게시글 번호 : ");
//		int board_no = sc.nextInt();
		sc.nextLine();
		
//		board = dao.select(board_no);
		print(board);
	}
	
	private static void menuList() {
		System.out.println("********* [전체목록] *********");
		boardList = dao.selectList();
		printAll();
	}
	
	private static void printAll() {
		for (Board board : boardList) {
			print(board);
		}
	}
	
	private static void print(Board board) {
		System.out.println("[게시글 번호 : " + board.getBoard_no());
		System.out.println("- 제목 : " + board.getTitle());
		System.out.println("- 작성자 : " + board.getWriter());
		System.out.println("- 내용 : " + board.getContent());
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
