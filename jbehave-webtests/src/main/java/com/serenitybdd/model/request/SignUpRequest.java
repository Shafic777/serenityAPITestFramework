package com.serenitybdd.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.reflections.util.FilterBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SignUpRequest {


        private String birthday;
        private Integer gender;
        private String firstName;
        private String fullNamePhonetic;
        private String phoneNumber;
        private String postalCode1;
        private String email;
        private String userId;
        private String password;
        private String detailAddress2;
        private String detailAddress1;
        private String lastName;

    public String getEmailConfirm() {
        return emailConfirm;
    }

    public void setEmailConfirm(String emailConfirm) {
        this.emailConfirm = emailConfirm;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    private String emailConfirm;
        private String passwordConfirm;




    public String getFullNamePhonetic() {
        return fullNamePhonetic;
    }

    public void setFullNamePhonetic(String fullNamePhonetic) {
        this.fullNamePhonetic = fullNamePhonetic;
    }

    public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public Integer getGender() {
            return gender;
        }

        public void setGender(Integer gender) {
            this.gender = gender;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPostalCode1() {
            return postalCode1;
        }

        public void setPostalCode1(String postalCode1) {
            this.postalCode1 = postalCode1;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getDetailAddress2() {
            return detailAddress2;
        }

        public void setDetailAddress2(String detailAddress2) {
            this.detailAddress2 = detailAddress2;
        }

        public String getDetailAddress1() {
            return detailAddress1;
        }

        public void setDetailAddress1(String detailAddress1) {
            this.detailAddress1 = detailAddress1;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }





}
