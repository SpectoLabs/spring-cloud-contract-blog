package com.demo.subscription.services;

import com.demo.subscription.domain.Invoice;
import com.demo.subscription.domain.Subscription;
import com.demo.subscription.gateways.Account;
import com.demo.subscription.gateways.AccountGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

    private final AccountGateway accountGateway;

    @Autowired
    public SubscriptionService(AccountGateway accountGateway) {
        this.accountGateway = accountGateway;
    }


    public Invoice createInvoice(Subscription subscription) {
        Account account = accountGateway.getById(subscription.getAccountId());
        if(account.getType().equals("friends")) {
            return new Invoice(account.getEmail(), 0);
        }

        return new Invoice(account.getEmail(), subscription.getSubscriptionType().getFeeInPenny());
    }
}
