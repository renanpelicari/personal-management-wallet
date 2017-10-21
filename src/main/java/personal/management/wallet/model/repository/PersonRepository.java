package personal.management.wallet.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import personal.management.wallet.model.entity.DealMethod;
import personal.management.wallet.model.entity.Person;

/**
 * {@link Person} {@link MongoRepository}
 */
public interface PersonRepository extends MongoRepository<Person, Long> {
}
