package com.example.contactslistingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class ContactsListingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactsListingAppApplication.class, args);
	}

}
