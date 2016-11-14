package com.demo.subscription.gateways;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

    private final String id;
    private final String type;
    private final String email;

    public Account() {
        id = null;
        type = null;
        email = null;
    }

    public Account(String id, String type, String email) {
        this.id = id;
        this.type = type;
        this.email = email;
    }


    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getEmail() {
        return email;
    }
}