package personal.management.wallet.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import personal.management.wallet.adapter.PersonAdapter;
import personal.management.wallet.model.repository.PersonRepository;
import personal.management.wallet.service.PersonService;
import personal.management.wallet.vo.request.PersonRequestVo;
import personal.management.wallet.vo.response.PersonResponseVo;

import java.util.List;

/**
 * The implementation of {@link PersonService}
 */
@Slf4j
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    /**
     * Instantiates a new Person service.
     *
     * @param personRepository the {@link PersonRepository} injection
     */
    public PersonServiceImpl(final PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    /**
     * @see PersonService#registerPerson
     */
    @Override
    public void registerPerson(final PersonRequestVo personRequestVo) {
        log.debug("BEGIN registerPerson personRequestVo={}", personRequestVo);
        personRepository.save(PersonAdapter.voToModel(personRequestVo));
        log.debug("END registerPerson.");
    }

    /**
     * @see PersonService#findPeopleByNameContaining
     */
    @Override
    public List<PersonResponseVo> findPeopleByNameContaining(final String name) {
        log.debug("BEGIN findPersonById, name={}", name);
        final List<PersonResponseVo> response =
            PersonAdapter.modelToVo(personRepository.findAllByFullNameContainingIgnoreCase(name));
        log.debug("END findPersonById, ");
        return response;
    }

    /**
     * @see PersonService#findPersonById
     */
    @Override
    public PersonResponseVo findPersonById(final String id) {
        log.debug("BEGIN findPersonById, id={}", id);
        final PersonResponseVo response = PersonAdapter.modelToVo(personRepository.findById(id).orElse(null));
        log.debug("END findPersonById, ");
        return response;
    }

}
