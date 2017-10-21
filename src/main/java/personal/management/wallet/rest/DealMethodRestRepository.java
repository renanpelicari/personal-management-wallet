package personal.management.wallet.rest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import personal.management.wallet.model.entity.DealMethod;

import java.util.List;

/**
 * {@link DealMethod} {@link MongoRepository}
 */
@RepositoryRestResource(collectionResourceRel = "dealMethod", path = "dealsMethod", itemResourceRel = "dealMethod")
public interface DealMethodRestRepository extends MongoRepository<DealMethod, Long> {

    @RestResource(path = "name")
    List<DealMethod> findAllByNameLike(@Param("name") final String name);

    @RestResource(path = "description")
    List<DealMethod> findAllByDescriptionLike(@Param("description") final String description);
}
