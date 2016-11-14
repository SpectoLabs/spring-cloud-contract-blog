package com.demo.subscription.gateways;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class AccountGateway {

    private final RestTemplate restTemplate;
    private final String accountUrl;
    @Autowired
    public AccountGateway(RestTemplate restTemplate, @Value("${account.url}") String accountUrl) {
        this.restTemplate = restTemplate;
        this.accountUrl = accountUrl;
    }

    public Account getById(String accountId) {

        URI uri = UriComponentsBuilder.fromUriString(accountUrl)
                .pathSegment("account", accountId)
                .build()
                .toUri();
        ResponseEntity<Account> response = restTemplate.getForEntity(uri, Account.class);

        return response.getBody();
    }
}
