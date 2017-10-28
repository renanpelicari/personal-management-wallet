package personal.management.wallet.service.impl;

import org.springframework.stereotype.Service;
import personal.management.wallet.adapter.CreditCardFlagAdapter;
import personal.management.wallet.model.entity.CreditCardFlag;
import personal.management.wallet.model.repository.CreditCardFlagRepository;
import personal.management.wallet.service.CreditCardFlagService;
import personal.management.wallet.vo.response.CreditCardFlagResponseVo;

import java.util.List;

/**
 * The implementation of {@link CreditCardFlagService} interface
 * to handle with {@link CreditCardFlagRepository}
 */
@Service
public class CreditCardFlagServiceImpl implements CreditCardFlagService {

    private final CreditCardFlagRepository creditCardFlagRepository;

    public CreditCardFlagServiceImpl(final CreditCardFlagRepository creditCardFlagRepository) {
        this.creditCardFlagRepository = creditCardFlagRepository;
    }

    /**
     * @see CreditCardFlagService#register(String)
     */
    @Override
    public void register(final String name) {
        final CreditCardFlag creditCardFlag = CreditCardFlag.builder().name(name).build();
        creditCardFlagRepository.save(creditCardFlag);
    }

    /**
     * @see CreditCardFlagService#findAll()
     */
    @Override
    public List<CreditCardFlagResponseVo> findAll() {
        return CreditCardFlagAdapter.modelToVo(creditCardFlagRepository.findAll());
    }

    /**
     * @see CreditCardFlagService#delete(String)
     */
    @Override
    public void delete(final String name) {
        creditCardFlagRepository.delete(findByName(name));
    }

    private CreditCardFlag findByName(final String name) {
        return creditCardFlagRepository.findById(name).orElseThrow(() ->
            new IllegalArgumentException("Credit card flag with name " + name + " does not exists"));
    }
}
