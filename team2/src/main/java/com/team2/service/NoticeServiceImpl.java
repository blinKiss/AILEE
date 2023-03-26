package com.team2.service;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.team2.domain.Notice;
import com.team2.domain.Files;
import com.team2.domain.Page;
import com.team2.mapper.NoticeMapper;
import com.team2.mapper.FileMapper;
import com.team2.utils.FileUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service			// 컨테이너의 빈으로 등록, 비즈니스 로직을 처리하는 서비스로 구분
public class NoticeServiceImpl implements NoticeService {
	
	// 업로드 경로
	@Value("${upload.path}")			// application.properties 의 속성값을 지정
	private String uploadPath; 
	
	@Autowired
	private NoticeMapper mapper;
	
	@Autowired
	private FileMapper fileMapper;
	
	@Autowired
	private FileUtil fileUtil;
	
	@Override
	public List<Notice> list() throws Exception {
		// 처리 로직
		return mapper.list();
	}

	@Override
	public Notice read(int ntNo) throws Exception {
		
		return mapper.read(ntNo);
	}

	@Override
	public int insert(Notice notice) throws Exception {
		
		// 게시글 등록
		int result = mapper.insert(notice);
		
		if( result == 0 ) return result;		// 게시글 등록이 안 되면, 파일도 업로드X
		
		// 실제 파일을 업로드 경로에 복사
		MultipartFile[] files = notice.getFiles();
		
		for (MultipartFile file : files) {
			byte[] fileData = file.getBytes();			// 파일 데이터
			
			// 파일명 중복 방지
			// 고유한 랜덤 문자열을 생성하는 객체
			UUID uid = UUID.randomUUID();
			String fileName = file.getOriginalFilename(); 	// 실제 파일 명
			// (UID)_(실제파일명)	- ex) UID_강아지.png
			fileName = uid.toString() + "_" + fileName;

			// 업로드할 파일
			File uploadFile = new File( uploadPath, fileName );		// 파일경로, 파일명
			
			// 스프링 파일 복사 유틸
			FileCopyUtils.copy(fileData, uploadFile);
			
			// 아래는 FileCopyUtils 로 대체
//			FileOutputStream fos = new FileOutputStream( uploadFile );
//			fos.write(fileData);
//			fos.close();

			
			// 업로드된 파일 정보를 DB 에 등록
			// 업로드된 파일 정보
			Files uploadedFile = new Files();
			uploadedFile.setFileName(fileName);
			uploadedFile.setFilePath(uploadPath + fileName);
			uploadedFile.setParentTable("notice");
			
			fileMapper.insert(uploadedFile);
			
		}
		
		
		
		return result;
	}

	@Override
	public int update(Notice notice) throws Exception {
		
		return mapper.update(notice);
	}

	@Override
	public int delete(int ntNo) throws Exception {
		
		// 첨부된 파일 목록 조회
		Files file = new Files();
		file.setParentTable("notice");
		file.setParentNo(ntNo);
		List<Files> fileList = fileMapper.listByParentNo( file );
		
		// 파일 목록 삭제
		for (Files deleteFile : fileList) {
			
			String filePath = deleteFile.getFilePath();
			int fileNo = deleteFile.getFileNo();
			log.info("삭제 파일 번호 : " + fileNo);
			
			// 실제 파일 삭제
			boolean result = fileUtil.delete(filePath);
			
			if( result ) {
				// DB 파일 정보 삭제
				fileMapper.delete(fileNo);
			}
			// 파일 삭제 시, 문제 발생
			else {
				log.info("파일 삭제 시, 문제가 발생하였습니다.");
			}
		}
		
		return mapper.delete(ntNo);
	}

	@Override
	public List<Notice> list(String keyword) throws Exception {
		
		return mapper.search(keyword);
	}

	@Override
	public List<Notice> list(Page page) throws Exception {
		
		// totalCount 조회
		int totalCount = mapper.count();
		log.info("totalCount : " + totalCount);
		
		// Page 객체에 totalCount 세팅
		page.setTotalCount(totalCount);
		
		// 페이징 처리하여 게시글 목록 조회
		List<Notice> noticeList = mapper.listWithPage(page);
		
		
		return noticeList;
	}


}
















