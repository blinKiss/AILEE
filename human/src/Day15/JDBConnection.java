package Day15;

import java.sql.Statement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBConnection {

	public Connection con;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;

	// 기본 생성자
	public JDBConnection() {

		try {
			// JDBC 드라이버 로드
			// MySQL
			// Class.forName("com.mysql.cj.jdbc.Driver");
			// Oracle
			Class.forName("oracle.jdbc.OracleDriver");
			// DB에 연결
			// URL:[PORT]/[스키마]?옵션파라미터
			// MySQL
			// String url = "jdbc:mysql://localhost:3306/human?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";

			// Oracle
			// jdbc:oracle:thin		- JDBC 드라이버 타입(thin 타입)
			// localhost			- 호스트 주소(IP주소), localhost 또는 127.0.0.1은 현재 PC의 IP를 가리킨다
			// :1521				- 포트번호 (1521은 오라클 DB서버의 기본 포트 번호이다)
			// :xe 또는 :orcl			- SID (서비스 ID // xe와 orcl은 기본ID)
			
			// 학원
			// String url ="jdbc:oracle:thin:@localhost:1521:xe"; // 11g
//			String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // 12c이상
//			String id = "human";
//			String pw = "123456";
			// 집
			String url = "jdbc:oracle:thin:@ddiYong:1521:doremiplay";
			String id = "human";
			String pw = "123456";

			con = DriverManager.getConnection(url, id, pw);
			con.setAutoCommit(false);	// AutoCommit 기능 비활성화

			System.out.println("DB 연결 성공");

		} catch (Exception e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}

	}
}
