package com.demo.subscription.domain;

public class Invoice {

    private final String clientEmail;
    private final Integer paymentDue;

    public Invoice(String clientEmail, Integer paymentDue) {
        this.clientEmail = clientEmail;
        this.paymentDue = paymentDue;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public Integer getPaymentDue() {
        return paymentDue;
    }
}
