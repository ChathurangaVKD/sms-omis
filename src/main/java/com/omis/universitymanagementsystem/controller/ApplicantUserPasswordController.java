package com.omis.universitymanagementsystem.controller;


import com.omis.universitymanagementsystem.configuration.ResponseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ApplicantUserPasswordController {
    /**
     * generate and return random password
     *
     */
    @GetMapping (value = "/applicantuserpassword")
    public ResponseEntity<Object> generatePassword() {

          int password = new Random().nextInt();
          long passwordUnsigned = Integer.toUnsignedLong(password);
          return ResponseHandler.generateResponse(HttpStatus.OK,"successfully return the password", passwordUnsigned);//return a json object as response with password
    }

}
