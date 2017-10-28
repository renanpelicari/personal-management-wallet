package personal.management.wallet.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import personal.management.wallet.model.entity.DealMethod;

/**
 * The {@link MongoRepository} for {@link DealMethod} entity
 */
@Repository
public interface DealMethodRepository extends MongoRepository<DealMethod, Long> {
}
