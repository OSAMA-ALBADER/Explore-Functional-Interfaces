package com.example.lambda.expressions.Function;
@FunctionalInterface
public interface SuggestionProcessor {
    void suggestion (String suggestion, double rate,String status );
}

