package personal.management.wallet.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import personal.management.wallet.service.impl.CreditCardFlagServiceImpl;
import personal.management.wallet.vo.response.CreditCardFlagResponseVo;

import java.util.List;

/**
 * Rest Controller for {@link personal.management.wallet.model.entity.CreditCardFlag}
 */
@Slf4j
@RestController
@Api(value = "api-creditcard-flag")
@RequestMapping(value = "/application/api/creditcard/flag", produces = MediaType.APPLICATION_JSON_VALUE)
public class CreditCardFlagController {

    private final CreditCardFlagServiceImpl creditCardFlagService;

    /**
     * Instantiates a new Credit card flag controller.
     *
     * @param creditCardFlagService the credit card flag service
     */
    public CreditCardFlagController(final CreditCardFlagServiceImpl creditCardFlagService) {
        this.creditCardFlagService = creditCardFlagService;
    }

    /**
     * Register new credit card flag
     *
     * @param name the flag name
     */
    @PostMapping(value = "/{name}")
    @ApiOperation(value = "Register new credit card flag", nickname = "register")
    public void register(@PathVariable final String name) {
        log.debug("BEGIN register, name={}", name);
        creditCardFlagService.register(name);
        log.debug("END register.");
    }

    /**
     * Find all credit card flags
     *
     * @return the list with credit card flags
     */
    @GetMapping(value = "/find-all")
    @ApiOperation(value = "Find all credit card flags", nickname = "findAll")
    public List<CreditCardFlagResponseVo> findAll() {
        log.debug("BEGIN findAll.");
        final List<CreditCardFlagResponseVo> response = creditCardFlagService.findAll();
        log.debug("END findAll, response={}", response);
        return response;
    }

    /**
     * Delete a credit card flag
     *
     * @param name the flag name
     */
    @DeleteMapping(value = "/{name}")
    @ApiOperation(value = "Delete a credit card flag", nickname = "delete")
    public void delete(@PathVariable final String name) {
        log.debug("BEGIN delete, name={}", name);
        creditCardFlagService.delete(name);
        log.debug("END delete.");
    }
}
