package personal.management.wallet.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import personal.management.wallet.service.impl.PersonServiceImpl;
import personal.management.wallet.vo.request.PersonRequestVo;
import personal.management.wallet.vo.response.PersonResponseVo;

import javax.validation.Valid;
import java.util.List;

/**
 * Rest Controller for Person
 */
@Slf4j
@RestController
@Api(value = "api-person")
@RequestMapping(value = "/api/person", produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonController {

    private PersonServiceImpl personService;

    /**
     * Instantiates a new Person controller.
     *
     * @param personService the {@link PersonServiceImpl} injection
     */
    public PersonController(final PersonServiceImpl personService) {
        this.personService = personService;
    }

    /**
     * Register person.
     *
     * @param params the {@link PersonRequestVo}
     */
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Register new person", nickname = "register")
    public void register(@Valid @ModelAttribute final PersonRequestVo params) {
        log.debug("BEGIN registerPerson, params={}", params);
        personService.registerPerson(params);
        log.debug("END registerPerson.");
    }

    /**
     * Find Person by ID
     *
     * @param id the person id
     * @return the person response vo
     */
    @GetMapping(value = "/find/id/{id}")
    @ApiOperation(value = "Find person by id", nickname = "findById")
    public PersonResponseVo findById(@PathVariable final String id) {
        log.debug("BEGIN findById, id={}", id);
        final PersonResponseVo response = personService.findPersonById(id);
        log.debug("END findById, response={}.", response);
        return response;
    }

    /**
     * Find People by Name Containing
     *
     * @param name the name like
     * @return the person response vo list
     */
    @GetMapping(value = "/find/name/{name}")
    @ApiOperation(value = "Find people by name containing", nickname = "findByNameContaining")
    public List<PersonResponseVo> findByNameContaining(@PathVariable final String name) {
        log.debug("BEGIN findByNameContaining, name={}", name);
        final List<PersonResponseVo> response = personService.findPeopleByNameContaining(name);
        log.debug("END findByNameContaining, response={}.", response);
        return response;
    }
}
