package fi.haagahelia.customer;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.customer.domain.Customer;
import fi.haagahelia.customer.domain.CustomerRepository;
import fi.haagahelia.customer.domain.Training;
import fi.haagahelia.customer.domain.TrainingRepository;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(CustomerRepository repository, TrainingRepository trepository) {
		return (args) -> {
			Customer c = new Customer("John", "Johnson", "5th Street", "23110", "Flintsone", "john@mail.com", "232-2345540");
			repository.save(c);
			Customer c2 = new Customer("Mary", "Philips", "Hill Street 3", "23322", "Flintsone", "m.philips@mail.com", "232-310122");
			repository.save(c2);
			Customer c3 = new Customer("Dan", "Davidson", "Main Road 32 B", "23130", "Flintsone", "dan.d@mail.com", "232-1227006");
			repository.save(c3);
		
			Training t = new Training(new Date(), 60, "Spinning");
			t.setCustomer(c);
			trepository.save(t);
			t = new Training(new Date(), 30, "Gym training");
			t.setCustomer(c);
			trepository.save(t);
			
			t = new Training(new Date(), 90, "Gym training");
			t.setCustomer(c2);
			trepository.save(t);
			t = new Training(new Date(), 60, "Fitness");
			t.setCustomer(c2);
			trepository.save(t);
			t = new Training(new Date(), 60, "Spinning");
			t.setCustomer(c2);
			trepository.save(t);

			t = new Training(new Date(), 45, "Gym training");
			t.setCustomer(c3);
			trepository.save(t);
			t = new Training(new Date(), 45, "Zumba");
			t.setCustomer(c3);
			trepository.save(t);
			t = new Training(new Date(), 60, "Zumba");
			t.setCustomer(c3);
			trepository.save(t);			
		};
	}

}
