package com.demo.account.contracts;

import com.demo.account.AccountServiceApplication;
import com.demo.account.domains.Account;
import com.demo.account.services.AccountService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.Mockito.when;

@Ignore
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AccountServiceApplication.class)
@WebMvcTest
public class ContractVerifierBase {

    @Autowired
    private WebApplicationContext context;

    @MockBean
    private AccountService accountService;

    @Before
    public void setUp() throws Exception {
        RestAssuredMockMvc.webAppContextSetup(context);
        when(accountService.getById("12345")).thenReturn(new Account("12345", "friends", "tom@api.io"));
    }
}
