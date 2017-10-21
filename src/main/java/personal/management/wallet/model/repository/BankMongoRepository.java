package personal.management.wallet.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import personal.management.wallet.model.entity.Bank;

/**
 * {@link Bank} {@link MongoRepository}
 */
public interface BankMongoRepository extends MongoRepository<Bank, Long> {
}
