package personal.management.wallet.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import personal.management.wallet.model.entity.Bank;

/**
 * The {@link MongoRepository} for {@link Bank} entity
 */
@Repository
public interface BankRepository extends MongoRepository<Bank, Long> {
}
