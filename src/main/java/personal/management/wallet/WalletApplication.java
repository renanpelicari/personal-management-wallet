package personal.management.wallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Wallet Application Runner
 */
@SpringBootApplication
public class WalletApplication {

    // TODO - add I18N, New Relic (free version), Spring Cloud (Feign, Hystrix), RabbitMQ, Show Debug LOGS
    // TODO - change String id by ObjectId _id
    // TODO - config mongodb embedded for test purposes: https://springframework.guru/spring-boot-with-embedded-mongodb/
    // TODO review application yml (unecessary imports)
    public static void main(String[] args) {
        SpringApplication.run(WalletApplication.class, args);
    }
}
