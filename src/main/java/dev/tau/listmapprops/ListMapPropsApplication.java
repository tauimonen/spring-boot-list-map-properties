package dev.tau.listmapprops;

import dev.tau.listmapprops.list.AccountProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(AccountProperties.class)
@SpringBootApplication
public class ListMapPropsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListMapPropsApplication.class, args);
	}

}
