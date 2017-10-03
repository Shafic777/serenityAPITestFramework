package com.serenitybdd.specs;

import com.serenitybdd.model.responce.LoginResponse;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class BaseSpec {

    @Autowired
    LoginResponse loginResponseObject;

    ObjectMapper mapper = new ObjectMapper();

    public LoginResponse resultMapper(String loginRes) {
        try {
            loginResponseObject = mapper.readValue(loginRes, LoginResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
