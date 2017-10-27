package personal.management.wallet.model.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

/**
 * Bank Model
 */
@Data
@Builder
@Document
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
