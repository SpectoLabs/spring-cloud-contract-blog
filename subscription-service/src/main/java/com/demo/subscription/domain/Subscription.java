package com.demo.subscription.domain;

public class Subscription {

    private final String accountId;
    private final SubscriptionType subscriptionType;

    public Subscription(String accountId, SubscriptionType subscriptionType) {
        this.accountId = accountId;
        this.subscriptionType = subscriptionType;
    }

    public String getAccountId() {
        return accountId;
    }

    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public enum SubscriptionType {
        MONTHLY(999),
        ANNUALY(7999);

        private final int feeInPenny;

        SubscriptionType(int feeInPenny) {
            this.feeInPenny = feeInPenny;
        }

        public int getFeeInPenny() {
            return feeInPenny;
        }
    }
}
