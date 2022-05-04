package springweb.a02_mvc.a02_service;
// springweb.a02_mvc.a02_service.A03_FileService

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import springweb.a02_mvc.a03_dao.A03_FileDao;
import springweb.vo.FileInfo;

@Service
public class A03_FileService {
	
	@Autowired
	private A03_FileDao dao;
	
	// 파일업로드 경로 정보 가져오기..
	@Value("${upload}")
	private String upload;
	
	public String uploadFile(MultipartFile mf) {
		// 1. 파일명 가져오기
		String fname = mf.getOriginalFilename();
		// 2. 파일객체 만들기.
		System.out.println("경로와파일명:"+upload+fname);
		File file = new File(upload+fname);
		// 3. MultipartFile에서 파일객체로 변환하기
		String result="";
		try {
			mf.transferTo(file);
			
			// 업로드 된 파일 정보를 DB에 등록 
			FileInfo ins = new FileInfo(upload, fname, "");
			dao.insertFileInfo(ins);
			
			result="업로드 성공";
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="에러발생1: "+e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="에러발생2: "+e.getMessage();
		} catch (Exception e) {
			e.printStackTrace();
			result="에러발생3: "+e.getMessage();
		} 
		System.out.println("파일업로드:"+result);
		return result;
	}
	public ArrayList<FileInfo> getFileList(){
		return dao.getFileList();
	}
}
