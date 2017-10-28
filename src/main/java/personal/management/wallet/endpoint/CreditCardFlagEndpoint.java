package personal.management.wallet.endpoint;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;
import personal.management.wallet.model.entity.CreditCardFlag;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Experimental Endpoint (SpringBoot 2 and Actuator)
 * Not working properly so long
 */
@Component
@Endpoint(id = "/api/v2/creditcard/flag")
@Api(value = "api-v2-creditcard-flag")
public class CreditCardFlagEndpoint {

    private final Map<String, CreditCardFlag> creditCardFlag = new ConcurrentHashMap<>();

    CreditCardFlagEndpoint() {
    }

    @WriteOperation
    @ApiOperation(value = "Register new credit card flag", nickname = "register")
    public void registerCreditCardFlag(@Selector final String name) {
        creditCardFlag.put(name, CreditCardFlag.builder().name(name).build());
    }

    @ReadOperation
    @ApiOperation(value = "Find all credit card flag", nickname = "findAll")
    public List<CreditCardFlag> findAll() {
        return new ArrayList<>(this.creditCardFlag.values());
    }
}
