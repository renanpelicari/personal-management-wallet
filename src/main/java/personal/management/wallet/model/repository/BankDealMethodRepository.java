package personal.management.wallet.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import personal.management.wallet.model.entity.BankDealMethod;

/**
 * {@link BankDealMethod} {@link MongoRepository}
 */
@Repository
public interface BankDealMethodRepository extends MongoRepository<BankDealMethod, Long> {
}
