package Day15.Board;

import java.text.SimpleDateFormat;
import java.util.Date;
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
	/**
	 * 메뉴판을 출력하는 메소드
	 */
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


	/**
	 * 게시글 쓰기 메소드
	 * - 제목, 작성자, 내용을 입력받아 Board 객체를 생성하고
	 *   DAO 객체로 데이터 삽입 요청 메소드를 호출한다
	 */
	private static void menuWrite() {
		System.out.println("********* [글쓰기] *********");
		System.out.print("제목 : ");
		String title = sc.nextLine();
		
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		board  = new Board(title, content, writer);
		dao.insert(board);
	}
	
	/**
	 * 게시글 수정 메소드
	 * - 수정할 게시글 번호를 입력받고
	 * 제목, 작성자, 내용을 입력받아 Board 객체를 생성한다
	 * - DAO 객체로 데이터 수정 요청 메소드를 호출한다
	 */
	private static void menuUpdate() {
		System.out.println("********* [수정하기] *********");
		
		System.out.print("게시글 번호 : ");
		int board_no = sc.nextInt();
		sc.nextLine();
		
		System.out.print("제목 : ");
		String title = sc.nextLine();
		
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		board  = new Board(title, content, writer);
		board.setBoard_no(board_no);
		dao.update(board);
		}
	
	/**
	 * 게시글 삭제 메소드
	 * - 삭제할 게시글 번호를 입력받는다.
	 * - DAO 객체로 데이터 삭제 요청 메소드를 호출한다
	 */
	private static void menuDelete() {
		System.out.println("********* [삭제하기] *********");
		
		System.out.print("게시글 번호 : ");
		int board_no = sc.nextInt();
		sc.nextLine();
		
		dao.delete(board_no);
		
	}
	

	/**
	 * 게시글 조회 메소드
	 * - 조회할 게시글 번호를 입력받는다
	 * - DAO 객체로 데이터 조회 요청 메소드를 호출한다
	 */
	private static void menuSelect() {
		System.out.println("********* [조회하기] *********");
		
		System.out.print("게시글 번호 : ");
		int board_no = sc.nextInt();
		sc.nextLine();
		
		board = dao.select(board_no);
		print(board);
	}
	
	/**
	 * 전체 게시글 조회 메소드
	 * - DAO 객체로 데이터 전체 조회 요청 메소드를 호출한다
	 * - List<Board> 타입의 게시글 목록을 가져온다
	 * - 게시글 목록 전체 출력 메소드를 호출한다
	 */
	private static void menuList() {
		System.out.println("********* [전체목록] *********");
		boardList = dao.selectList();
		printAll();
	}
	
	/**
	 * 게시글 목록 전체 출력 메소드
	 * - List<Board> 타입의 게시글 전체 목록을 반복하여,
	 *   각 객체를 인자로 개별 출력 메소드를 호출한다
	 */
	private static void printAll() {
		for (Board board : boardList) {
			print(board);
		}
	}
	/**
	 * 게시글 출력 메소드
	 * - Board 타입의 객체를 지정한 문자열 형식에 따라 출력하는 메소드
	 */
	private static void print(Board board) {
		
		if ( board == null) {
			return; // 메소드 종료
		}
		
		System.out.println("[게시글 번호 : " + board.getBoard_no() + "]");
		System.out.println("- 제목 : " + board.getTitle());
		System.out.println("- 작성자 : " + board.getWriter());
		System.out.println("- 내용 : " + board.getContent());
		
		String dateFormat = "yyyy/MM/dd hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date reg_date = board.getReg_date();
		Date upd_date = board.getUpd_date();
		
		String regDate = sdf.format( reg_date );
		String updDate = sdf.format( upd_date );
		
		System.out.println("- 등록일자 : " + regDate);
		System.out.println("- 수정일자 : " + updDate);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
