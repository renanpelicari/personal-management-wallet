package personal.management.wallet.rest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import personal.management.wallet.model.entity.BankDealMethod;

import java.util.List;

/**
 * {@link BankDealMethod} {@link MongoRepository}
 */
@RepositoryRestResource(collectionResourceRel = "bankDealMethod", path = "banksDealMethod",
    itemResourceRel = "bankDealMethod")
public interface BankDealMethodRestRepository extends MongoRepository<BankDealMethod, Long> {

    @RestResource(path = "name")
    List<BankDealMethod> findAllByNameLike(@Param("name") final String name);
}
