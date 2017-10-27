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
 * The Person Response VO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("PersonResponse")
@JsonDeserialize(builder = PersonResponseVo.PersonResponseVoBuilder.class)
public class PersonResponseVo {

    @ApiParam(value = "Person ID")
    private String id;

    @ApiParam(value = "Full fullName")
    private String fullName;

    /**
     * Support to Jackson deserialization.
     */
    @JsonPOJOBuilder(withPrefix = "")
    public static final class PersonResponseVoBuilder {
    }

}
