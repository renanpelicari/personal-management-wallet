package personal.management.wallet.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.NonFinal;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

/**
 * Deal Method Entity
 */
@Data
@Builder
@Document
@NonFinal
@AllArgsConstructor
@NoArgsConstructor
public class DealMethod {

    @Id
    private Long id;

    @NotNull
    private String name;

    private String description;
}
