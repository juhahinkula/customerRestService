package fi.haagahelia.customer.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Training", description = "Training management APIs")
@RestResource
public interface TrainingRepository extends CrudRepository<Training, Long> {

}

