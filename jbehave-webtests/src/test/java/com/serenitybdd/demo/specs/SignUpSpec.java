package com.serenitybdd.demo.specs;

import com.serenitybdd.model.responce.LoginResponse;
import io.restassured.http.ContentType;
import com.serenitybdd.model.request.SignUpRequest;
import org.springframework.beans.factory.annotation.Autowired;

import static com.serenitybdd.constants.Constant.*;
import static net.serenitybdd.rest.SerenityRest.given;

public class SignUpSpec extends BaseSpec {

    @Autowired
    LoginResponse loginResponseObject;

   public LoginResponse createNewUser(SignUpRequest signUpRequest)
    {
        LoginSpec loginSpecObject = new LoginSpec();


        String Result=
                    given()
                    .headers("client-id",client_Id ,"User-Agent",user_agent,"siteId",Site_id,"storeId",Store_id,"X-Requested-With","XMLHttpRequest","access-token",loginSpecObject.getToken(),"User-Agent",user_agent)
                    .body(signUpRequest)
                    .contentType(ContentType.JSON).log().all()
                    .post(signUpURL).asString();

        loginResponseObject=resultMapper(Result);
        return loginResponseObject;
    }


}
