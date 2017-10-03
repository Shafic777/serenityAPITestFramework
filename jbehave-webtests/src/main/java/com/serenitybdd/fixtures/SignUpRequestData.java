package com.serenitybdd.fixtures;

import com.serenitybdd.model.request.SignUpRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;

public class SignUpRequestData {

    @Autowired
    SignUpRequest signUpRequestObject;

    public static SignUpRequest defaultSignUp()
    {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long random=timestamp.getTime();

        SignUpRequest signUpRequestObject=new SignUpRequest();
        signUpRequestObject.setFirstName("APITest_FirstName");
        signUpRequestObject.setBirthday("1992-05-03");
        signUpRequestObject.setEmail("APITest."+random+"@wap.com");
        signUpRequestObject.setDetailAddress1("Address1");
        signUpRequestObject.setDetailAddress2("Address2");
        signUpRequestObject.setGender(1);
        signUpRequestObject.setLastName("Automation_LastName");
        signUpRequestObject.setPassword("test123");
        signUpRequestObject.setUserId("APITest"+random);

        return signUpRequestObject;




    }
}
