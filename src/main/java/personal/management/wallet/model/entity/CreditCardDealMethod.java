package personal.management.wallet.model.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * Credit Card Deal Method Model
 */
@Data
public class CreditCardDealMethod extends DealMethod {

    @NotNull
    private LocalDate invoiceDate;

    @NotNull
    private CreditCardFlag flag;

    private Bank relatedBank;

    private Person owner;
}
