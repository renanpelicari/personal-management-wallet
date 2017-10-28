package personal.management.wallet.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * Bank Deal Entity
 */
@Data
@Document
@EqualsAndHashCode(callSuper = true)
public class BankDealMethod extends DealMethod {

    @NotNull
    private Bank bank;

    @NotNull
    private LocalDate transactionDate;
}
