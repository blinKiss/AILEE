package com.human.service;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.human.domain.Board;
import com.human.domain.Files;
import com.human.domain.Page;
import com.human.mapper.BoardMapper;
import com.human.mapper.FileMapper;
import com.human.utils.FileUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service	// 컨테이너의 빈으로 등록, 비즈니스 로직을 처리하는 서비스로 구분
public class BoardServiceImpl implements BoardService {
		
	// 업로드 경로
	@Value("${upload.path}")		// application.properties의 속성값을 지정
	private String uploadPath;
	
	@Autowired
	private BoardMapper mapper;
	
	@Autowired
	private FileMapper fileMapper;
	
	@Autowired
	private FileUtil fileUtil;
	
	@Override
	public List<Board> list() throws Exception {
		// 처리 로직
		return mapper.list();
	}

	@Override
	public Board read(int boardNo) throws Exception {

		return mapper.read(boardNo);
	}

	@Override
	public int insert(Board board) throws Exception {
		
		// 게시글 등록
		int result = mapper.insert(board);
		
		if( result == 0 ) return result;	// 게시글 등록이 안되면,파일도 업로드 X 
		
		// 실제 파일을 업로드 경로에 복사
		MultipartFile[] files = board.getFiles();
		
		for (MultipartFile file : files) {
			byte[] fileData = file.getBytes();	// 파일 데이터

			// 파일명 중복 방지
			// 고유한 랜덤 문자열을 생성하는 객체
			UUID uid = UUID.randomUUID();
			String fileName = file.getOriginalFilename();	// 실제 파일명
			// (UID)_(실제파일명) - ex) UID_강아지.png
			fileName = uid.toString() + "_" + fileName;
			
			// 업로드할 파일
			File uploadFile = new File(uploadPath, fileName);
			
			// 스프링 파일 복사 유틸
			FileCopyUtils.copy(fileData, uploadFile);
			
			
			// 아래는 FileCopyUtils로 대체
//			FileOutputStream fos = new FileOutputStream( uploadFile );
//			fos.write(fileData);
//			fos.close();
			
			// 업로드된 파일 정보
			Files uploadedFile = new Files();
			uploadedFile.setFileName(fileName);
			// C:/god/upload/ + UID_강아지.png
			uploadedFile.setFilePath(uploadPath + fileName);
			uploadedFile.setParentTable("board");
			// parentNo(boardNo)는 게시글 등록 시, 증가한 시퀀스 번호로 세팅
			
			fileMapper.insert(uploadedFile);
			
			
			
		}
		
		// 업로드된 파일 정보를 DB에 등록
		
		return result;
	}

	@Override
	public int update(Board board) throws Exception {
		
		return mapper.update(board);
	}

	@Override
	public int delete(int boardNo) throws Exception {
		
		// 첨부된 파일 목록 조회
		Files file = new Files();
		file.setParentTable("board");
		file.setParentNo(boardNo);
		List<Files> fileList = fileMapper.listByParentNo( file );
		
		// 파일 삭제 목록
		for(Files deleteFile : fileList) {
			
			String filePath = deleteFile.getFilePath();
			int fileNo = deleteFile.getFileNo();
			log.info("삭제 파일 번호 : " + fileNo);
			
			boolean result = fileUtil.delete(filePath);
			
//			int result = fileMapper.delete(fileNo);
			
			if( result ) {
				// DB 파일 정보 삭제
				fileMapper.delete(fileNo);
			}
			// 파일 삭제 시, 문제 발생
			else {
				log.info("파일 삭제 시, 문제가 발생하였습니다");
			}
		}
		
		return mapper.delete(boardNo);
	}

	@Override
	public List<Board> list(String keyword) throws Exception {
		
		return mapper.search(keyword);
	}

	@Override
	public List<Board> list(Page page) throws Exception {
		
		// totalCount 조회
		int totalCount = mapper.count();
		log.info("totalCount : " + totalCount);
		
		// Page 객체에 totalCount 세팅
		page.setTotalCount(totalCount);
		
		// 페이징 처리하여 게시글 목록 조회
		List<Board> boardList = mapper.listWithPage(page);
		
		
		return boardList;
	}
}
