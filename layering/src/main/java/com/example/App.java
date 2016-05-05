package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.example.domain.Customer;
import com.example.service.CustomerService;

@EnableAutoConfiguration
@ComponentScan
public class App implements CommandLineRunner{
	@Autowired
	CustomerService customerService;
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		customerService.save(new Customer(1, "Minseok", "Lee"));
		customerService.save(new Customer(2, "Jihoon", "Lee"));
		customerService.save(new Customer(3, "Goeun", "Kim"));
		
		customerService.findAll().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
