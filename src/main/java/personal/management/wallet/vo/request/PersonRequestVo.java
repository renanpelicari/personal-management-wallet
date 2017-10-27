package personal.management.wallet.vo.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * The Person Request VO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("PersonRequest")
@JsonDeserialize(builder = PersonRequestVo.PersonRequestVoBuilder.class)
public class PersonRequestVo {

    @NotNull
    @ApiParam(value = "Full fullName", required = true)
    private String fullName;

    /**
     * Support to Jackson deserialization.
     */
    @JsonPOJOBuilder(withPrefix = "")
    public static final class PersonRequestVoBuilder {
    }

}
