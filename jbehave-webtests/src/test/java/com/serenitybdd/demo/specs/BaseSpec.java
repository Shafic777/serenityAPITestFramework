package com.serenitybdd.demo.specs;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.serenitybdd.model.responce.LoginResponse;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
//import org.codehaus.jackson.map.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;

public class BaseSpec {

    @Autowired
    LoginResponse loginResponseObject;

    ObjectMapper mapper = new ObjectMapper();

    public static EnvironmentVariables envVariables = SystemEnvironmentVariables.createEnvironmentVariables();
    String basePath="http://"+envVariables.getProperty("hostname")+":"+envVariables.getProperty("port");




    public LoginResponse resultMapper(ValidatableResponse loginRes) {
        try {
           // mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL)
            loginResponseObject = mapper.readValue(loginRes.toString().trim(), LoginResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loginResponseObject;
    }
}
