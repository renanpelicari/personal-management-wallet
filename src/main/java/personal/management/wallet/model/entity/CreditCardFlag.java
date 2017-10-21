package personal.management.wallet.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

/**
 * Credit Card Flag Model
 */
@Data
public class CreditCardFlag {

    @NotNull
    private String name;
}
