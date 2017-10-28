package personal.management.wallet.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import personal.management.wallet.model.entity.CreditCardFlag;

/**
 * The {@link MongoRepository} and {@link CrudRepository} for {@link CreditCardFlag} entity
 */
@Repository
public interface CreditCardFlagRepository extends MongoRepository<CreditCardFlag, String>,
    CrudRepository<CreditCardFlag, String> {
}
