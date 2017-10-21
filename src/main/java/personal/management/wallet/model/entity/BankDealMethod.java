package personal.management.wallet.model.entity;

import lombok.Data;

import java.time.LocalDate;

/**
 * Bank Deal Method
 */
@Data
public class BankDealMethod extends DealMethod {

    private LocalDate transactionDate;

    private Bank bank;
}
