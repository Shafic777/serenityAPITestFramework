package com.serenitybdd.model.responce;

public class LoginResponse {

    private String isSuccess;
    private String registrationError;
    private String error;
    private String errors;
    private String successMessage;

    public String getIsSuccess() {
        return isSuccess;
    }
    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getRegistrationError() {
        return registrationError;
    }

    public void setRegistrationError(String registrationError) {
        this.registrationError = registrationError;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
    }


}
