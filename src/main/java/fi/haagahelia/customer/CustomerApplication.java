package fi.haagahelia.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.customer.utils.PopulateDB;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(PopulateDB populateDb) {
		return (args) -> {
			populateDb.populate();
		};
	}

}
