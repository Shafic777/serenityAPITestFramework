package com.serenitybdd.demo.specs;


import com.serenitybdd.model.responce.LoginResponse;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.codehaus.jackson.map.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;

public class BaseSpec {

    @Autowired
    LoginResponse loginResponseObject;

    ObjectMapper mapper = new ObjectMapper();

    public static EnvironmentVariables envVariables = SystemEnvironmentVariables.createEnvironmentVariables();

  //  String myCustomProperty = variables.getProperty("my.custom.property");

    public LoginResponse resultMapper(String loginRes) {
        try {
           // mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL)
            loginResponseObject = mapper.readValue(loginRes.toString(), LoginResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loginResponseObject;
    }
}
