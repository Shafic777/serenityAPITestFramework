package com.serenitybdd.steps;

import com.serenitybdd.fixtures.SignUpRequestData;
import com.serenitybdd.model.request.SignUpRequest;
import com.serenitybdd.model.responce.LoginResponse;
import com.serenitybdd.specs.SignUpSpec;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class SignUpSteps {
    @Autowired
    SignUpRequestData signUpRequestDataObj;

    @Autowired
    SignUpRequest signUpRequest;

    SignUpSpec signUpSpecObj =new SignUpSpec();

    @Given("new customer credentials")
    public void givenNewCustomenrDetails() throws IOException {

        signUpRequest=SignUpRequestData.defaultSignUp();
        System.out.println(signUpRequest);
    }

    @Then("I should be able to signup new customer")
    public void thenIShouldBeableToCreatenewCustomer() {

        LoginResponse res= signUpSpecObj.createNewUser(signUpRequest);
//        assertThat(res.getIsSuccess(),true);

    }
}
