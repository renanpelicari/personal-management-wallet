package personal.management.wallet.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

/**
 * Person Model
 */
@Data
public class Person {

    @Id
    private Long id;

    @NotNull
    private String name;
}
