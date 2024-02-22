package dev.tau.listmapprops.list;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountPropertiesTest {

    @Autowired
    AccountProperties properties;

    @Test
    void shouldListAllAccounts() {
        List<Account> accounts = properties.accounts();
        assertEquals(4, accounts.size());
    }

    @Test
    void shouldGetNordeaAccount() {
        Account account = properties.accounts().getFirst();
        assertEquals("nordea", account.name());
        assertEquals("100100", account.username());
        assertEquals("nordea.fi", account.url());
    }

    @Test
    void shouldGetSpankkiAccount() {
        Account account = properties.accounts().getFirst();
        assertEquals("spankki", account.name());
        assertEquals("200100", account.username());
        assertEquals("spankki.fi", account.url());
    }

    @Test
    void shouldGetOpAccount() {
        Account account = properties.accounts().getFirst();
        assertEquals("op", account.name());
        assertEquals("300100", account.username());
        assertEquals("op.fi", account.url());
    }

    @Test
    void shouldGetPaypalAccount() {
        Account account = properties.accounts().getFirst();
        assertEquals("paypal", account.name());
        assertEquals("400100", account.username());
        assertEquals("paypal.com", account.url());
    }
}