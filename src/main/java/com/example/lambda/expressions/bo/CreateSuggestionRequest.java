package com.example.lambda.expressions.bo;

//This class will hold the fields for the request
public class CreateSuggestionRequest {

    private double rate;
    private String suggestion;
    private String status;

    public CreateSuggestionRequest(double rate, String suggestion, String status) {
        this.rate = rate;
        this.suggestion = suggestion;
        this.status = status;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
