package springweb.a02_mvc.a02_service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class A04_FileService {
	@Value("${upload}")
	private String upload;
	
	public String uploadFile(MultipartFile mf) {
		
		String fname = mf.getOriginalFilename();
		
		File file = new File(upload+fname);
		
		String result = "";
		try {
			mf.transferTo(file);
			result="업로드 성공";
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
