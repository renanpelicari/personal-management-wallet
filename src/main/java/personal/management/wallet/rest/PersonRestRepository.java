package personal.management.wallet.rest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import personal.management.wallet.model.entity.Person;

import java.util.List;

/**
 * {@link Person} {@link MongoRepository}
 */
@RepositoryRestResource(collectionResourceRel = "person", path = "people", itemResourceRel = "person")
public interface PersonRestRepository extends MongoRepository<Person, Long> {

    @RestResource(path = "name")
    List<Person> findAllByNameLike(@Param("name") final String name);
}
