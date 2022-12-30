package com.example.tennisgame.model.result;

public abstract class Result {

    private String description;

    protected Result(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
