package personal.management.wallet.vo.response;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Credit Card Flag Response VO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("CreditCardFlagResponse")
@JsonDeserialize(builder = CreditCardFlagResponseVo.CreditCardFlagResponseVoBuilder.class)
public class CreditCardFlagResponseVo {

    @ApiParam(value = "Credit card flag name")
    private String name;

    /**
     * Support to Jackson deserialization.
     */
    @JsonPOJOBuilder(withPrefix = "")
    public static final class CreditCardFlagResponseVoBuilder {
    }

}
