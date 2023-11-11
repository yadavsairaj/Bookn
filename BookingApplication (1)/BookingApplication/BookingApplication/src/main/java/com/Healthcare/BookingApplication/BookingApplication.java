package com.Healthcare.BookingApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }, scanBasePackages = {"Controller","Entity","Exception","Service", "Repository"})
//@EnableJpaRepositories
//@SpringBootApplication(scanBasePackages = {"Controller","Entity","Exception","Service", "Repository"})
public class BookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);
	}

}
