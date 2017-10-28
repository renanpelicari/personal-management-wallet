package personal.management.wallet.adapter;

import personal.management.wallet.model.entity.CreditCardFlag;
import personal.management.wallet.vo.response.CreditCardFlagResponseVo;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Adapter for {@link CreditCardFlagResponseVo} and {@link CreditCardFlag}
 */
public class CreditCardFlagAdapter {

    /**
     * Convert {@link CreditCardFlag} model to {@link CreditCardFlagResponseVo}
     *
     * @param model the CreditCardFlag model
     * @return the CreditCardFlagResponseVo
     */
    public static CreditCardFlagResponseVo modelToVo(final CreditCardFlag model) {
        return CreditCardFlagResponseVo.builder().name(model.getName()).build();
    }

    /**
     * Convert list of {@link CreditCardFlag} model to {@link CreditCardFlagResponseVo} list
     *
     * @param models the CreditCardFlag model list
     * @return the CreditCardFlagResponseVo list
     */
    public static List<CreditCardFlagResponseVo> modelToVo(final List<CreditCardFlag> models) {
        return models.stream().map(CreditCardFlagAdapter::modelToVo).collect(Collectors.toList());
    }
}
