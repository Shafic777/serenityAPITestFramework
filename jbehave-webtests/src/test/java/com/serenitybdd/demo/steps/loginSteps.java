package com.serenitybdd.demo.steps;


import com.serenitybdd.model.responce.LoginResponse;
import com.serenitybdd.demo.specs.LoginSpec;
//import net.serenitybdd.demo.model.responce.*;
import org.jbehave.core.annotations.*;

import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.is;

import java.io.IOException;

//import net.serenitybdd.demo.specs.*;
import static net.serenitybdd.rest.SerenityRest.given;

public class loginSteps {


    LoginSpec LoginSpec =new LoginSpec();
    public String access_token;

    @Given("a login credentials")
    public void givenALoginCredentials() throws IOException {

        access_token = LoginSpec.getToken();
        System.out.println("access_token"+ access_token);
    }

    @Then("I should be able to login with $username and $password")

    public void whenILoginWithGivenUsernamePassword(String username,String password) {

        LoginResponse res= LoginSpec.login(username,password,access_token);
        assertThat(res.getIsSuccess(),true);

    }


}
