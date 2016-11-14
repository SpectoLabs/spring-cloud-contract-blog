package com.demo.account.services;

import com.demo.account.domains.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public Account getById(String id) {
        return new Account(id, "friends", "tom@api.io");
    }
}
