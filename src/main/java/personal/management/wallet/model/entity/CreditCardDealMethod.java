package personal.management.wallet.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * Credit Card Deal Method Entity
 */
@Data
@Document
@EqualsAndHashCode(callSuper = true)
public class CreditCardDealMethod extends DealMethod {

    @NotNull
    private LocalDate invoiceDate;

    @NotNull
    private CreditCardFlag flag;

    private Bank relatedBank;

    private Person owner;
}
