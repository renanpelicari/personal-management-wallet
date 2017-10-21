package personal.management.wallet.rest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import personal.management.wallet.model.entity.CreditCardDealMethod;

import java.util.List;

/**
 * {@link CreditCardDealMethod} {@link MongoRepository}
 */
@RepositoryRestResource(collectionResourceRel = "creditCardDealMethod", path = "creditCardsDealMethod",
    itemResourceRel = "creditCardDealMethod")
public interface CreditCardDealMethodRestRepository extends MongoRepository<CreditCardDealMethod, Long> {

    @RestResource(path = "flagName")
    List<CreditCardDealMethod> findAllByFlagName(@Param("flagName") final String flagName);

    @RestResource(path = "description")
    List<CreditCardDealMethod> findAllByDescriptionLike(@Param("description") final String description);

    @RestResource(path = "bankName")
    List<CreditCardDealMethod> findAllByRelatedBankName(@Param("bankName") final String bankName);
}
