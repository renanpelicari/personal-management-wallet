package personal.management.wallet.service;

import personal.management.wallet.vo.response.CreditCardFlagResponseVo;

import java.util.List;

/**
 * The Credit Card Flag Interface Service
 */
public interface CreditCardFlagService {

    /**
     * Register new credit card flag
     *
     * @param name the flag name
     */
    void register(final String name);

    /**
     * Find all credit card flag
     *
     * @return the list of credit card flag
     */
    List<CreditCardFlagResponseVo> findAll();

    /**
     * Delete a credit card flag
     *
     * @param name the flag name
     */
    void delete(String name);
}
