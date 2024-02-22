package dev.tau.listmapprops.list;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties("account")
public record AccountProperties(List<Account> accounts) {

}
