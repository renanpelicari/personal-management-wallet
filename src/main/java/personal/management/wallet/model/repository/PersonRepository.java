package personal.management.wallet.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import personal.management.wallet.model.entity.Person;

import java.util.HashSet;

/**
 * {@link Person} {@link MongoRepository}
 */
@Repository
public interface PersonRepository extends MongoRepository<Person, String>, CrudRepository<Person, String> {

    /**
     * Find list of person that contains name like searched
     *
     * @param name the name like
     * @return the list of person
     */
    HashSet<Person> findAllByFullNameContainingIgnoreCase(final String name);
}
