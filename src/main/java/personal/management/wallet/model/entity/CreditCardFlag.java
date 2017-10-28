package personal.management.wallet.model.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

/**
 * Credit Card Flag Entity
 */
@Data
@Builder
@Document
public class CreditCardFlag {

    @NotNull
    @Indexed(unique = false)
    private String name;
}
