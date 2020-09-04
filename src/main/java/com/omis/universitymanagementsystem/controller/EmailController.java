package com.omis.universitymanagementsystem.controller;

import com.omis.universitymanagementsystem.configuration.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import com.omis.universitymanagementsystem.bean.Mail;
import com.omis.universitymanagementsystem.service.MailService;
import org.springframework.context.ApplicationContext;

@RestController
public class EmailController {

    @Autowired
    private ApplicationContext context;

    /**
     * set email address,subject,sender,email content to sending the mail
     */
    @PostMapping(value = "/sendmail")
    public ResponseEntity<Object> sendmail(@RequestBody MultiValueMap<String, String> values) {

        String emailTo = values.getFirst("emailTo");//Post request should include "emailTo"(receiver email) and its value(in postman "x-www-form-urlencoded" body format)
        String emailFrom = values.getFirst("emailFrom");//Post request should include "emailFrom"(sender email) and its value
        String emailSubject = values.getFirst("emailSubject");//Post request should include "emailSubject" and its value
        String emailContent = values.getFirst("emailContent");//Post request should include "emailContent" and its value
//      String emailAttachment = values.getFirst("emailAttachment");//Post request should include "emailAttachment" and its value
        Mail mail = new Mail();
        mail.setMailFrom(emailFrom);//set senders email address
        mail.setMailTo(emailTo);//set receiver's email address
//      mail.setMailSubject("Notification Email");
//      mail.setMailContent("This a Notification Email!!!\n\nThanks\nOUSL");
        mail.setMailSubject(emailSubject);
        mail.setMailContent(emailContent);
        MailService mailService = (MailService) context.getBean("mailService");
        mailService.sendEmail(mail);

        //return "successfully send the email";//return a String(text) as success msg
        return ResponseHandler.generateResponse(HttpStatus.OK, "successfully send the email", null);//return a json object as response with success message
    }
}
