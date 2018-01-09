package fi.haagahelia.customer.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface TrainingRepository extends CrudRepository<Training, Long> {

}

