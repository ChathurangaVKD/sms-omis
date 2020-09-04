package com.omis.universitymanagementsystem;
import com.omis.universitymanagementsystem.service.MailService;
import com.omis.universitymanagementsystem.bean.Mail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UniversityManagementSystemApplicationTests {

	@Autowired
	private MailService emailService;

	/**
	 *testing notification email sending
	 */

	@Test
	public void testEmail() {
		Mail mail = new Mail();
		mail.setMailTo("isurushalika2011@yahoo.com");
		mail.setMailFrom("shalikaisuru@gmail.com");
		mail.setMailSubject("Test");
		mail.setMailContent("testing");
		emailService.sendEmail(mail);
	}
}
