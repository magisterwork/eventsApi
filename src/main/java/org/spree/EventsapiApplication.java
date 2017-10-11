package org.spree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class EventsapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventsapiApplication.class, args);
	}
}
