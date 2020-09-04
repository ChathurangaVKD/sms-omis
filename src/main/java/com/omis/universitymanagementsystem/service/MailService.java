package com.omis.universitymanagementsystem.service;
import com.omis.universitymanagementsystem.bean.Mail;

/**
 * get the Mail object created in the EmailController
 */
public interface MailService {
    public void sendEmail(Mail mail);
}