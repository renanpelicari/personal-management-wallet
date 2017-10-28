package personal.management.wallet.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import personal.management.wallet.model.entity.CreditCardDealMethod;

/**
 * The {@link MongoRepository} for {@link CreditCardDealMethod} entity
 */
@Repository
public interface CreditCardDealMethodRepository extends MongoRepository<CreditCardDealMethod, Long> {
}
