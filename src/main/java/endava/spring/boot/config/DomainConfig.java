package endava.spring.boot.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("endava.spring.boot.domain")
@EnableJpaRepositories("endava.spring.boot.repos")
@EnableTransactionManagement
public class DomainConfig {
}
