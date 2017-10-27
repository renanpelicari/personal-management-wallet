package personal.management.wallet.model.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

/**
 * Credit Card Flag Model
 */
@Data
@Builder
@Document
public class CreditCardFlag {

    @NotNull
    private String name;
}
