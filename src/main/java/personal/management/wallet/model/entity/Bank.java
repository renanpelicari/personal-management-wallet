package personal.management.wallet.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

/**
 * Bank Model
 */
@Data
public class Bank {

    @Id
    private Long id;

    @NotNull
    private String name;

    private Long number;

    private String agency;

    private String accountNumber;

    private Person owner;
}
