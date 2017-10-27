package personal.management.wallet.model.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

/**
 * Bank Deal Method
 */
@Data
@Document
public class BankDealMethod extends DealMethod {

    private LocalDate transactionDate;

    private Bank bank;
}
