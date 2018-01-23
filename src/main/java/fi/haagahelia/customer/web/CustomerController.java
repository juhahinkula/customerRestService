package fi.haagahelia.customer.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.haagahelia.customer.domain.Customer;
import fi.haagahelia.customer.domain.CustomerRepository;
import fi.haagahelia.customer.domain.Training;
import fi.haagahelia.customer.domain.TrainingRepository;

@Controller
@ResponseBody 
public class CustomerController {
	@Autowired
	public CustomerRepository repository;

	@Autowired
	public TrainingRepository trepository;
	
    @RequestMapping(value = "/getcustomers")
	List<Customer> getCustomers() {	
		return (List<Customer>) repository.findAll();
	}

    @RequestMapping(value = "/gettrainings")
	List<Training> getTrainings() {	
		return (List<Training>) trepository.findAll();
	}    
	
}
