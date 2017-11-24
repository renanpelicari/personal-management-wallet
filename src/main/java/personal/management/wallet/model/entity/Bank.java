package personal.management.wallet.model.entity;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

/**
 * Bank Entity
 */
@Data
@Builder
@Document
public class Bank {

    @Id
    private ObjectId id;

    @NotNull
    private String name;

    private Long number;

    private String agency;

    private String accountNumber;

    private Person owner;
}
