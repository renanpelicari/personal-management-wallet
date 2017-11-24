package personal.management.wallet.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

/**
 * Person Entity
 */
@Data
@Builder
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    private ObjectId id;

    @NotNull
    private String fullName;
}
