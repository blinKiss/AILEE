package Day13.Ex01_Collection;

import java.util.Date;

public class Board {

	// 제목, 내용, 작성자, 등록일자, 수정일자
	String title;
	String content;
	String writer;
	Date regDate;
	Date updDate;
	
	// 생성자
	public Board() {
		this("제목없음", "", "이름없음", new Date(), new Date());
	}

	public Board(String title, String content, String writer, Date regDate, Date updDate) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
		this.updDate = updDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writer=" + writer + ", regDate=" + regDate
				+ ", updDate=" + updDate + "]";
	}
	
	
}