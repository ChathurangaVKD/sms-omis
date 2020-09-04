package com.omis.universitymanagementsystem.service;

import com.omis.universitymanagementsystem.bean.Sms;

/**
 * get the Sms object created in the EmailController
 */
public interface SmsService {
    public String sendSms(Sms sms);
}
