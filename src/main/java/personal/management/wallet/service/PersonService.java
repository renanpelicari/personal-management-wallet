package personal.management.wallet.service;

import personal.management.wallet.vo.request.PersonRequestVo;
import personal.management.wallet.vo.response.PersonResponseVo;

import java.util.List;

/**
 * The Person Interface Service
 */
public interface PersonService {

    /**
     * Register new person.
     *
     * @param personRequestVo the person request vo
     */
    void registerPerson(final PersonRequestVo personRequestVo);

    /**
     * Find person list by name.
     *
     * @param name the person name like
     * @return the list of people
     */
    List<PersonResponseVo> findPeopleByNameContaining(final String name);

    /**
     * Find person by person id
     *
     * @param id the person id
     * @return the response response vo
     */
    PersonResponseVo findPersonById(final String id);
}
