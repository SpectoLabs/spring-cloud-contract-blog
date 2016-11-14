package com.demo.subscription.services;

import com.demo.subscription.domain.Invoice;
import com.demo.subscription.domain.Subscription;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static com.demo.subscription.domain.Subscription.SubscriptionType.MONTHLY;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = "com.demo:account-service:+:stubs:8082", workOffline = true)
public class SubscriptionTest {

    @Autowired
    private SubscriptionService service;

    @Test
    public void shouldGiveFreeSubscriptionForFriends() throws Exception {

        // given:
        String accountId = "12345";
        Subscription subscription = new Subscription(accountId, MONTHLY);

        // when:
        Invoice invoice = service.createInvoice(subscription);

        // then:
        assertThat(invoice.getPaymentDue()).isEqualTo(0);
        assertThat(invoice.getClientEmail()).isNotEmpty();
    }
}
