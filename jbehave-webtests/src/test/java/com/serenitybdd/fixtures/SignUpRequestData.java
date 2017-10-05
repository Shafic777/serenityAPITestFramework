package com.serenitybdd.fixtures;

import com.serenitybdd.model.request.SignUpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.sql.Timestamp;

public class SignUpRequestData {

    @Autowired
    SignUpRequest signUpRequestObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static SignUpRequest defaultSignUp()
    {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long randomLong=timestamp.getTime();
        String randomString = String.valueOf(randomLong);

        SignUpRequest signUpRequestObject=new SignUpRequest();
        signUpRequestObject.setFirstName("APITest FirstName");
        signUpRequestObject.setBirthday("1992-05-03");
        signUpRequestObject.setEmail("APITest"+randomString+"@wap.com");
        signUpRequestObject.setEmailConfirm("APITest"+randomString+"@wap.com");
        signUpRequestObject.setDetailAddress1("Address1");
        signUpRequestObject.setDetailAddress2("Address2");
        signUpRequestObject.setGender(4);
        signUpRequestObject.setPhoneNumber(randomString);
        signUpRequestObject.setPostalCode1("1234567");
        signUpRequestObject.setLastName("Automation LastName");
        signUpRequestObject.setPassword("Test@123");
        signUpRequestObject.setPasswordConfirm("Test@123");
        signUpRequestObject.setUserId("Test"+randomString.substring(6));

        return signUpRequestObject;




    }
}
