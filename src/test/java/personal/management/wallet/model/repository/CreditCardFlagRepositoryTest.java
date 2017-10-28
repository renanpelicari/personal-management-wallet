package personal.management.wallet.model.repository;

import com.lordofthejars.nosqlunit.annotation.UsingDataSet;
import com.lordofthejars.nosqlunit.core.LoadStrategyEnum;
import com.lordofthejars.nosqlunit.mongodb.MongoDbRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import personal.management.wallet.model.entity.CreditCardFlag;

import java.util.Optional;

import static com.lordofthejars.nosqlunit.mongodb.MongoDbRule.MongoDbRuleBuilder.newMongoDbRule;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CreditCardFlagRepositoryTest {

    @Rule
    public MongoDbRule mongoDbRule = newMongoDbRule().defaultSpringMongoDb("demo-test");

    /**
     * NOSql Tests requirement
     */
    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private CreditCardFlagRepository creditCardFlagRepository;

    @Test
    @UsingDataSet(locations = {"classpath:fixtures/product-address-fixtures.sql"},
        loadStrategy = LoadStrategyEnum.CLEAN_INSERT)
    public void testFindById() {
        Optional<CreditCardFlag> creditCardFlag = creditCardFlagRepository.findById("Alelo");
        assertNotNull(creditCardFlag);
    }
}
