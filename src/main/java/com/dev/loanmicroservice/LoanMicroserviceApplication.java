package com.dev.loanmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LoanMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanMicroserviceApplication.class, args);
	}

	@Bean
	public InMemoryHttpExchangeRepository htttpTraceRepository() {
		return new InMemoryHttpExchangeRepository();
	}

}
