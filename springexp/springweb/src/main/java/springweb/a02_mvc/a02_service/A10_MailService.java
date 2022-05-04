package springweb.a02_mvc.a02_service;

import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import springweb.vo.Mail;

@Service
public class A10_MailService {
	// 컨테이너에 있는 객체 호출
	@Autowired
	private JavaMailSender sender;
	
	public String sendMail(Mail email) {
		String msg = "메일 발송 성공";
		// 1. 멀티 미디어형 메일 데이터 전송.
		MimeMessage mmsg = sender.createMimeMessage();
		try {
			// 2. 제목 설정.
			mmsg.setSubject(email.getTitle());
			// 3. 수신자 설정.
			mmsg.setRecipient(RecipientType.TO, new InternetAddress(email.getReciever()));
			// 4. 내용 설정.
			
			mmsg.setText(email.getContent());
			// 5. 발송 처리
			sender.send(mmsg);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			msg = "메일 발송 에러: " + e.getMessage();
			System.out.println(msg);
		} catch (Exception e) {
			msg = "일반 에러 발생:" + e.getMessage();
		}
		
		return msg;
	}
}
