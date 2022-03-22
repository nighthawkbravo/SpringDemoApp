package com.example.demo.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


// This class was meant to hold a JSON that has a type (i.e. success) and value (data) But the url
// being requested from only returns the data. Therefore this class is no longer necessary however, I
// left it here as a reminder for myself.
@JsonIgnoreProperties(ignoreUnknown = true)
public class Blood {
    private String type;
    private Value value;

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
        return "Blood{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}

