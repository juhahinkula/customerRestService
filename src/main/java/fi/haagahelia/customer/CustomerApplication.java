package fi.haagahelia.customer;

import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.customer.domain.Customer;
import fi.haagahelia.customer.domain.CustomerRepository;
import fi.haagahelia.customer.domain.Training;
import fi.haagahelia.customer.domain.TrainingRepository;
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
