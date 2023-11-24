package fi.haagahelia.customer.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Customer", description = "Customer management APIs")
@RestResource
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
}

