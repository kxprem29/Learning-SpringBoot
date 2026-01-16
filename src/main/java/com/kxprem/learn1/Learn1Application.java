package com.kxprem.learn1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Learn1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Learn1Application.class, args);
	}


	// Field Dependency Injection
//	@Autowired
//	private PaymentService paymentService;

//	Constructor dependency injection
    private final PaymentService paymentService;

	public Learn1Application(PaymentService paymentService){
		this.paymentService=paymentService;
	}


	@Override
	public void run(String... args) throws Exception {
		String payment = paymentService.pay();
		System.out.println("Payment done: "+payment);
	}

}
