package personal.management.wallet.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import personal.management.wallet.model.entity.DealMethod;

/**
 * {@link DealMethod} {@link MongoRepository}
 */
public interface DealMethodRepository extends MongoRepository<DealMethod, Long> {
}
