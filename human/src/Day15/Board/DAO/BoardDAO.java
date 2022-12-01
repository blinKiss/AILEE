package Day15.Board.DAO;

import java.util.LinkedList;
import java.util.List;

import Day15.JDBConnection;
import Day15.Board.DTO.Board;

public class BoardDAO extends JDBConnection {
	
	// 데이터 목록 조회
	public List<Board> selectList() {
		
		LinkedList<Board> boardList = new LinkedList<>();
		
		String sql = "SELECT * "
				   + "FROM board ";
		
		
		try {
			stmt = con.createStatement();	// 쿼리문 생성
			rs = stmt.executeQuery(sql);	// 쿼리 실행
			
			while( rs.next() ) {
				Board board = new Board();
				board.setBoard_no( rs.getInt("board_no") );
				board.setTitle( rs.getString("title") );
				board.setContent( rs.getString("content"));
				board.setWriter( rs.getString("writer"));
				board.setReg_date( rs.getDate("reg_date"));
				board.setUpd_date( rs.getDate("upd_date"));
				
				boardList.add(board);
			}
		} catch (Exception e) {
			System.out.println("게시글 목록 조회 시, 예외 발생");
			e.printStackTrace();
		}
		
		return boardList;
	}

}
