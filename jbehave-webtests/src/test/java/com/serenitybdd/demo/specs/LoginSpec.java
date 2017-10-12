package com.serenitybdd.demo.specs;

import com.serenitybdd.demo.core.ScenarioContext;
import com.serenitybdd.model.responce.LoginResponse;
import com.serenitybdd.constants.Constant;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.model.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;

import static com.serenitybdd.constants.Constant.loginURL;
import static javax.swing.text.DefaultStyledDocument.ElementSpec.ContentType;
import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.rest;

@Component
public class LoginSpec extends BaseSpec {

    @Autowired
    LoginResponse loginResponse;


    String hostname= envVariables.getProperty("serenity.hostname");
    String port=envVariables.getProperty("serenity.port");

    public String getToken()
    {

         ValidatableResponse response = rest().headers("client-id", Constant.client_Id ,"client-secret", Constant.client_Secret,"User-Agent", Constant.user_agent).contentType(io.restassured.http.ContentType.JSON)
                         .post("https://maiw.hue.worksap.com:443/auth/hue/v1/authentication/authenticateClient").then().log().all();


        return response.extract().jsonPath().get("accessToken");


    }

    public LoginResponse login(String username, String password, String access_token)
    {
        HashMap<String,String> loginData = new HashMap();
        loginData.put("login",username);
        loginData.put("password" ,password);



         return rest()
                .headers("client-id", Constant.client_Id ,"User-Agent", Constant.user_agent,"siteId", Constant.Site_id,"storeId", Constant.Store_id,"X-Requested-With","XMLHttpRequest","access-token",access_token)
                .body(loginData)
                .contentType(io.restassured.http.ContentType.JSON)
                .post(basePath+loginURL).then().log().all(true)
                .statusCode( 200 )
                .extract().response().as(LoginResponse.class );


            }


}
