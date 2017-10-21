package personal.management.wallet.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * Deal Method Model
 */
@Data
public class DealMethod {

    @Id
    private Long id;

    @NotNull
    private String name;

    private String description;
}
