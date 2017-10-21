package personal.management.wallet.rest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import personal.management.wallet.model.entity.Bank;

import java.util.List;

/**
 * {@link Bank} {@link MongoRepository}
 */
@RepositoryRestResource(collectionResourceRel = "bank", path = "banks", itemResourceRel = "bank")
public interface BankRestRepository extends MongoRepository<Bank, Long> {

    @RestResource(path = "name")
    List<Bank> findAllByNameLike(@Param("name") final String name);
}
