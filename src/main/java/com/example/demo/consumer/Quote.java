package com.example.demo.consumer;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by zhife on 2017/7/29.
 */

public class Quote {
    private String type;
    private Value value;

    public Quote() {

    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
